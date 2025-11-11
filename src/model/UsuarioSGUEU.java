package model;

public class UsuarioSGUEU {

    private String nombreCompleto;
    private String correo;
    private String username;
    private String rol;

    public UsuarioSGUEU() {
    }

    public UsuarioSGUEU(String nombreCompleto, String correo, String username, String rol) {
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.username = username;
        this.rol = rol;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
