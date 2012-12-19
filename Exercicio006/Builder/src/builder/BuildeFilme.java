package builder;

import beam.Filme;
import java.util.Date;

public class BuildeFilme {

    private final long id;
    private final String titulo;
    private final String genero;
    private final String classificacao;
    private final Date lancamento;

    public BuildeFilme() {
        this(0, null, null, null, null);
    }

    public BuildeFilme(long id, String titulo, String genero, String classificacao, Date lancamento) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.classificacao = classificacao;
        this.lancamento = lancamento;
    }

    public BuildeFilme withId(long id) {
        return new BuildeFilme( id,  titulo, genero, classificacao, lancamento);
    }

    public BuildeFilme withGenero(String genero) {
        return new BuildeFilme( id,  titulo, genero, classificacao, lancamento);
    }

    public BuildeFilme withTitulo(String titulo) {
        return new BuildeFilme( id,  titulo, genero, classificacao, lancamento);
    }

    public BuildeFilme withClassificacao(String classificacao) {
        return new BuildeFilme( id,  titulo, genero, classificacao, lancamento);
    }

    public BuildeFilme withLancamento(Date lancamento) {
        return new BuildeFilme( id,  titulo, genero, classificacao, lancamento);
    }

    public Filme buildeFilme() {
        return new Filme(id, titulo, genero, classificacao, lancamento);
    }
}