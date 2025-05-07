package org.example;

import java.time.LocalDateTime;

public class Respuesta extends Publicacion {
    public Respuesta() {
    }

    public Respuesta(int publicacionID, String contenido, LocalDateTime fechaHoraCreacion, Usuario autor, int cantidadVotos) {
        super(publicacionID, contenido, fechaHoraCreacion, autor, cantidadVotos);
    }

    @Override
    public void mostrarPublicacion() {
        System.out.println("* * * RESPUESTA * * *\n");
        System.out.println("Por: " + getAutor().getNombreDeUsuario());
        System.out.println("Re: " + getContenido());
        System.out.println(getFechaHoraCreacion());
        System.out.println("👍: " + getCantidadVotos());
        System.out.println("- - - - - - - - - - - - - - - - - -\n");
    }
}