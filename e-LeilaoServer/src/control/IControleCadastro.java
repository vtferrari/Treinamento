package control;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import model.Lote;
import model.Produto;
import model.Usuario;

public interface IControleCadastro extends Remote{

    public boolean cadastrarUsuario(Usuario o) throws SQLException, RemoteException;

    public boolean verificar(Usuario cadastrado) throws SQLException, RemoteException;

    public Usuario autenticar(String usuario, String senha) throws SQLException, RemoteException ;
}
