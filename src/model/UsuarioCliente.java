package model;

public class UsuarioCliente {
    private int idUsuario;
    private String nome;
    private String email;

    public UsuarioCliente(int idUsuario, String nome, String email) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
    }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}