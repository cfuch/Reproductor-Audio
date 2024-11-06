package com.aluralatam.audio.modelo;

public class Cancion extends Audio {
    private String interprete;
    private String album;
    private String volumen;
    private String genero;

    @Override
    public int getClasificacion() {
        if (getTotalDeMeGusta() > 5000){
            return 8;
        }else {
            return 4;
        }
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
