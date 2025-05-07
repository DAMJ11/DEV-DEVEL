package org.example;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------- DEV_DEVEL ----------\n");

        UsuarioRegistrado user01 = new UsuarioRegistrado(
                1,
                "Jorge Veraz Castaño",
                "eljefe1",
                "jorgecasta01@gmail.com",
                "123456",
                LocalDateTime.of(2025, 5, 6, 23,50,5)
        );

        user01.iniciarSesion(user01.getCorreoElectronico(), user01.getContrasenaUsuario());
        user01.registrarse("peperez01@example.com", "12345678A", "holahelos");

        Administrador admin01 = new Administrador(
                2,
                "Carlos Villa Restrepo",
                "TheEvilCheezit",
                "test01@yahoo.com",
                "0000",
                LocalDateTime.of(2025, 5, 6, 12, 11, 5)
        );



        // vv Discusion
        List<Etiqueta> etiquetasDiscusion = Arrays.asList(new Etiqueta("Java"), new Etiqueta("Programación"));

        Discusion discusion01 = new Discusion(
                101,
                "¿Cómo implementar herencia en Java?",
                "Estoy tratando de entender cómo funciona la herencia. ¿Alguien puede explicar con un ejemplo práctico?",
                LocalDateTime.of(2024, 9, 3, 14, 45),
                user01, // o cualquier instancia de Usuario
                etiquetasDiscusion,
                15,
                2 // nivel de complejidad (1 = fácil, 2 = medio, 3 = avanzado)
        );

        discusion01.mostrarPublicacion();

        // vv Etiquetas
        List<Etiqueta> etiquetasRecurso = Arrays.asList(new Etiqueta("POO"), new Etiqueta("Teoría"));

        RecursoAcademico recurso01 = new RecursoAcademico(
                202,
                "Guía de programación orientada a objetos",
                "PDF",
                "Una guía completa sobre POO con ejemplos en Java.",
                "https://ejemplo.com/poo-java.pdf",
                LocalDateTime.of(2024, 10, 5, 9, 15),
                user01,
                etiquetasRecurso,
                25
        );

        recurso01.marcarFavorito();
        recurso01.mostrarPublicacion();

        // vv Respuesta
        Respuesta respuesta01 = new Respuesta(
                301,
                "Puedes usar la palabra clave `extends` para heredar una clase. Aquí tienes un ejemplo...",
                LocalDateTime.of(2024, 9, 3, 15, 10),
                admin01,
                8
        );

        respuesta01.mostrarPublicacion();

        Seccion seccion = new Seccion("Programación en Java");

        seccion.agregarPublicacion(discusion01);
        seccion.agregarPublicacion(recurso01);


        UsuarioRegistrado user02 = new UsuarioRegistrado(
                2,
                "Vine para trolear",
                "pizza bell",
                "jorgecasta01@gmail.com",
                "123456",
                LocalDateTime.of(2025, 5, 6, 23,50,5)
        );

        List<Etiqueta> etiquetasDiscusion02 = Arrays.asList(new Etiqueta("Pizza"),
                new Etiqueta("Piña"));

        Discusion disc02 = new Discusion(2,
                "Como hacer pizza con piña",
                "Anoche queria pizza pero con piña porque es sacrilegio",
                LocalDateTime.of(2025, 4, 2, 16, 42, 3),
                user02,
                etiquetasDiscusion02,
                1,
                1
        );

        disc02.mostrarPublicacion();
        disc02.reportarContenido(user01, disc02, "No es apropiado para este foro.");

        admin01.eliminarPublicacion(disc02, "Publicación no apropiada, fuera de contexto.");
    }
}