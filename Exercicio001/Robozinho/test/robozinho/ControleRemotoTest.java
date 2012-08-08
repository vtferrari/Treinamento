/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package robozinho;

import org.junit.*;
import static org.junit.Assert.*;

public class ControleRemotoTest {

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
    @Test
    public void testSeRoboSabeVirarAEsquerda() {
        ControleRemoto c = new ControleRemoto();
        assertEquals("virar para esquerda", c.virarEsquerda());
    }
}
