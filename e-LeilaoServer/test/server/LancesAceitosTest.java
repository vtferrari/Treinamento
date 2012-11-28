package server;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Lance;
import model.Produto;
import model.Usuario;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LancesAceitosTest {

    Produto p;
    Usuario u,u1;

    @Before
    public void setUp() {
        p = new Produto();
        p.setId(1);
        p.setValorMinimo(1);
        u = new Usuario();
        u.setId(1);
        u1 = new Usuario();
        u1.setId(2);
    }

    @Test
    public void testVerificarLance() {
        assertEquals(0, LancesAceitos.obterLances().size());
        Lance l = new Lance();
        l.setProduto(p);
        l.setUsuario(u);
        l.setValor(10);
        Lance l1 = new Lance();
        l1.setProduto(p);
        l1.setUsuario(u1);
        l1.setValor(11);
        Lance l2 = new Lance();
        l2.setProduto(p);
        l2.setUsuario(u);
        l2.setValor(10);
        Lance l3 = new Lance();
        l3.setProduto(p);
        l3.setUsuario(u);
        l3.setValor(11);
        
        boolean result = LancesAceitos.verificarLance(l);
        assertTrue("1Lance = 10",result);
        assertEquals(1, LancesAceitos.obterLances().size());
        result = LancesAceitos.verificarLance(l1);
        assertTrue("2Lance = 11",result);
        assertEquals(1, LancesAceitos.obterLances().size());
        result = LancesAceitos.verificarLance(l2);
        assertFalse("3Lance = 10",result);
        assertEquals(1, LancesAceitos.obterLances().size());
        result = LancesAceitos.verificarLance(l3);
        assertFalse("4Lance = 11",result);
        assertEquals(1, LancesAceitos.obterLances().size());
        
        System.out.println("valor lance vencedor "+LancesAceitos.obterLance(p).getValor());
        System.out.println("ID Usuario lance "+LancesAceitos.obterLance(p).getUsuario().getId());
        System.out.println("ID produto lance "+LancesAceitos.obterLance(p).getProduto().getId());
        System.out.println("valor produto "+LancesAceitos.obterLance(p).getProduto().getValorMinimo());
        
    }

}
