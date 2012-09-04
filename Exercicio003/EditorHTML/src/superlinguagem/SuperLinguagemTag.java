package superlinguagem;

import busca.tag.simbolo.BuscaTagSPL;
import busca.tag.simbolo.TagColchetes;
import busca.tag.simbolo.TagAtributada;
import java.util.ArrayList;
import java.util.List;
import superlinguagem.recurseitor.Recurseitor;

public class SuperLinguagemTag implements SuperLinguagem {
 
    @Override
    public String paraHTML(String html){
        Recurseitor.html = html;
        
        List<BuscaTagSPL> lista = new ArrayList<>();
        
        lista.add(new TagAtributada("image", "img"));
        lista.add(new TagColchetes("b"));
        lista.add(new TagColchetes("u"));
        lista.add(new TagColchetes("i"));
        
        try {
            Recurseitor.percorreLista(lista);
        } catch (IndexOutOfBoundsException e) {
        }
        
        return Recurseitor.html;
    }
    
}
