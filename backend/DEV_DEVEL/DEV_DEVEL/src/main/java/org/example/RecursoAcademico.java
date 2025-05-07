package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class RecursoAcademico extends Publicacion implements IArchivable {
    private String formato;
    private String url;

    public RecursoAcademico() {
    }

    public RecursoAcademico(int publicacionID, String titulo, String formato, String contenido, String url, LocalDateTime fechaHoraCreacion, Usuario autor, List<Etiqueta> etiquetas, int cantidadVotos) {
        super(publicacionID, titulo, contenido, fechaHoraCreacion, autor, etiquetas, cantidadVotos);
        this.formato = formato;
        this.url = url;
    }

    public String getFormato() {
        return formato.startsWith(".") ? formato : "." + formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return getTitulo() + getFormato() + " (" + getUrl() + ")";
    }

    public String obtenerRecurso() {
        if (url == null || url.isEmpty()) {
            return "URL no disponible";
        }

        if (formato != null && formato.equalsIgnoreCase("pdf")) {
            return "Abrir PDF";
        } else if (url.startsWith("http://") || url.startsWith("https://")) {
            return "Abrir enlace";
        } else {
            return "Descargar archivo";
        }
    }

    public void mostrarPublicacion() {
        System.out.println("- - - RECURSO ACADÉMICO - - -\n");
        System.out.println("Por: " + getAutor().getNombreDeUsuario());
        System.out.println("Título: " + getTitulo() + getFormato());
        System.out.println("Contenido: " + getContenido());
        System.out.println("URl: " + getUrl());
        System.out.println(getFechaHoraCreacion());
        if (getEtiquetas() != null && !getEtiquetas().isEmpty()) {
            for (Etiqueta etiqueta : getEtiquetas()) {
                System.out.print(etiqueta + " ");
            }
        } else {
            System.out.print("[Ninguna]");
        }
        System.out.println();
        System.out.println("👍: " + getCantidadVotos());
        System.out.println("- - - - - - - - - - - - - - - - - -\n");
    }

    @Override
    public void marcarFavorito() {
        System.out.println(" ⭐ Añadiste este recurso a tus Favoritos.\n");
    }

}