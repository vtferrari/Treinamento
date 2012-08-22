package editorhtml;

class AbreEFechaIguais implements Transforma {
    private String de;
    private String para;

    public AbreEFechaIguais(String de, String para) {
        this.de = de;
        this.para = para;
    }
    
    
    
    @Override
    public String transformar(String html) {
        if (html.contains(de.replace("\\", ""))) {
            return transformar(html.replaceFirst(de, "<"+para+">").replaceFirst(de, "</"+para+">"));
        }
        return html;
    }
}
