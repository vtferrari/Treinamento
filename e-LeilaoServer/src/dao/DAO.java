package dao;

import java.sql.SQLException;
import java.util.List;

public interface DAO {

    public boolean inserir(Object o) throws SQLException;

    public boolean alterar(Object o) throws SQLException;

    public boolean deletar(Object o) throws SQLException;

    public List consultar(String criterio) throws SQLException;

    public List listar() throws SQLException;
}
