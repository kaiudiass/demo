package com.capacitamais.demo.model;



public class Cidade {
    private int idCidade;
    private String representante;
    private String email;
    private String senha;
    private String uf;

    public Cidade() {}

    public Cidade(int idCidade, String representante, String email, String senha, String uf) {
        this.idCidade = idCidade;
        this.representante = representante;
        this.email = email;
        this.senha = senha;
        this.uf = uf;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
