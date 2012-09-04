package superlinguagem;

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
        lista.add(new Negrito());
        lista.add(new Italico());
        lista.add(new Sublinhado());
        lista.add(new Lista());

        try {
            Recurseitor.percorreLista(lista);
        } catch (IndexOutOfBoundsException e) {
        }
        

        return Recurseitor.html;
    }

}
