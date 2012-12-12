package builder;

import beam.Filme;
import java.util.Date;

public class BuildeFilme {

    long id;
    private String titulo;
    private String genero;
    private String classificacao;
    private Date lancamento;

    public BuildeFilme withId(long id) {
        this.id = id;
        return this;
    }

    public BuildeFilme withGenero(String genero) {
        this.genero = genero;
        return this;
    }

    public BuildeFilme withTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public BuildeFilme withClassificacao(String classificacao) {
        this.classificacao = classificacao;
        return this;
    }

    public BuildeFilme withLancamento(Date lancamento) {
        this.lancamento = lancamento;
        return this;
    }

    public Filme buildeFilme() {
        return new Filme(this.id, this.titulo, this.genero, this.classificacao, this.lancamento);
    }
}