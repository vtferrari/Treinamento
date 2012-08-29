package terreno;

import org.junit.*;
import static org.junit.Assert.*;
import robozinho.RobotEsperto;

public class TerrenoTest {

    @Test
    public void testeCriaTerrenoDoisPorDois() {
        int[][] terreno={{0,0},
                         {0,0}};
        assertEquals(terreno,new Terreno(2).getTerreno());
    }
    @Test
    public void testeCriaTerrenoQuatroPorQuatro() {
        int[][] terreno={{0,0,0,0},
                         {0,0,0,0},
                         {0,0,0,0},
                         {0,0,0,0}};
        assertEquals(terreno,new Terreno(4).getTerreno());
    }
    @Test
    public void testeCriaTerreno10Por10() {
        int[][] terreno={
                         {0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0}
        };
        assertEquals(terreno,new Terreno(10).getTerreno());
    }

}