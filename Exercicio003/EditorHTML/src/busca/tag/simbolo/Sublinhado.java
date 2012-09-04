
package busca.tag.simbolo;

import superlinguagem.BuscaTagSPL;


public class Sublinhado implements BuscaTagSPL {

    @Override
    public String converteParaHTML(String html) {
        return html.replaceFirst("\\*\\*", "<b>").replaceFirst("\\*\\*", "</b>");
    }

}
