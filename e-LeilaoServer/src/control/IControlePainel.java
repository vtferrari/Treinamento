package control;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Lance;
import model.Lote;
import model.Produto;
import model.Usuario;

public interface IControlePainel extends Remote {

    public List<Produto> listarProdutos() throws RemoteException;

    public List<Lote> listarLote() throws RemoteException;

    public List<Usuario> listarUsuario() throws RemoteException;

    public List<Lance> listarLance() throws RemoteException;

    public boolean excluirProdutos(String id) throws RemoteException;

    public boolean excluirLote(String id) throws RemoteException;

    public boolean excluirUsuario(String id) throws RemoteException;

    public boolean inserirProdutos(Produto p) throws RemoteException;

    public boolean inserirLote(Lote l) throws RemoteException;

    public boolean inserirUsuario(Usuario p) throws RemoteException;

    public boolean alterarProdutos(Produto p) throws RemoteException;

    public boolean alterarLote(Lote l) throws RemoteException;

    public boolean alterarUsuario(Usuario p) throws RemoteException;

    public void iniciarLote(String id) throws RemoteException;

    public void encerrarLote(String id) throws RemoteException;

    public void encerrar() throws RemoteException;
}
