package model;

public class Equipamentos {
    private int idEquipamento;
    private char operacional;
    private String localizacao;

    public Equipamentos(int idEquipamento, char operacional, String localizacao) {
        this.idEquipamento = idEquipamento;
        this.operacional = operacional;
        this.localizacao = localizacao;
    }

    public int getIdEquipamento() { return idEquipamento; }
    public void setIdEquipamento(int idEquipamento) { this.idEquipamento = idEquipamento; }

    public char getOperacional() { return operacional; }
    public void setOperacional(char operacional) { this.operacional = operacional; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
}