package model;

import java.sql.Timestamp;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LanceTest {
    
    public LanceTest() {
    }
    
    Lance l,l1,l2;
    Produto p,p1,p2;
    @Before
    public void setUp() {
        l = new Lance();
        l1 = new Lance();
        l2 = new Lance();
        p=new Produto();
        p1=new Produto();
        p2=new Produto();
        p.setId(1);
        p1.setId(1);
        p2.setId(2);
        l.setId(1);
        l1.setId(1);
        l2.setId(2);
        l.setValor(1);
        l1.setValor(1);
        l2.setValor(2);
        l.setProduto(p);
        l1.setProduto(p1);
        l2.setProduto(p2);
    }
    
    @Test
    public void testeEqual() {
        assertTrue(l.equals(l1));
        assertFalse(l.equals(l2));
        assertFalse(l1.equals(l2));
    }


}
