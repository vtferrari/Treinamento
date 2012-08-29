package superlinguagem;

class SimboloLista implements BuscaSimboloSPL {

    @Override
    public String converteParaHTML(String html) {
        String[] lista = html.split("\\* ");
        String ul = "<ul>";
        for (int i = 1; i < lista.length; i++) {
            ul = ul + "<li>" + lista[i].trim() + "</li>";
        }
        ul+="</ul>";
        if(html.matches(".*\\* .*")){
            return ul;
        }
        return html;
    }
}
