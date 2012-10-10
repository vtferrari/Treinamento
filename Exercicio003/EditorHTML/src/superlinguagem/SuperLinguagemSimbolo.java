package superlinguagem;

import busca.tag.simbolo.BuscaTagSPL;
import superlinguagem.recurseitor.Recurseitor;
import busca.tag.simbolo.*;
import java.util.ArrayList;
import java.util.List;

public class SuperLinguagemSimbolo implements SuperLinguagem {
    private String html;

    @Override
    public String paraHTML(String html) {
        Recurseitor.html = html;
        List<BuscaTagSPL> lista = new ArrayList<>();

        lista.add(new LinkMascara());
        lista.add(new LinkSimples());
        lista.add(new Simbolo("\\*\\*", "b"));
        lista.add(new Simbolo("//", "i"));
        lista.add(new Simbolo("__", "u"));
        lista.add(new TagLista());

        try {
            Recurseitor.percorreLista(lista);
        } catch (IndexOutOfBoundsException e) {
        }
        
        
        return Recurseitor.html;
    }

}
