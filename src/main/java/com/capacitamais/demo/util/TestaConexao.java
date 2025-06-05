package com.capacitamais.demo.util;

import com.capacitamais.demo.util.ConnectionFactory;
import java.sql.Connection;

public class TestaConexao {
    public static void main(String[] args) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            if (conn != null) {
                System.out.println("✅ Conexão com o banco realizada com sucesso!");
            } else {
                System.out.println("❌ Falha na conexão com o banco.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
