package dao;

import model.UsuarioCliente;
import utils.ConexaoOracle;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioClienteDAO {

    public void inserir(UsuarioCliente usuario) {
        String sql = "INSERT INTO Usuario_Cliente (ID_Usuario, Nome, Email) VALUES (?, ?, ?)";

        try (Connection conn = ConexaoOracle.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, usuario.getIdUsuario());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getEmail());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<UsuarioCliente> listarTodos() {
        List<UsuarioCliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM Usuario_Cliente";

        try (Connection conn = ConexaoOracle.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                UsuarioCliente u = new UsuarioCliente(
                    rs.getInt("ID_Usuario"),
                    rs.getString("Nome"),
                    rs.getString("Email")
                );
                lista.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}