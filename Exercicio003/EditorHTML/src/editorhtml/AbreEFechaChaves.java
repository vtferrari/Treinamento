package editorhtml;

public class AbreEFechaChaves implements Transforma{
    
    private String seletor;

    public AbreEFechaChaves(String seletor) {
        this.seletor = seletor;
    }
    
    @Override
    public String transformar(String html) {
        return html.replace("["+seletor+"]", "<"+seletor+">")
                   .replace("[/"+seletor+"]", "</"+seletor+">");
    }
    
}
