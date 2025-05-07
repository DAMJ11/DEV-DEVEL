
package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class Discusion extends Publicacion {
    private int nivelComplejidad; // 1 = Senior, 2 = Semi-senior, 3 = Junior

    public Discusion() {
    }

    public Discusion(int publicacionID, String titulo, String contenido, LocalDateTime fechaHoraCreacion,
                     Usuario autor, List<Etiqueta> etiquetas, int cantidadVotos, int nivelComplejidad) {
        super(publicacionID, titulo, contenido, fechaHoraCreacion, autor, etiquetas, cantidadVotos);
        this.nivelComplejidad = nivelComplejidad;
    }

    public String getNivelComplejidad() {
        return switch (nivelComplejidad) {
            case 1 -> "Senior";
            case 2 -> "Semi-senior";
            case 3 -> "Junior";
            default -> "Desconocido";
        };
    }

    public void setNivelComplejidad(int nivelComplejidad) {
        this.nivelComplejidad = nivelComplejidad;
    }

    @Override
    public void mostrarPublicacion() {
        System.out.println("- - - NUEVA DISCUSIÓN - - -");
        System.out.println("📌 Título: " + (getTitulo() != null ? getTitulo() : "[Sin título]"));
        System.out.println("👤 Autor: " + (getAutor() != null ? getAutor().getNombreDeUsuario() : "[Desconocido]"));
        System.out.println("📝 Contenido:\n" + getContenido());
        System.out.println("⏰ Publicado en: " + getFechaHoraCreacion());
        System.out.print("🏷️ Etiquetas: ");
        if (getEtiquetas() != null && !getEtiquetas().isEmpty()) {
            for (Etiqueta etiqueta : getEtiquetas()) {
                System.out.print(etiqueta + " ");
            }
        } else {
            System.out.print("[Ninguna]");
        }
        System.out.println();
        System.out.println("💥 Nivel de Complejidad: " + getNivelComplejidad());
        System.out.println("👍: " + getCantidadVotos());
        System.out.println("- - - - - - - - - - - - - - - - - -\n");
    }
}
