package control;

import dao.DAO;
import dao.UsuarioDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;
import model.Lote;
import model.Produto;
import model.Usuario;

public class ControleCadastro extends UnicastRemoteObject implements IControleCadastro {

    public ControleCadastro() throws RemoteException {
        super();
    }

    public Usuario autenticar(String usuario, String senha) throws SQLException , RemoteException{
        DAO control = new UsuarioDAO();
        Usuario user = null;
        List<Usuario> consultar = control.consultar(" email = '" + usuario + "' AND senha = '" + senha + "' ");
        if (consultar.size() > 0) {
            user = (Usuario) consultar.get(0);
        }
        return user;
    }

    public boolean cadastrarUsuario(Usuario o) throws SQLException , RemoteException{
        DAO control = new UsuarioDAO();
        return control.inserir(o);
    }

    public boolean verificar(Usuario cadastrado) throws  RemoteException {
        try {
            DAO control = new UsuarioDAO();
            List<Usuario> consultar = control.consultar(" email = '" + cadastrado.getEmail() + "' or cpf = '" + cadastrado.getCpf() + "' ");
            if (consultar.size() > 0) {
                return false;
            }
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}
