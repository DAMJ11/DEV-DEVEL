package org.example;

import java.time.LocalDateTime;


public class UsuarioRegistrado extends Usuario {

    public UsuarioRegistrado() {
    }

    public UsuarioRegistrado(int usuarioID, String nombreCompleto, String nombreDeUsuario, String correoElectronico, String contrasenaUsuario, LocalDateTime fechaRegistro) {
        super(usuarioID, nombreCompleto, nombreDeUsuario, correoElectronico, contrasenaUsuario, fechaRegistro);
    }

    @Override
    public void iniciarSesion(String correoLogin, String contrasenaLogin) {
        if (correoLogin.equals(getCorreoElectronico()) && contrasenaLogin.equals(getContrasenaUsuario())) {
            System.out.println("- - 👾 INICIO DE SESIÓN EXITOSO 👾 - -\n" +
                    "Bienvenid@ a DEV DEVEL, " + getNombreDeUsuario() + "\n");
        } else {
            System.out.println("- - ❌ ERROR AL INICIAR SESIÓN ❌ - -\n" +
                    "Correo electrónico o contraseña incorrecta. Intente nuevamente\n");
        }
    }

}