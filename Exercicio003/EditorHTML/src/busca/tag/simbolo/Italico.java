
package busca.tag.simbolo;

import superlinguagem.BuscaTagSPL;


public class Italico implements BuscaTagSPL {

    @Override
    public String converteParaHTML(String html) {
        return html.replaceFirst("__", "<u>").replaceFirst("__", "</u>");
    }

}
