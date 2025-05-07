package org.example;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Publicacion implements IReportable, IArchivable {
    private int publicacionID;
    private String titulo;
    private String contenido;
    private LocalDateTime fechaHoraCreacion;
    private Usuario autor;
    private List<Etiqueta> etiquetas;
    private int cantidadVotos;

    public Publicacion() {
    }

    // Constructor para Discusiones
    public Publicacion(int publicacionID, String titulo, String contenido,
                       LocalDateTime fechaHoraCreacion, Usuario autor, List<Etiqueta> etiquetas, int cantidadVotos) {
        this(publicacionID, contenido, fechaHoraCreacion, autor, cantidadVotos);
        this.titulo = titulo;
        this.etiquetas = etiquetas;
    }

    // Constructor para Respuestas (sin título ni etiquetas)
    public Publicacion(int publicacionID, String contenido,
                       LocalDateTime fechaHoraCreacion, Usuario autor, int cantidadVotos) {
        this.publicacionID = publicacionID;
        this.contenido = contenido;
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.autor = autor;
        this.cantidadVotos = cantidadVotos;
    }

    public int getPublicacionID() {
        return publicacionID;
    }

    public void setPublicacionID(int publicacionID) {
        this.publicacionID = publicacionID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(LocalDateTime fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        if (autor != null) {
            this.autor = autor;
        } else {
            System.out.println("El autor no puede ser anónimo...");
        }
    }

    public List<Etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<Etiqueta> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    public void agregarEtiqueta(Etiqueta etiqueta) {
        this.etiquetas.add(etiqueta);
    }

    public abstract void mostrarPublicacion();

    @Override
    public void reportarContenido(Usuario usuario, Publicacion publicacion, String motivo) {
        System.out.println("🚩 " + usuario.getNombreDeUsuario() + " reportó " + publicacion.getTitulo() + "\n");
        System.out.println("Motivo: " + motivo);
    }

    @Override
    public void marcarFavorito() {
        System.out.println("⭐ Agregaste esta publicación a tus Favoritos.");
    }
}