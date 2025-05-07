package org.example;

public class Etiqueta {
    private String textoEtiqueta;

    public Etiqueta() {
    }

    public Etiqueta(String textoEtiqueta) {
        this.textoEtiqueta = textoEtiqueta;
    }

    public String getTextoEtiqueta() {
        return textoEtiqueta;
    }

    public void setTextoEtiqueta(String textoEtiqueta) {
        this.textoEtiqueta = textoEtiqueta;
    }

    @Override
    public String toString() {
        return "#" + textoEtiqueta;
    }
}

