package busca.tag.simbolo;

import superlinguagem.BuscaTagSPL;

public class TagColchetes implements BuscaTagSPL{
    
    private String seletor;

    public TagColchetes(String seletor) {
        this.seletor = seletor;
    }
    
    @Override
    public String converteParaHTML(String html) {
        return html.replace("["+seletor+"]", "<"+seletor+">")
                   .replace("[/"+seletor+"]", "</"+seletor+">");
    }
    
}
