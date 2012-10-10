/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package option;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class SomeTest {

    @Test
    public void testaSeOptionSabeQueRetornoDeveSer2() {
        Option valor = Option.of(1 + 1);
        assertEquals(2, valor.get());
    }

    @Test
    public void testaSeOptionSabeQueRetornoDeveSer4() {
        Option valor = Option.of(2 + 2);
        assertEquals(4, valor.get());
    }

    @Test
    public void testaSeOptionSabeQueRetornoGetOrElseDeveSer9() {
        Option valor = Option.of(9);
        assertEquals(9, valor.getOrElse(0));
    }

    @Test
    public void testaSeOptionSabeQueRetornoGetOrElseDeveSer0() {
        Option valor = Option.of(null);
        assertEquals(0, valor.getOrElse(0));
        assertEquals(true, valor instanceof None);
    }

    @Test
    public void testaSeOptionSabeQueRetornoFilterIgualA3DeveSerSomeEValorIgualA4() {
        int a = 3;
        Option valor = Option.of(a);
        assertEquals(true, valor.filter(a == 4) instanceof None);
        a = 4;
        valor = Option.of(a);
        assertEquals(true, valor.filter(a == 4) instanceof Some);

        assertEquals(4, valor.get());

    }

    @Test
    public void testaSeOptionSabeQueRetornoFilterDiferenteA3DeveSerSomeEValorIgualA3() {
        int a = 4;
        Option valor = Option.of(a);
        assertEquals(true, valor.filterNot(a == 4) instanceof None);
        a = 3;
        valor = Option.of(a);
        assertEquals(true, valor.filterNot(a == 4) instanceof Some);
        assertEquals(3, valor.get());

    }
    
    
}