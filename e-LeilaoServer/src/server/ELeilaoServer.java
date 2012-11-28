package server;

import control.ControleCadastro;
import control.ControleLeilao;
import control.ControlePainel;
import control.IControleCadastro;
import control.IControleLeilao;
import control.IControlePainel;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ELeilaoServer {

    public static void main(String[] args) {
        try {
            ELeilaoServer.publicarObjeto();
            System.out.print("Servidor ativo...");
        } catch (RemoteException | MalformedURLException ex) {
            Logger.getLogger(ELeilaoServer.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("CLASSE  : " + ELeilaoServer.class.getName());
            System.out.println("EXCEÇÃO : " + ex);
            System.out.println("MENSAGEM: " + ex.getMessage());
        }
    }

    public static void publicarObjeto() throws RemoteException, MalformedURLException {

        IControleCadastro cadastro = new ControleCadastro();
        IControleLeilao leilao = new ControleLeilao();
        IControlePainel painel = new ControlePainel();
        LocateRegistry.createRegistry(9999);
        Naming.rebind("rmi://localhost:9999/Cadastro", cadastro);
        Naming.rebind("rmi://localhost:9999/Leilao", leilao);
        Naming.rebind("rmi://localhost:9999/Painel", painel);

    }
}
