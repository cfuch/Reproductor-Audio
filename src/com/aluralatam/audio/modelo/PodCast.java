package com.aluralatam.audio.modelo;

public class PodCast extends Audio {
    private int capitulo;
    private int temporada;
    private String invitado;
    private String descripcion;

    @Override
    public int getClasificacion() {
        if (getTotalDeReproducciones() >=2000){
            return 9;
        }else {
            return 2;
        }
    }

    public int getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getInvitado() {
        return invitado;
    }

    public void setInvitado(String invitado) {
        this.invitado = invitado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
