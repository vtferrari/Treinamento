package control;

import dao.LoteDAO;
import dao.UsuarioDAO;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Lote;
import model.Usuario;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import server.LotesEmLeilao;

public class ControleLeilaoTest {

    ControleLeilao cl;
    Usuario u;
    List<Lote> l;

    @Before
    public void setUp() {
        try {
            l = new LoteDAO().listar();
            for(Lote lote : l){
                LotesEmLeilao.adicionarLote(lote);
            }
            u = (Usuario) new UsuarioDAO().consultar("id=1").get(0);
            cl = new ControleLeilao();
        } catch (Exception ex) {
        }
    }

    @Test
    public void testEfetuarLance() {
        assertEquals(2, LotesEmLeilao.getLotesEmLeilao().size());
        assertEquals(false, cl.efetuarLance("20", "1", u));
        assertEquals(true, cl.efetuarLance("250", "1", u));
        assertEquals(false, cl.efetuarLance("10", "1", u));
    }
}
