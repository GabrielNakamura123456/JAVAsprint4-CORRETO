package service;

import dao.EquipeDAO;
import model.Equipe;

import java.util.List;

public class EquipeService {
    private EquipeDAO dao = new EquipeDAO();

    public void cadastrarEquipe(Equipe equipe) throws IllegalArgumentException {
        if (equipe.getSeveridade() == null || equipe.getSeveridade().isEmpty()) {
            throw new IllegalArgumentException("Severidade não pode ser vazia.");
        }

        dao.inserir(equipe);
    }

    public List<Equipe> listarEquipes() {
        return dao.listarTodos();
    }
}