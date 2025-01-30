package com.prog06_Cafetera;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    //constructor sin parametros que inicia los atributos
    public Cafetera () {
        this.capacidadMaxima= 10;
        this.cantidadActual= 0;
    }

    //contructor que toma la capacidad maxima y establece la cantidad actual y la maxima en el parametro pasado
    public Cafetera (int capacidadMaxima) {
        this.capacidadMaxima=capacidadMaxima;
        this.cantidadActual=capacidadMaxima;
    }

    public Cafetera (int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima=capacidadMaxima;

        if (capacidadMaxima<cantidadActual) {
            this.cantidadActual=capacidadMaxima;
        } else {
            this.cantidadActual=cantidadActual;
        }
    }

    //metodo para llenar la cafetera
    public void llenarCafetera() {
        cantidadActual=capacidadMaxima;
        System.out.println("Se ha llenado la cafetera");
    }

    //metodo para servir cafe
    public void servirTaza(int taza) {
        if (cantidadActual < taza) {
            System.out.println("Cantidad insuficiente, taza servida: " + cantidadActual);
            this.cantidadActual = 0;
        } else {
            System.out.println("Se ha servido una taza de: " + taza + " c.c");
            cantidadActual = cantidadActual - taza;
            System.out.println("Cantidad restante: " + cantidadActual + " c.c");
        }
    }

    //metodo para vaciar la cafetera
    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    //metodo para añadir cafe
    public void agregarCafe(int cantidadCafe) {
        //si la cantidad maxima es mayor que la cantidad actual mas lo añadido
        //es decir, si hay sitio para añadir, se sumara a la candidad total
        if (capacidadMaxima>(cantidadCafe+cantidadActual)) {
            this.cantidadActual = cantidadActual + cantidadCafe;
        } else { //Si no hay sitio para toda, se establece la cantidad actual en la cantidad maxima
            this.cantidadActual=capacidadMaxima;
        }
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
}
