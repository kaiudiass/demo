package com.capacitamais.demo.dao;

import com.capacitamais.demo.model.Matricula;
import com.capacitamais.demo.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class MatriculaDAO {

    public void inserir(Matricula matricula) {
        String sql = "INSERT INTO Matricula (id_matricula, data_matricula, status_matricula, id_user, id_projeto) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, matricula.getIdMatricula());
            stmt.setDate(2, Date.valueOf(matricula.getDataMatricula()));
            stmt.setString(3, matricula.getStatusMatricula());
            stmt.setInt(4, matricula.getIdUser());
            stmt.setInt(5, matricula.getIdProjeto());

            stmt.executeUpdate();
            System.out.println("Matrícula inserida com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao inserir matrícula: " + e.getMessage());
        }
    }

    public List<Matricula> listarPorUsuario(int idUser) {
        List<Matricula> matriculas = new ArrayList<>();
        String sql = "SELECT * FROM Matricula WHERE id_user = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idUser);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Matricula m = new Matricula(
                        rs.getInt("id_matricula"),
                        rs.getDate("data_matricula").toLocalDate(),
                        rs.getString("status_matricula"),
                        rs.getInt("id_user"),
                        rs.getInt("id_projeto")
                );
                matriculas.add(m);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao listar matrículas do usuário: " + e.getMessage());
        }

        return matriculas;
    }
}
