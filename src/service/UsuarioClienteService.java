package service;

import dao.UsuarioClienteDAO;
import model.UsuarioCliente;

import java.util.List;

public class UsuarioClienteService {
    private UsuarioClienteDAO dao = new UsuarioClienteDAO();

    public void cadastrarUsuario(UsuarioCliente usuario) throws IllegalArgumentException {
        if (usuario.getNome() == null || usuario.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }

        if (usuario.getEmail() == null || !usuario.getEmail().contains("@")) {
            throw new IllegalArgumentException("Email inválido.");
        }

        dao.inserir(usuario);
    }

    public List<UsuarioCliente> listarUsuarios() {
        return dao.listarTodos();
    }
}