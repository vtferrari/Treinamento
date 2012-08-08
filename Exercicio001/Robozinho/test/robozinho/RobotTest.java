package robozinho;

import org.junit.*;
import static org.junit.Assert.*;

public class RobotTest {
    
    @Test
    public void testeSeRobotObedeceComandoAndar(){
        Robot r = new Robot();
        assertEquals("andar", r.comando(new Andar()));
    }
    
    @Test
    public void testeSeRobotObedeceComandoVirarADireita(){
        Robot r = new Robot();
        assertEquals("virar para direita", r.comando(new Direita()));
    }
    @Test
    public void testeSeRobotObedeceComandoVirarAEsquerda(){
        Robot r = new Robot();
        assertEquals("virar para esquerda", r.comando(new Esquerda()));
    }
}
