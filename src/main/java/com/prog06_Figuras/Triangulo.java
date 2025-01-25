package com.prog06_Figuras;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    //constructor con iniciacion de valores
    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    //getters y setters
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    //metodo para calcular el perimetro (suma de los lados)
    public double perimetro () {
        return (ladoA + ladoB + ladoC);
    }

    //metodo para calcular el area
    public double area (){
        double semiperimetro = (perimetro()/2);
        return Math.sqrt(semiperimetro*(semiperimetro-ladoA)*(semiperimetro-ladoB)*(semiperimetro-ladoC));
    }

    @Override
    public String toString() {
        return "\nDatos del triangulo:" +
                "\n - Lado A: " + ladoA +
                "\n - Lado B: " + ladoB +
                "\n - Lado C: " + ladoC +
                "\n - Perimetro: "+ perimetro() +
                "\n - Area: " + area();
    }
}
