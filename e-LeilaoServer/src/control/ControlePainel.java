package control;

import dao.DAO;
import dao.LanceDAO;
import dao.LoteDAO;
import dao.ProdutoDAO;
import dao.UsuarioDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;
import model.Lance;
import model.Lote;
import model.Produto;
import model.Usuario;

public class ControlePainel extends UnicastRemoteObject implements IControlePainel {

    public ControlePainel() throws RemoteException {
        super();
    }

    public List listar(DAO control) {
        List listar = null;
        try {
            listar = control.listar();
        } catch (SQLException ex) {
        }
        return listar;
    }

    public boolean excluir(String id, DAO control, Object o) {
        try {
            return control.deletar(o);
        } catch (SQLException ex) {
        }
        return false;
    }

    public boolean inserir(DAO control, Object o) {
        try {
            return control.inserir(o);
        } catch (SQLException ex) {
        }
        return false;
    }

    public boolean alterar(DAO control, Object o) {
        try {
            return control.alterar(o);
        } catch (SQLException ex) {
        }
        return false;
    }

    @Override
    public List<Produto> listarProdutos() {
        return listar(new ProdutoDAO());
    }

    @Override
    public List<Lote> listarLote() {
        return listar(new LoteDAO());
    }

    @Override
    public List<Usuario> listarUsuario() {
        return listar(new UsuarioDAO());
    }

    @Override
    public List<Lance> listarLance() {
        return listar(new LanceDAO());
    }

    @Override
    public boolean excluirProdutos(String id) {
        Produto p = new Produto();
        p.setId(Long.parseLong(id));
        return excluir(id, new ProdutoDAO(), p);
    }

    @Override
    public boolean excluirLote(String id) {
        Lote l = new Lote();
        l.setId(Long.parseLong(id));
        return excluir(id, new LoteDAO(), l);
    }

    @Override
    public boolean excluirUsuario(String id) {
        Usuario u = new Usuario();
        u.setId(Long.parseLong(id));
        return excluir(id, new UsuarioDAO(), u);
    }

    @Override
    public boolean inserirProdutos(Produto p) {
        return inserir(new ProdutoDAO(), p);
    }

    @Override
    public boolean inserirLote(Lote l) {
        return inserir(new LoteDAO(), l);
    }

    @Override
    public boolean inserirUsuario(Usuario p) {
        return inserir(new UsuarioDAO(), p);
    }

    @Override
    public boolean alterarProdutos(Produto p) {
        return alterar(new ProdutoDAO(), p);
    }

    @Override
    public boolean alterarLote(Lote l) {
        return alterar(new LoteDAO(), l);
    }

    @Override
    public boolean alterarUsuario(Usuario p) {
        return alterar(new UsuarioDAO(), p);
    }

    @Override
    public void iniciarLote(String id) throws RemoteException {
        try {
            ControleLeilao cl = new ControleLeilao();
            Lote l = new Lote();
            l.setId(Long.parseLong(id));
            cl.iniciarLeilao(l);
        } catch (SQLException ex) {
        }
    }

    @Override
    public void encerrarLote(String id) {
        try {
            ControleLeilao cl = new ControleLeilao();
            Lote l = new Lote();
            l.setId(Long.parseLong(id));
            cl.desativarLeilao(l);
        } catch (Exception ex) {
        }
    }

    @Override
    public void encerrar() throws RemoteException {
        try {
            ControleLeilao cl = new ControleLeilao();
            cl.encerrarLeilao();
        } catch (Exception ex) {
        }
    }
}
