package server;

import dao.LoteDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Lote;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LotesEmLeilaoTest {

    List<Lote> l;

    @Before
    public void setUp() {
        try {
            l = new LoteDAO().listar();
        } catch (SQLException ex) {
        }
    }

    @Test
    public void testBancoLotes() {

        assertFalse("Lote ATIVO",l.get(0).isAtivo());
        assertFalse("Produto ATIVO",l.get(0).getProdutos().get(0).isAtivo());
        assertFalse("Produto ATIVO",l.get(0).getProdutos().get(1).isAtivo());
    }

    @Test
    public void testAdicionarLote() {
        for (Lote lote : l) {
            LotesEmLeilao.adicionarLote(lote);
        }
        for (Lote lote : l) {
            LotesEmLeilao.adicionarLote(lote);
        }
        assertEquals(2, LotesEmLeilao.getLotesEmLeilao().size());
        assertTrue(LotesEmLeilao.getLotesEmLeilao().get(0).isAtivo());
        assertTrue(LotesEmLeilao.getLotesEmLeilao().get(0).getProdutos().get(0).isAtivo());
        assertTrue(LotesEmLeilao.getLotesEmLeilao().get(0).getProdutos().get(1).isAtivo());
    }
}
