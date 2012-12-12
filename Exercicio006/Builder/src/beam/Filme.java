package beam;

import java.util.Date;

public class Filme {

    private final long id;
    private final String titulo;
    private final String genero;
    private final String classificacao;
    private final Date lancamento;

    public Filme(long id, String titulo, String genero, String classificacao, Date lancamento) {
        this.id = id;
        this.classificacao = classificacao;
        this.genero = genero;
        this.titulo = titulo;
        this.lancamento = lancamento;
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public Date getLancamento() {
        return lancamento;
    }
}
