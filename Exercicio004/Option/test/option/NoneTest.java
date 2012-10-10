/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package option;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class NoneTest {

    @Test
    public void testaSeOptionSabeQueRetornoDeveSerNone() {
        Option valor = Option.of(null);
        assertEquals(true, valor instanceof None);
    }

    @Test
    public void testaSeOptionSabeQueRetornoFilterIgualA3DeveSerNoneEValorIgualA4() {
        int a = 4;
        Option valor = Option.of(a);
        assertEquals(true, valor.filter(a == 3) instanceof None);
        assertEquals(4, valor.get());

    }

    @Test
    public void testaSeOptionSabeQueRetornoFilterDiferenteA3DeveSerNoneEValorIgualA4() {
        int a = 4;
        Option valor = Option.of(a);
        assertEquals(true, valor.filterNot(a == 4) instanceof None);
        assertEquals(4, valor.get());

    }
}