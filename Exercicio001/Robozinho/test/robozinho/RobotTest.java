package robozinho;

import org.junit.*;
import static org.junit.Assert.*;
import terreno.Terreno;

public class RobotTest {

    @Test
    public void testeSeRobotObedeceComandoAndar() {
        RobotEsperto r = new RobotEsperto();
        Terreno t = new Terreno(5);
        int[][] retorno={{1,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0}};
        
        assertEquals(retorno, r.comando(new MovimentoCima(3), t));
    }

    @Test
    public void testeSeRobotObedeceComandoVirarADireita() {
        RobotEsperto r = new RobotEsperto();
        Terreno t = new Terreno(5);
        int[][] retorno={{0,0,0,1,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0}};
        assertArrayEquals(retorno, r.comando(new MovimentoDireita(3), t));
    }

    @Test
    public void testeSeRobotObedeceComandoVirarAEsquerda() {
        RobotEsperto r = new RobotEsperto();
        Terreno t = new Terreno(5);
        int[][] retorno={{1,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0}};
        assertArrayEquals(retorno, r.comando(new MovimentoEsquerda(3), t));
    }
}
