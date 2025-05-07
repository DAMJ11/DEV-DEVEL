package org.example;

import java.time.LocalDateTime;

public abstract class Usuario {
    private int usuarioID;
    private String nombreCompleto;
    private String nombreDeUsuario;
    private String correoElectronico;
    private String contrasenaUsuario;
    private LocalDateTime fechaRegistro;

    public Usuario() {
    }

    public Usuario(int usuarioID, String nombreCompleto, String nombreDeUsuario, String correoElectronico, String contrasenaUsuario, LocalDateTime fechaRegistro) {
        this.usuarioID = usuarioID;
        this.nombreCompleto = nombreCompleto;
        this.nombreDeUsuario = nombreDeUsuario;
        this.correoElectronico = correoElectronico;
        this.contrasenaUsuario = contrasenaUsuario;
        this.fechaRegistro = fechaRegistro;
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreDeUsuario() {
        return "@" + nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }


    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Usuario: " + getNombreCompleto() + " " + ("@" + getNombreDeUsuario());
    }

    public abstract void iniciarSesion(String correoLogin, String contrasenaLogin);

    public void registrarse(String correoUsuario, String contrasenaUsuario, String nombreDeUsuario) {
        if (correoUsuario != null && contrasenaUsuario.length() >= 8 && nombreDeUsuario != null) {
            System.out.println("\n- - 👾 TE HAS REGISTRADO CORRECTAMENTE 👾 - -\n" +
                    "Bienvenid@ a DEV DEVEL, " + nombreDeUsuario + "\n");
        } else {
            System.out.println("No ha sido posible procesar el registro en este momento!\n");
        }
    }
}