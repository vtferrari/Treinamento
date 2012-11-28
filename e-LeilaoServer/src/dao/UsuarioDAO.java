package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class UsuarioDAO implements DAO {

    String sql;
    String tabela = "usuario";
    int i;

    @Override
    public boolean inserir(Object o) throws SQLException {
        Usuario u = (Usuario) o;

        sql = "INSERT INTO " + tabela + " (cpf, nome, email, senha, nivel) VALUES (?, ?, ?, ?, ?) ;";

        PreparedStatement pst = preparaSQL(u, sql);
        if (pst.executeUpdate() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean alterar(Object o) throws SQLException {
        Usuario u = (Usuario) o;

        sql = "UPDATE " + tabela + " SET cpf = ?,  nome = ?, email = ?, senha = ?, nivel = ? WHERE id = ? ;";

        PreparedStatement pst = preparaSQL(u, sql);
        pst.setLong(++i, u.getId());
        if (pst.executeUpdate() > 0) {
            return true;
        }

        return false;
    }

    @Override
    public boolean deletar(Object o) throws SQLException {
        Usuario u = (Usuario) o;

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
        return consulta(pst);
    }

    private PreparedStatement preparaSQL(Usuario u, String sql) throws SQLException {
        PreparedStatement pst = Conexao.getConexao().prepareStatement(sql);
        i = 0;
        pst.setString(++i, u.getCpf());
        pst.setString(++i, u.getNome());
        pst.setString(++i, u.getEmail());
        pst.setString(++i, u.getSenha());
        pst.setString(++i, u.getNivel());

        return pst;
    }

    private List consulta(PreparedStatement pst) throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList();

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Usuario u = new Usuario();
            u.setId(rs.getLong("id"));
            u.setCpf(rs.getString("cpf"));
            u.setEmail(rs.getString("email"));
            u.setNome(rs.getString("nome"));
            u.setSenha(rs.getString("senha"));
            u.setNivel(rs.getString("nivel"));
            usuarios.add(u);
        }
        return usuarios;
    }
}
