package com.capacitamais.demo.dao;



import com.capacitamais.demo.model.Projeto;
import com.capacitamais.demo.util.ConnectionFactory;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProjetoDAO {

    public void inserir(Projeto projeto) {
        String sql = "INSERT INTO Projetos (id_projeto, nome, descricao, data_inicio, data_criacao, data_limite, status, local, duracao, vagas) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, projeto.getIdProjeto());
            stmt.setString(2, projeto.getNome());
            stmt.setString(3, projeto.getDescricao());
            stmt.setDate(4, Date.valueOf(projeto.getDataInicio()));
            stmt.setDate(5, Date.valueOf(projeto.getDataCriacao()));
            stmt.setDate(6, Date.valueOf(projeto.getDataLimite()));
            stmt.setString(7, projeto.getStatus());
            stmt.setString(8, projeto.getLocal());
            stmt.setInt(9, projeto.getDuracao());
            stmt.setInt(10, projeto.getVagas());

            stmt.executeUpdate();
            System.out.println("Projeto inserido com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao inserir projeto: " + e.getMessage());
        }
    }

    public List<Projeto> listarTodos() {
        List<Projeto> projetos = new ArrayList<>();
        String sql = "SELECT * FROM Projetos";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Projeto projeto = new Projeto(
                        rs.getInt("id_projeto"),
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        rs.getDate("data_inicio").toLocalDate(),
                        rs.getDate("data_criacao").toLocalDate(),
                        rs.getDate("data_limite").toLocalDate(),
                        rs.getString("status"),
                        rs.getString("local"),
                        rs.getInt("duracao"),
                        rs.getInt("vagas")
                );
                projetos.add(projeto);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao listar projetos: " + e.getMessage());
        }

        return projetos;
    }
}

