package superlinguagem;

public class SuperLinguagemTag implements SuperLinguagem {

    @Override
    public String paraHTML(String html) {

        BuscaTagSPL bold = new TagColchetes("b");
        BuscaTagSPL underline = new TagColchetes("u");
        BuscaTagSPL italic = new TagColchetes("i");
        BuscaTagSPL img = new TagAtributada("image", "img");
        
        html = bold.converteParaHTML(html);
        html = underline.converteParaHTML(html);
        html = italic.converteParaHTML(html);
        html = img.converteParaHTML(html);

        return html;
    }
}
