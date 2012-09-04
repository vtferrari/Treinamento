package editorhtml;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import superlinguagem.BuscaTagSPL;
import superlinguagem.SimboloLink;
import superlinguagem.SuperLinguagem;
import superlinguagem.SuperLinguagemSimbolo;

public class SPLTagLinkTest {

    @Test
    public void testeSeCriaTagslink() {
        BuscaTagSPL transforma = new SimboloLink();
        String transformado = transforma.converteParaHTML("http://www.google.com");
        assertEquals("<a href=\"http://www.google.com\">http://www.google.com</a>", transformado);
    }

    @Test
    public void testeSeCriaTagslinkSeguro() {
        BuscaTagSPL transforma = new SimboloLink();
        String transformado = transforma.converteParaHTML("https://www.google.com");
        assertEquals("<a href=\"https://www.google.com\">https://www.google.com</a>", transformado);
    }

    @Test
    public void testeSeCriaTagslinkFTP() {
        BuscaTagSPL transforma = new SimboloLink();
        String transformado = transforma.converteParaHTML("ftp://www.google.com");
        assertEquals("<a href=\"ftp://www.google.com\">ftp://www.google.com</a>", transformado);
    }

    @Test
    public void testeSeCriaTagslinkComMascara() {
        BuscaTagSPL edit = new SimboloLink();
        String transformado = edit.converteParaHTML("[http://www.google.com](Google)");
        assertEquals("<a href=\"http://www.google.com\">Google</a>", transformado);
    }
}