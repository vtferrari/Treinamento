package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Tibere Silva de Lima
 */
public class Conexao {
    
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String status = "Não conectou...";    
    private static String serverName = "localhost";
    private static String mydatabase = "eleilao";
    private static String username = "root";
    private static String password = "";
    
    public static Connection getConexao() {
        
        Connection connection = null;

        try {

            Class.forName(driverName);
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            connection = DriverManager.getConnection(url, username, password);
            
            if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            return connection;

        } catch (ClassNotFoundException e) {
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
        } catch (SQLException e) {            
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }
    }
   
    public static String getStatus() {
        return status;
    }
    
    public static boolean FecharConexao() {

        try {
            Conexao.getConexao().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static Connection ReiniciarConexao() {

        FecharConexao();
        return getConexao();

    }
}
