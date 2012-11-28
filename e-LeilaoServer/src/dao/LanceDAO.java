package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Lance;
import model.Produto;
import model.Usuario;

public class LanceDAO implements DAO {

    String sql;
    String tabela = "lance";
    int i;

    @Override
    public boolean inserir(Object o) throws SQLException {
        Lance u = (Lance) o;
        sql = "INSERT INTO " + tabela + " (id_usuario, id_produto, valor_lance, data_lance) VALUES (?, ?, ?, ?) ;";
        PreparedStatement pst = preparaSQL(u, sql);
        if (pst.executeUpdate() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean alterar(Object o) throws SQLException {
        Lance u = (Lance) o;

        sql = "UPDATE " + tabela + " SET id_produto = ?,  id_usuario = ?, valor_lance = ?, data_lance = ? WHERE id = ? ;";

        PreparedStatement pst = preparaSQL(u, sql);
        pst.setLong(++i, u.getId());
        if (pst.executeUpdate() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deletar(Object o) throws SQLException {
        Lance u = (Lance) o;
        sql = "DELETE FROM " + tabela + " WHERE id = ? ;";
        PreparedStatement pst = Conexao.getConexao().prepareStatement(sql);
        i=0;
        pst.setLong(++i, u.getId());
        if (pst.executeUpdate() > 0) {
            return true;
        }

        return false;
    }

    @Override
    public List consultar(String criterio) throws SQLException {
        sql = "SELECT * FROM " + tabela + " WHERE " + criterio + " ;";
        PreparedStatement pst = Conexao.getConexao().prepareStatement(sql);
        return consulta(pst);
    }

    @Override
    public List listar() throws SQLException {
        sql = "SELECT * FROM " + tabela + " ;";
        PreparedStatement pst = Conexao.getConexao().prepareStatement(sql);
        i = 0;
        pst.setString(++i, tabela);
        return consulta(pst);
    }

    private PreparedStatement preparaSQL(Lance u, String sql) throws SQLException {
        PreparedStatement pst = Conexao.getConexao().prepareStatement(sql);
        i = 0;
        pst.setLong(++i, u.getUsuario().getId());
        pst.setLong(++i, u.getProduto().getId());
        pst.setFloat(++i, u.getValor());
        pst.setTimestamp(++i, u.getData());

        return pst;
    }

    private List consulta(PreparedStatement pst) throws SQLException {
        ArrayList<Lance> lances = new ArrayList();

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Lance u = new Lance();
            u.setId(rs.getLong("id"));
            u.setProduto((Produto) new ProdutoDAO().consultar(" id = " + rs.getString("id_produto")).get(0));
            u.setUsuario((Usuario) new UsuarioDAO().consultar(" id = " + rs.getString("id_usuario")).get(0));
            u.setValor(rs.getFloat("valor"));
            u.setData(rs.getTimestamp("data_lance"));

            lances.add(u);
        }
        return lances;
    }
}
