package model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class Lote implements Serializable {

    private long id;
    private String descricao;
    private List<Produto> produtos;
    private Timestamp ativacaoTempo;
    private Timestamp limiteTempo;
    private boolean ativo;

    public Lote() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        Lote o = (Lote) obj;
        return getId() == o.getId();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void addProduto(Produto p) {
        produtos.add(p);
    }

    public void removeProduto(Produto p) {
        produtos.remove(p);
    }

    public Timestamp getAtivacaoTempo() {
        return ativacaoTempo;
    }

    public void setAtivacaoTempo(Timestamp ativacaoTempo) {
        this.ativacaoTempo = ativacaoTempo;
    }

    public Timestamp getLimiteTempo() {
        return limiteTempo;
    }

    public void setLimiteTempo(Timestamp limiteTempo) {
        this.limiteTempo = limiteTempo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
