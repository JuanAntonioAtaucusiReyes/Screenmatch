package com.antonio.screenmatch.modelos;

public class Titulo {

    private String nombre;
    private int fechDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int toatalDeEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public int getFechDeLanzamiento() {
        return fechDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean getIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public int getToatalDeEvaluaciones() {
        return toatalDeEvaluaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechDeLanzamiento(int fechDeLanzamiento) {
        this.fechDeLanzamiento = fechDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void muestraFichaTecnica(){
        System.out.println("el nombre de la pelicula es : "+nombre);
        System.out.println("Su fecha de alnzamiento es : "+ fechDeLanzamiento);
        System.out.println("duracion en minutos es : "+duracionEnMinutos);
    }
    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        toatalDeEvaluaciones++;
    }
    public double calculaMedia(){

        return sumaDeLasEvaluaciones / toatalDeEvaluaciones;
    }

}
