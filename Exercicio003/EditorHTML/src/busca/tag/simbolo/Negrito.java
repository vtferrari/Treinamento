package busca.tag.simbolo;

import superlinguagem.BuscaTagSPL;

public class Negrito implements BuscaTagSPL{

    @Override
    public String converteParaHTML(String html) {
         return html.replaceFirst("//", "<i>").replaceFirst("//", "</i>");
    }
    
}
