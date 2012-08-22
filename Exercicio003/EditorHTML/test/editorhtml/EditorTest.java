package editorhtml;

import static org.junit.Assert.*;
import org.junit.Test;

public class EditorTest {

    @Test
    public void testeSeOEditorAchaPadraoParaComverterEmTagUViniciusU() {
        Editor edit = new Editor();
        String transformado = edit.trasformar("[u]Vinicius[/u]");
        assertEquals("<u>Vinicius</u>", transformado);
    }

    @Test
    public void testeSeOEditorAchaPadraoParaComverterEmTagUFerrariU() {
        Editor edit = new Editor();
        String transformado = edit.trasformar("[u]Ferrari[/u]");
        assertEquals("<u>Ferrari</u>", transformado);
    }

    @Test
    public void testeSeOEditorAchaPadraoParaComverterEmTagBViniciusB() {
        Editor edit = new Editor();
        String transformado = edit.trasformar("[b]Vinicius[/b]");
        assertEquals("<b>Vinicius</b>", transformado);
    }

    @Test
    public void testeSeOEditorAchaPadraoParaComverterEmTagBFerrariB() {
        Editor edit = new Editor();
        String transformado = edit.trasformar("[b]Ferrari[/b]");
        assertEquals("<b>Ferrari</b>", transformado);
    }

    @Test
    public void testeSeOEditorAchaPadraoParaComverterEmTagIViniciusI() {
        Editor edit = new Editor();
        String transformado = edit.trasformar("[i]Vinicius[/i]");
        assertEquals("<i>Vinicius</i>", transformado);
    }

    @Test
    public void testeSeOEditorAchaPadraoParaComverterEmTagIFerrariI() {
        Editor edit = new Editor();
        String transformado = edit.trasformar("[i]Ferrari[/i]");
        assertEquals("<i>Ferrari</i>", transformado);
    }

    @Test
    public void testeSeOEditorAchaPadraoParaComverterEmTagUumBexemploIqualquerIBU() {
        Editor edit = new Editor();
        String transformado = edit.trasformar("[u]um [b]exemplo [i]qualquer[/i][/b][/u]");
        assertEquals("<u>um <b>exemplo <i>qualquer</i></b></u>", transformado);
    }

    @Test
    public void testeSeOEditorAchaPadraoParaComverterEmTag__Ferrari__() {
        Editor edit = new Editor();
        String transformado = edit.trasformar("__Ferrari__");
        assertEquals("<u>Ferrari</u>", transformado);
    }

    @Test
    public void testeSeOEditorAchaPadraoParaComverterEmTag__Viniciu_____Ferrari__() {
        Editor edit = new Editor();
        String transformado = edit.trasformar("__Vinicius____Ferrari__");
        assertEquals("<u>Vinicius</u><u>Ferrari</u>", transformado);
    }

    @Test
    public void testeSeOEditorAchaPadraoParaComverterEmTagBarraBarraFerrariBarraBarra() {
        Editor edit = new Editor();
        String transformado = edit.trasformar("//Ferrari//");
        assertEquals("<i>Ferrari</i>", transformado);
    }

    @Test
    public void testeSeOEditorAchaPadraoParaComverterEmTagBarraBarraViniciuBarraBarraFerrariBarraBarra() {
        Editor edit = new Editor();
        String transformado = edit.trasformar("//Vinicius////Ferrari//");
        assertEquals("<i>Vinicius</i><i>Ferrari</i>", transformado);
    }

    @Test
    public void testeSeOEditorAchaPadraoParaComverterEmTagAsteriscoAsteriscoFerrariAsteriscoAsterisco() {
        Editor edit = new Editor();
        String transformado = edit.trasformar("**Ferrari**");
        assertEquals("<b>Ferrari</b>", transformado);
    }

}