package superlinguagem;

public class SimboloCaracter implements BuscaSimboloSPL {
    private String de;
    private String para;

    public SimboloCaracter(String de, String para) {
        this.de = de;
        this.para = para;
    }
    
    @Override
    public String converteParaHTML(String html) {
        if (html.contains(de.replace("\\", "")) && !html.matches(".*(http|https|ftp).*\\.[a-zA-Z]*.*")){
            return converteParaHTML(html.replaceFirst(de, "<"+para+">").replaceFirst(de, "</"+para+">"));
        }
        return html;
    }
}
