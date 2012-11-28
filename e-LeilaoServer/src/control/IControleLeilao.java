package control;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import model.Lote;
import model.Usuario;

public interface IControleLeilao extends Remote {

    public void iniciarLeilao(Lote lote) throws SQLException, RemoteException;

    public void desativarLeilao(Lote lote) throws RemoteException;

    public void encerrarLeilao() throws SQLException, RemoteException;

    public List<Lote> obterItensEmLeilao() throws RemoteException;

    public void iniciarContagem(Lote lote) throws InterruptedException, ParseException, RemoteException;

    public String contadorRegressivo(Lote lote) throws RemoteException;

    public boolean efetuarLance(String valor, String idProduto, Usuario usuario) throws RemoteException;
}
