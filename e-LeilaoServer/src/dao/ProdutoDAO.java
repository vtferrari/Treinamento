package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Produto;

public class ProdutoDAO implements DAO {

    String sql;
    String tabela = "produto";
    int i;

    @Override
    public boolean inserir(Object o) throws SQLException {
        Produto u = (Produto) o;

        sql = "INSERT INTO " + tabela + " (descricao, nome, valor_minimo, image, id_lote, ativo) VALUES (?, ?, ?, ?, ?, ?) ;";

        PreparedStatement pst = preparaSQL(u, sql);
        if (pst.executeUpdate() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean alterar(Object o) throws SQLException {
        Produto u = (Produto) o;

        sql = "UPDATE " + tabela + " SET descricao = ?,  nome = ?, valor_minimo = ?, image = ?, id_lote = ?, ativo = ? WHERE id = ? ;";
        PreparedStatement pst = preparaSQL(u, sql);
        pst.setLong(++i, u.getId());
        System.out.println(
        pst.toString());
        if (pst.executeUpdate() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deletar(Object o) throws SQLException {
        Produto u = (Produto) o;
        sql = "DELETE FROM " + tabela + " WHERE id = ?  ;";
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
        sql = "SELECT * FROM " + tabela + " WHERE " + criterio + ";";
        PreparedStatement pst = Conexao.getConexao().prepareStatement(sql);

        return consulta(pst);
    }

    @Override
    public List listar() throws SQLException {
        sql = "SELECT * FROM " + tabela + ";";
        PreparedStatement pst = Conexao.getConexao().prepareStatement(sql);
        return consulta(pst);
    }

    private PreparedStatement preparaSQL(Produto u, String sql) throws SQLException {
        PreparedStatement pst = Conexao.getConexao().prepareStatement(sql);
        i = 0;
        pst.setString(++i, u.getDescricao());
        pst.setString(++i, u.getNome());
        pst.setFloat(++i, u.getValorMinimo());
        pst.setString(++i, u.getImagem());
        pst.setLong(++i, u.getIdLote());
        pst.setBoolean(++i, u.isAtivo());

        return pst;
    }

    private List consulta(PreparedStatement pst) throws SQLException {
        ArrayList<Produto> produtos = new ArrayList();
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            Produto u = new Produto();
            u.setId(rs.getLong("id"));
            u.setDescricao(rs.getString("descricao"));
            u.setNome(rs.getString("nome"));
            u.setValorMinimo(rs.getFloat("valor_minimo"));
            u.setImagem(rs.getString("image"));
            u.setIdLote(rs.getLong("id_lote"));
            u.setAtivo(rs.getBoolean("ativo"));
            
            produtos.add(u);
        }
        return produtos;
    }
}
