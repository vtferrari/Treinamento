package mapper;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

public class MapearTest {

 
    @Test
    public void testSeListaStringVirouListaInt() {
        List l = new ArrayList();
        l.add("1");
        l.add("2");
        l.add("3");
        Mapper<String,Integer> m = new StringParaInt();
        
        Mapear mapear = new Mapear();
        assertEquals(1, mapear.mapear(l,m).get(0));
        assertEquals(2, mapear.mapear(l,m).get(1));
        assertEquals(3, mapear.mapear(l,m).get(2));
    }  

 
    @Test
    public void testSeListaIntVirouListaString() {
        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        Mapper<Integer,String> m = new IntParaString();
        
        Mapear mapear = new Mapear();
        assertEquals("1", mapear.mapear(l,m).get(0));
        assertEquals("2", mapear.mapear(l,m).get(1));
        assertEquals("3", mapear.mapear(l,m).get(2));
    }  

 
    @Test
    public void testSeListaGatoVirouListaLebre() {
        List l = new ArrayList();
        l.add(new Gato());
        l.add(new Gato());
        l.add(new Gato());
        Mapper<Gato,Lebre> m = new GatoParaLebre();
        
        Mapear mapear = new Mapear();
        assertEquals(Lebre.class, mapear.mapear(l,m).get(0).getClass());
        assertEquals(Lebre.class, mapear.mapear(l,m).get(1).getClass());
        assertEquals(Lebre.class, mapear.mapear(l,m).get(2).getClass());
    }  
    
}