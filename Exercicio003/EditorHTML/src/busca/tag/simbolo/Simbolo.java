package busca.tag.simbolo;

public class Simbolo implements BuscaTagSPL {

    private final String de;
    private final String para;

    public Simbolo(String de, String para) {
        this.de = de;
        this.para = para;
    }

    @Override
    public String converteParaHTML(String html) {
        if (html.contains(de.replace("\\", ""))) {
            return converteParaHTML(
                    html.replaceFirst(de, "<" + para + ">").replaceFirst(de, "</" + para + ">"));
        }
        return html;

    }
}