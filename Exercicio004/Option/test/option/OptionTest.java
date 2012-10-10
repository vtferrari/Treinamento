package option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class OptionTest {

    public String retornadorDeNull(String nome) {
        Option<String> o = Option.of(nome);
        return o.orNull();
    }

    @Test
    public void testaSeOptionSabeQueRetornoDeveSer2() {
        List<Option<String>> listaDeOptions = new ArrayList<>();
        
        listaDeOptions.add(Option.of(retornadorDeNull("Vinicius")));
        listaDeOptions.add(Option.of(retornadorDeNull(null)));
        listaDeOptions.add(Option.of(retornadorDeNull("Temoteo")));
        listaDeOptions.add(Option.of(retornadorDeNull("")));
        listaDeOptions.add(Option.of(retornadorDeNull(null)));
        listaDeOptions.add(Option.of(retornadorDeNull("Ferrari")));
        
        List<String> l = Option.valuesOf(listaDeOptions);
        
        ArrayList<String> a = new ArrayList<>();
        a.add("Vinicius");
        a.add("Temoteo");
        a.add("");
        a.add("Ferrari");
        assertEquals(a, l);

    }
    
    @Test
    public void fibonacciRecursaoOption(){
        
    }
    

    
}