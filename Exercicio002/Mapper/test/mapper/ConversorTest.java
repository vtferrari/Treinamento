package mapper;

import java.util.ArrayList;
import java.util.List;
import org.hamcrest.core.IsInstanceOf;
import org.hamcrest.core.IsSame;
import org.junit.*;
import static org.junit.Assert.*;

public class ConversorTest {

    @Test
    public void testSeORetornoEString() {
        ControleConversor c = new ControleConversor();
        assertEquals("1",c.intParaString(1));
    }
    
    @Test
    public void testSeORetornoEInteger() {
        ControleConversor c = new ControleConversor();
        assertEquals(1, c.stringParaInt("1"));
    }
    
    @Test
    public void testSeORetornoEChar() {
        ControleConversor c = new ControleConversor();
        assertEquals('A', c.intParaChar(65));
    }
    
    @Test
    public void testSeORetornoEInt() {
        ControleConversor c = new ControleConversor();
        int i = c.charParaInt('A');
        assertEquals(65, i);
    }

    @Test
    public void testSeGatoVirouLebre() {
        ControleConversor c = new ControleConversor();
        Gato hugo = new Gato();
        Lebre i = c.gatoParaLebre(hugo);
        assertEquals(Lebre.class, i.getClass());
    }
    
    @Test
    public void testSeIntVirouListaString() {
        ControleConversor c = new ControleConversor();
        List l = new ArrayList();
        l.add(1);
        Mapper<Integer,String> m = new IntParaString();
        assertEquals("1", c.mapear(l,m).get(0));
    }
    
    @Test
    public void testSeMaperFuncionaStringVirouListaInt() {
        ControleConversor c = new ControleConversor();
        List l = new ArrayList();
        l.add("1");
        Mapper<String,Integer> m = new StringParaInt();
        assertEquals(1, c.mapear(l,m).get(0));
    }    
    
    
}