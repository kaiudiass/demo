package com.capacitamais.demo.model;

import java.time.LocalDate;

public class Matricula {
    private int idMatricula;
    private LocalDate dataMatricula;
    private String statusMatricula;
    private int idUser;
    private int idProjeto;

    public Matricula() {}

    public Matricula(int idMatricula, LocalDate dataMatricula, String statusMatricula, int idUser, int idProjeto) {
        this.idMatricula = idMatricula;
        this.dataMatricula = dataMatricula;
        this.statusMatricula = statusMatricula;
        this.idUser = idUser;
        this.idProjeto = idProjeto;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(String statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }
}
