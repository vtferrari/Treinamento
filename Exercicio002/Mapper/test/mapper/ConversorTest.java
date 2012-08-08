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
        Conversor c = new Conversor();

        Integer i = 65;
        assertEquals(Integer.class, i.getClass());

        String s = c.intParaString(i);
        assertEquals(String.class, s.getClass());
    }
    
    @Test
    public void testSeORetornoEInteger() {
        Conversor c = new Conversor();

        String i = "1";
        assertEquals(String.class, i.getClass());

        Integer s = c.stringParaInt(i);
        assertEquals(Integer.class, s.getClass());
    }
    
    @Test
    public void testSeIntVirouListaString() {
        Conversor c = new Conversor();
        List l = new ArrayList();
        l.add(1);
        
        List<String> s = c.mapear(l);
        assertEquals(String.class, s.get(0).getClass());
    }
    
    @Test
    public void testSeStringVirouListaInt() {
        Conversor c = new Conversor();
        List<String> l = new ArrayList();
        l.add("1");
        
        List<String> s = c.mapear(l);
        assertEquals(Integer.class, s.get(0).getClass());
    }
    
    
    
}