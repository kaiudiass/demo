package com.capacitamais.demo.dao;


import com.capacitamais.demo.model.Gerenciar;
import com.capacitamais.demo.util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciarDAO {

    public void inserir(Gerenciar gerenciar) {
        String sql = "INSERT INTO Gerenciar (id_processo, id_projeto, id_cidade) VALUES (?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, gerenciar.getIdProcesso());
            stmt.setInt(2, gerenciar.getIdProjeto());
            stmt.setInt(3, gerenciar.getIdCidade());

            stmt.executeUpdate();
            System.out.println("Relação cidade-projeto criada com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao criar relação cidade-projeto: " + e.getMessage());
        }
    }

    public List<Gerenciar> listarPorCidade(int idCidade) {
        List<Gerenciar> lista = new ArrayList<>();
        String sql = "SELECT * FROM Gerenciar WHERE id_cidade = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idCidade);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Gerenciar g = new Gerenciar(
                        rs.getInt("id_processo"),
                        rs.getInt("id_projeto"),
                        rs.getInt("id_cidade")
                );
                lista.add(g);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao listar projetos da cidade: " + e.getMessage());
        }

        return lista;
    }
}

