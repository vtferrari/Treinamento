package builder;

import beam.Filme;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BuildeFilmeTest {

    Filme f;

    @Test
    public void testGetFilme() {

        f = new BuildeFilme()
                .withClassificacao("18")
                .withGenero("genero")
                .withTitulo("titulo")
                .withLancamento(null)
                .withId(1)
                .buildeFilme();

        assertEquals("18", f.getClassificacao());
        assertEquals("genero", f.getGenero());
        assertEquals("titulo", f.getTitulo());
        assertEquals(null, f.getLancamento());
    }

    @Test
    public void testGetImutavel() {
        f = new BuildeFilme()
                .withClassificacao("10")
                .withGenero("novo")
                .withTitulo("novo")
                .withLancamento(null)
                .withId(2)
                .buildeFilme();

        assertEquals("10", f.getClassificacao());
        assertEquals("novo", f.getGenero());
        assertEquals("novo", f.getTitulo());
        assertEquals(null, f.getLancamento());
    }
}
