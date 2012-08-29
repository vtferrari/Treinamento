package robozinho;

import org.junit.*;
import static org.junit.Assert.*;

public class ControleRemotoTest {

    @Test
    public void testSeRoboSabeAndar() {
        ControleRemoto c = new ControleRemoto();
        int[][] retorno={{1,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0}};        
        assertArrayEquals(retorno, c.subir(3));
    }
    
    @Test
    public void testSeRoboSabeVirarADireita() {
        ControleRemoto c = new ControleRemoto();
        int[][] retorno={{0,0,0,1,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0}};        
        assertArrayEquals(retorno, c.andarDireita(3));
    }
    @Test
    public void testSeRoboSabeVirarAEsquerda() {
        ControleRemoto c = new ControleRemoto();
        int[][] retorno={{1,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0}};        
        assertArrayEquals(retorno, c.andarEsquerda(3));
    }
    @Test
    public void testSeRoboSabeVirarADescer() {
        ControleRemoto c = new ControleRemoto();
        int[][] retorno={{0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {1,0,0,0,0},
                         {0,0,0,0,0}};        
        assertArrayEquals(retorno, c.descer(3));
    }
}
