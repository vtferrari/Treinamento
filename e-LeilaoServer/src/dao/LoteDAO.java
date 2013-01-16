package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Lote;
import model.Produto;

public class LoteDAO implements DAO {

    String sql;
    String tabela = "lote";
    int i;

    @Override
    public boolean inserir(Object o) throws SQLException {
        Lote u = (Lote) o;

        sql = "INSERT INTO " + tabela + " (descricao , ativacao_tempo, limite_tempo, ativo) VALUES (?, ?, ?, ?) ;";

        PreparedStatement pst = preparaSQL(u, sql);
        if (pst.executeUpdate() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean alterar(Object o) throws SQLException {
        Lote u = (Lote) o;

        sql = "UPDATE " + tabela + " SET descricao = ?, ativacao_tempo = ?, limite_tempo = ?, ativo = ? WHERE id = ? ;";
        PreparedStatement pst = Conexao.getConexao().prepareStatement(sql);
        i=0;
        pst.setLong(++i, u.getId());
        if (pst.executeUpdate() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deletar(Object o) throws SQLException {
        Lote u = (Lote) o;

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

    private PreparedStatement preparaSQL(Lote u, String sql) throws SQLException {
        PreparedStatement pst = Conexao.getConexao().prepareStatement(sql);
        i = 0;
        pst.setString(++i, u.getDescricao());
        pst.setTimestamp(++i, u.getAtivacaoTempo());
        pst.setTimestamp(++i, u.getLimiteTempo());
        pst.setBoolean(++i, u.isAtivo());
        return pst;
    }

    private List consulta(PreparedStatement pst) throws SQLException {
        ArrayList<Lote> lotes = new ArrayList();

        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            Lote u = new Lote();
            u.setId(rs.getLong("id"));
            u.setAtivo(rs.getBoolean("ativo"));
            u.setDescricao(rs.getString("descricao"));
            u.setAtivacaoTempo(rs.getTimestamp("ativacao_tempo"));
            u.setLimiteTempo(rs.getTimestamp("limite_tempo"));
            u.setProdutos((ArrayList<Produto>) new ProdutoDAO().consultar(" id_lote = " + rs.getLong("id")));
            lotes.add(u);
        }
        return lotes;
    }
}
