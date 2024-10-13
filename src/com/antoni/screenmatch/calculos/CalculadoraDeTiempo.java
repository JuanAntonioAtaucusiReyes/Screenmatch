package com.antoni.screenmatch.calculos;

import com.antonio.screenmatch.modelos.Pelicula;
import com.antonio.screenmatch.modelos.Serie;
import com.antonio.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        tiempoTotal += titulo.getDuracionEnMinutos();
    }

}
