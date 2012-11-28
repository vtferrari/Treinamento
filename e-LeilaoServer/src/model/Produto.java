package model;

import java.io.Serializable;

public class Produto implements Serializable {

    private long id;
    private long IdLote;
    private String nome;
    private String descricao;
    private float valorMinimo;
    private String imagem;
    private boolean ativo;

    public Produto() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        Produto o = (Produto) obj;
        return getId() == o.getId();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdLote() {
        return IdLote;
    }

    public void setIdLote(long loteId) {
        this.IdLote = loteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(float valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}