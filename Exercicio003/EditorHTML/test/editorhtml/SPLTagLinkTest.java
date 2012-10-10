package editorhtml;

import busca.tag.simbolo.BuscaTagSPL;
import busca.tag.simbolo.LinkMascara;
import busca.tag.simbolo.LinkSimples;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SPLTagLinkTest {

    @Test
    public void testeSeCriaTagslink() {
        BuscaTagSPL transforma = new LinkSimples();
        String transformado = transforma.converteParaHTML("http://www.google.com");
        assertEquals("<a href=\"http://www.google.com\">http://www.google.com</a>", transformado);
    }

    @Test
    public void testeSeCriaTagslinkSeguro() {
        BuscaTagSPL transforma = new LinkSimples();
        String transformado = transforma.converteParaHTML("https://www.google.com");
        assertEquals("<a href=\"https://www.google.com\">https://www.google.com</a>", transformado);
    }

    @Test
    public void testeSeCriaTagslinkFTP() {
        BuscaTagSPL transforma = new LinkSimples();
        String transformado = transforma.converteParaHTML("ftp://www.google.com");
        assertEquals("<a href=\"ftp://www.google.com\">ftp://www.google.com</a>", transformado);
    }

    @Test
    public void testeSeCriaTagslinkComMascara() {
        BuscaTagSPL edit = new LinkMascara();
        String transformado = edit.converteParaHTML("[http://www.google.com](Google)");
        assertEquals("<a href=\"http://www.google.com\">Google</a>", transformado);
    }
}