package dao;

import model.Equipe;
import utils.ConexaoOracle;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EquipeDAO {

    public void inserir(Equipe equipe) {
        String sql = "INSERT INTO Equipe (ID_Equipe, Data_Hora, Severidade, Localizacao) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexaoOracle.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, equipe.getIdEquipe());
            stmt.setTimestamp(2, Timestamp.valueOf(equipe.getDataHora()));
            stmt.setString(3, equipe.getSeveridade());
            stmt.setString(4, equipe.getLocalizacao());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Equipe> listarTodos() {
        List<Equipe> lista = new ArrayList<>();
        String sql = "SELECT * FROM Equipe";

        try (Connection conn = ConexaoOracle.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Equipe e = new Equipe(
                    rs.getInt("ID_Equipe"),
                    rs.getTimestamp("Data_Hora").toLocalDateTime(),
                    rs.getString("Severidade"),
                    rs.getString("Localizacao")
                );
                lista.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}