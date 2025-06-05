package com.capacitamais.demo.model;



public class Gerenciar {
    private int idProcesso;
    private int idProjeto;
    private int idCidade;

    public Gerenciar() {}

    public Gerenciar(int idProcesso, int idProjeto, int idCidade) {
        this.idProcesso = idProcesso;
        this.idProjeto = idProjeto;
        this.idCidade = idCidade;
    }

    public int getIdProcesso() {
        return idProcesso;
    }

    public void setIdProcesso(int idProcesso) {
        this.idProcesso = idProcesso;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }
}

