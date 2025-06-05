package com.capacitamais.demo.model;



import java.time.LocalDate;

public class Projeto {
    private int idProjeto;
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataCriacao;
    private LocalDate dataLimite;
    private String status;
    private String local;
    private int duracao;
    private int vagas;

    public Projeto() {}

    public Projeto(int idProjeto, String nome, String descricao, LocalDate dataInicio, LocalDate dataCriacao,
                   LocalDate dataLimite, String status, String local, int duracao, int vagas) {
        this.idProjeto = idProjeto;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataCriacao = dataCriacao;
        this.dataLimite = dataLimite;
        this.status = status;
        this.local = local;
        this.duracao = duracao;
        this.vagas = vagas;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
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

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }
}

