package com.capacitamais.demo.dao;



import com.capacitamais.demo.model.Cidade;
import com.capacitamais.demo.util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CidadeDAO {

    public void inserir(Cidade cidade) {
        String sql = "INSERT INTO Cidade (id_cidade, representante, email, senha, uf) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, cidade.getIdCidade());
            stmt.setString(2, cidade.getRepresentante());
            stmt.setString(3, cidade.getEmail());
            stmt.setString(4, cidade.getSenha());
            stmt.setString(5, cidade.getUf());

            stmt.executeUpdate();
            System.out.println("Cidade inserida com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao inserir cidade: " + e.getMessage());
        }
    }

    public Cidade buscarPorEmailESenha(String email, String senha) {
        String sql = "SELECT * FROM Cidade WHERE email = ? AND senha = ?";
        Cidade cidade = null;

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cidade = new Cidade(
                        rs.getInt("id_cidade"),
                        rs.getString("representante"),
                        rs.getString("email"),
                        rs.getString("senha"),
                        rs.getString("uf")
                );
            }

        } catch (SQLException e) {
            System.err.println("Erro ao buscar cidade: " + e.getMessage());
        }

        return cidade;
    }

    public List<Cidade> listarTodas() {
        List<Cidade> cidades = new ArrayList<>();
        String sql = "SELECT * FROM Cidade";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Cidade cidade = new Cidade(
                        rs.getInt("id_cidade"),
                        rs.getString("representante"),
                        rs.getString("email"),
                        rs.getString("senha"),
                        rs.getString("uf")
                );
                cidades.add(cidade);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao listar cidades: " + e.getMessage());
        }

        return cidades;
    }
}