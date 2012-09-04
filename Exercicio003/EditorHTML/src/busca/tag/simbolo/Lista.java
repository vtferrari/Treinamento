package busca.tag.simbolo;

import superlinguagem.BuscaTagSPL;

public class Lista implements BuscaTagSPL {

    @Override
    public String converteParaHTML(String html) {
        if (html.matches(".*\\* .*")) {
            return circundaListaComTagLi(listaDeItens(html));
        }
        return html;
        
    }

    private String[] listaDeItens(String html) {
        return html.split("\\* ");
    }

    private String circundaListaComTagLi(String[] lista) {
        String tagLista = "<ul>";
        for (int i = 1; i < lista.length; i++) {
            tagLista = tagLista + "<li>" + lista[i].trim() + "</li>";
        }
        tagLista = tagLista + "</ul>";
        return tagLista;
    }
}
