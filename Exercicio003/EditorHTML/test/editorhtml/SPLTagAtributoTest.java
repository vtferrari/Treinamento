package editorhtml;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import superlinguagem.BuscaTagSPL;
import busca.tag.simbolo.TagAtributada;

public class SPLTagAtributoTest {
    @Test
    public void testeSeCriaTagsMeta() {
        BuscaTagSPL transforma = new TagAtributada("meta", "meta");
        String transformado = transforma.converteParaHTML("[meta charset=\"UTF-8\"]");
        assertEquals("<meta charset=\"UTF-8\" />", transformado);
    }
    @Test
    public void testeSeCriaTagslink() {
        BuscaTagSPL transforma = new TagAtributada("link", "link");
        String transformado = transforma.converteParaHTML("[link rel=\"profile\" href=\"http://google.com\"]");
        assertEquals("<link rel=\"profile\" href=\"http://google.com\" />", transformado);
    }

}