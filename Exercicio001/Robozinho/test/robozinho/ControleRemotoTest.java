/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package robozinho;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Vinicius
 */
public class ControleRemotoTest {

    public ControleRemotoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSeRoboSabeAndar() {
        ControleRemoto c = new ControleRemoto();
        assertEquals("andar", c.andar());
    }
    
    @Test
    public void testSeRoboSabeVirarADireita() {
        ControleRemoto c = new ControleRemoto();
        assertEquals("virar para direita", c.virarDireita());
    }
}
