package editorhtml;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import superlinguagem.BuscaSimboloSPL;
import superlinguagem.SimboloLink;
import superlinguagem.SuperLinguagem;
import superlinguagem.SuperLinguagemSimbolo;

public class SPLTagLinkTest {

    @Test
    public void testeSeCriaTagslink() {
        BuscaSimboloSPL transforma = new SimboloLink();
        String transformado = transforma.converteParaHTML("http://www.google.com");
        assertEquals("<a href=\"http://www.google.com\">http://www.google.com</a>", transformado);
    }

    @Test
    public void testeSeCriaTagslinkSeguro() {
        BuscaSimboloSPL transforma = new SimboloLink();
        String transformado = transforma.converteParaHTML("https://www.google.com");
        assertEquals("<a href=\"https://www.google.com\">https://www.google.com</a>", transformado);
    }

    @Test
    public void testeSeCriaTagslinkFTP() {
        BuscaSimboloSPL transforma = new SimboloLink();
        String transformado = transforma.converteParaHTML("ftp://www.google.com");
        assertEquals("<a href=\"ftp://www.google.com\">ftp://www.google.com</a>", transformado);
    }

    @Test
    public void testeSeCriaTagslinkComMascara() {
        BuscaSimboloSPL edit = new SimboloLink();
        String transformado = edit.converteParaHTML("[http://www.google.com](Google)");
        assertEquals("<a href=\"http://www.google.com\">Google</a>", transformado);
    }
}