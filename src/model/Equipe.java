package model;

import java.time.LocalDateTime;

public class Equipe {
    private int idEquipe;
    private LocalDateTime dataHora;
    private String severidade;
    private String localizacao;

    public Equipe(int idEquipe, LocalDateTime dataHora, String severidade, String localizacao) {
        this.idEquipe = idEquipe;
        this.dataHora = dataHora;
        this.severidade = severidade;
        this.localizacao = localizacao;
    }

    public int getIdEquipe() { return idEquipe; }
    public void setIdEquipe(int idEquipe) { this.idEquipe = idEquipe; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public String getSeveridade() { return severidade; }
    public void setSeveridade(String severidade) { this.severidade = severidade; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
}