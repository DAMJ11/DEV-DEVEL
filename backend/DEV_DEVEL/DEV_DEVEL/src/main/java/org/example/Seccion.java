package org.example;

import java.util.ArrayList;
import java.util.List;

public class Seccion {

    private String nombreSeccion;
    private List<Publicacion> publicaciones;

    public Seccion() {
    }

    public Seccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
        this.publicaciones = new ArrayList<>();
    }

    public String getNombreSeccion() {
        return nombreSeccion;
    }

    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }

    public void agregarPublicacion(Publicacion publicacion) {
        this.publicaciones.add(publicacion);
        System.out.println("⚙️ La publicación '" + publicacion.getTitulo() + "' fue agregada a la sección '" + nombreSeccion + "'.");
    }
}

