package model;

import java.time.LocalDateTime;

public class Alerta {
    private int idAlerta;
    private LocalDateTime dataHoraAlerta;
    private String status;
    private String prioridade;
    private int idUsuario;

    public Alerta(int idAlerta, LocalDateTime dataHoraAlerta, String status, String prioridade, int idUsuario) {
        this.idAlerta = idAlerta;
        this.dataHoraAlerta = dataHoraAlerta;
        this.status = status;
        this.prioridade = prioridade;
        this.idUsuario = idUsuario;
    }

    public int getIdAlerta() { return idAlerta; }
    public void setIdAlerta(int idAlerta) { this.idAlerta = idAlerta; }

    public LocalDateTime getDataHoraAlerta() { return dataHoraAlerta; }
    public void setDataHoraAlerta(LocalDateTime dataHoraAlerta) { this.dataHoraAlerta = dataHoraAlerta; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getPrioridade() { return prioridade; }
    public void setPrioridade(String prioridade) { this.prioridade = prioridade; }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }
}