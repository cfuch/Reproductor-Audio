package com.aluralatam.audio.principal;

import com.aluralatam.audio.modelo.Cancion;
import com.aluralatam.audio.modelo.MisFavoritos;
import com.aluralatam.audio.modelo.PodCast;

public class Reproductor {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("forever");
        miCancion.setInterprete("Kiss");

        PodCast miPodcast =new PodCast();
        miPodcast.setAutor("mi yo");
        miPodcast.setTitulo("Uff que caro");
        miPodcast.setCapitulo(1);
        miPodcast.setDuracionEnMinutos(20);

        for (int i= 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            miCancion.reproducciones();
        }

        for (int i= 0; i < 100; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            miPodcast.reproducciones();
        }

        System.out.println("Total de reproducciones " + miCancion.getTotalDeMeGusta());
        System.out.println("Total de me gusta " + miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);



    }

}
