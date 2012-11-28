package model;

import java.io.Serializable;

public class Usuario implements Serializable {

    private long id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String nivel;

    public Usuario() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        Usuario o = (Usuario) obj;
        return getId() == o.getId();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
