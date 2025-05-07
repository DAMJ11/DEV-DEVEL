package org.example;

import java.time.LocalDateTime;

public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(int usuarioID, String nombreCompleto,
                         String nombreDeUsuario, String correoElectronico, String contrasenaUsuario, LocalDateTime fechaRegistro) {
        super(usuarioID, nombreCompleto, nombreDeUsuario, correoElectronico, contrasenaUsuario, fechaRegistro);
    }

    public void eliminarPublicacion(Publicacion publicacion, String motivo) {
        System.out.println("🚫 Publicación eliminada: '" + publicacion.getTitulo() + "'");
        System.out.println("📝 Motivo: " + motivo);
    }

    @Override
    public void iniciarSesion(String nombreUsuario, String contrasenaLogin) {
        if (nombreUsuario.equals(getNombreDeUsuario()) && contrasenaLogin.equals(getContrasenaUsuario())) {
            System.out.println("- - 👾 INICIASTE SESIÓN COMO ADMINISTRADOR 👾 - -\n" +
                    "Bienvenid@ a DEV DEVEL, admin " + getNombreDeUsuario() + "\n");
        } else {
            System.out.println("- - ❌ ERROR AL INICIAR SESIÓN ❌ - -\n" +
                    "Correo electrónico o contraseña incorrecta de administrador. Intente nuevamente\n");
        }
    }

}

