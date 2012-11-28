package model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class Lance implements Serializable {

    private long id;
    private Usuario usuario;
    private Produto produto;
    private float valor;
    private Timestamp data;

    public Lance() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        Lance o = (Lance) obj;
        return getProduto().getId() == o.getProduto().getId();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }
}
