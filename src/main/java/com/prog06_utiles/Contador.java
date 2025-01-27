package com.prog06_utiles;

public class Contador {

    private int contador;

    public void incrementar(){
        contador++;
    }

    public void decrementar() {
        contador--;
    }

    //constructor por defecto
    public Contador() {
    }

    //constructor copia
    public Contador(int contador) {
        this.contador=contador;
    }

    //metodo copia
    public Contador(Contador c1) {
        this.contador= c1.getContador();
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
