package control;

import dao.DAO;
import dao.LanceDAO;
import dao.LoteDAO;
import dao.ProdutoDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Lance;
import model.Lote;
import model.Produto;
import model.Usuario;
import server.LancesAceitos;
import server.LotesEmLeilao;
import server.Relogio;

public class ControleLeilao extends UnicastRemoteObject implements IControleLeilao {

    public ControleLeilao() throws RemoteException {
        super();
    }

    @Override
    public void iniciarLeilao(Lote lote) throws SQLException {
        DAO control = new LoteDAO();
        List<Lote> consultar = control.consultar(" id = " + lote.getId());
        if (!consultar.isEmpty()) {
            LotesEmLeilao.adicionarLote(consultar.get(0));
        }
    }

    @Override
    public void desativarLeilao(Lote lote) {
        ArrayList itensEmLeilao = LotesEmLeilao.getLotesEmLeilao();
        for (int i = 0; i < itensEmLeilao.size(); i++) {
            Lote l = (Lote) itensEmLeilao.get(i);
            if (l.getId() == lote.getId()) {
                l.setAtivo(false);
                LotesEmLeilao.removerLote(l);
                break;
            }
        }
    }

    @Override
    public void encerrarLeilao() {
        DAO control = new LanceDAO();
        DAO produto = new ProdutoDAO();
        ArrayList<Lance> obterLances = LancesAceitos.obterLances();
        for (Lance l : obterLances) {
            try {
                l.getProduto().setAtivo(false);
                control.inserir(l);
                produto.alterar(l.getProduto());
            } catch (SQLException ex) {
                Logger.getLogger(ControleLeilao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Lote> obterItensEmLeilao() {
        return LotesEmLeilao.getLotesEmLeilao();
    }

    @Override
    public void iniciarContagem(Lote lote) {
        try {
            Relogio relogio = new Relogio();
            relogio.iniciarContagem(lote);
            new Thread(relogio).start();
            System.out.println("contando");
        } catch (InterruptedException ex) {
        } catch (ParseException ex) {
        }
    }

    @Override
    public String contadorRegressivo(Lote lote) {
        return new Relogio().contdown(lote);
    }

    @Override
    public boolean efetuarLance(String valor, String idProduto, Usuario usuario) {
        float v = Float.parseFloat(valor);
        long id = Long.parseLong(idProduto);
        Lance novoLance = new Lance();
        
        List<Lote> lista = this.obterItensEmLeilao();
        
        for (Lote lote : lista) {
            for (Produto p : lote.getProdutos()) {
                if (p.getId() == id) {
                        novoLance.setProduto(p);
                        novoLance.setUsuario(usuario);
                        novoLance.setValor(v);
                    if (LancesAceitos.verificarLance(novoLance)) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }
}
