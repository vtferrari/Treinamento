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
public class RobotTest {
    
    public RobotTest() {
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
