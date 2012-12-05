
package lazysingleton;

import beam.Filme;
import java.util.Date;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LazySingletonTest {

    private Filme filme;
    @Before
    public void setUp() {
       filme = LazySingleton.getInstancia();
       filme.setClassificacao("14");
       filme.setGenero("Drama");
       filme.setId(1);
       filme.setLancamento(new Date());
       filme.setTitulo("Poderoso Chefão");
    }

    @Test
    public void testGetnstanciaRetornaNaoNullo() {
        assertTrue(filme != null);
    }
    @Test
    public void testGetnstanciaRetornaUmFilme() {
        assertTrue(filme instanceof Filme);
    }
    @Test
    public void testGetnstanciaRetornaAmesmaInstancia() {
        assertEquals(LazySingleton.getInstancia(),filme);
    }
    @Test
    public void testInstanciaDeFilme() {
        assertEquals(LazySingleton.getInstancia(),filme);
        assertEquals("Poderoso Chefão",LazySingleton.getInstancia().getTitulo());
        filme.setTitulo("Homem haranha");
        assertEquals("Homem haranha",LazySingleton.getInstancia().getTitulo());
        assertEquals("Homem haranha",filme.getTitulo());
        
    }

}
