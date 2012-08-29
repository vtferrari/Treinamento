package superlinguagem;

public class SuperLinguagemSimbolo implements SuperLinguagem {

    @Override
    public String paraHTML(String html) {
        BuscaSimboloSPL underscore = new SimboloCaracter("__", "u");
        BuscaSimboloSPL barra = new SimboloCaracter("//", "i");
        BuscaSimboloSPL asterisco = new SimboloCaracter("\\*\\*", "b");
        BuscaSimboloSPL link = new SimboloLink();
        BuscaSimboloSPL lista = new SimboloLista();

        html = underscore.converteParaHTML(html);
        html = barra.converteParaHTML(html);
        html = asterisco.converteParaHTML(html);
        html = link.converteParaHTML(html);
        html = lista.converteParaHTML(html);

        return html;
    }
}
