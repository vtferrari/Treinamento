package editorhtml;

class Editor {

    String trasformar(String html) {
        Transforma bold = new AbreEFechaChaves("b");
        Transforma underline = new AbreEFechaChaves("u");
        Transforma italic = new AbreEFechaChaves("i");
        
        Transforma underscore = new AbreEFechaIguais("__","u");
        Transforma barra = new AbreEFechaIguais("//","i");
        Transforma asterisco = new AbreEFechaIguais("\\*\\*","b");
        
        html = bold.transformar(html);
        html = underline.transformar(html);
        html = italic.transformar(html);
        html = underscore.transformar(html);
        html = barra.transformar(html);
        html = asterisco.transformar(html);
        return html;
    }
}
