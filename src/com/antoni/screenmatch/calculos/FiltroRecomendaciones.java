package com.antoni.screenmatch.calculos;

public class FiltroRecomendaciones {
    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bine evaluados hasta el momento");
        }else if (clasificacion.getClasificacion() >=2){
            System.out.println("popular en el momento");
        }
    }
}
