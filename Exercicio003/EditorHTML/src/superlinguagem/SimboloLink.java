package superlinguagem;

public class SimboloLink implements BuscaSimboloSPL {

    @Override
    public String converteParaHTML(String html) {
        String[] bkp = html.split("[\\[\\]\\(\\)]");
        if (html.matches(".*(http|https|ftp).*\\.[a-zA-Z]*.*")) {
            if (bkp.length == 4) {
                return "<a href=\"" + bkp[1] + "\">" + bkp[3] + "</a>";
            }
            return "<a href=\"" + html + "\">" + html + "</a>";
        }
        return html;
    }
}
