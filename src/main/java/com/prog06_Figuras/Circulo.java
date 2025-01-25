package com.prog06_Figuras;

public class Circulo {

    //atributo de clase que no se va a someter a ningun cambio
    private static double PI = 3.14159;

    //atributos que usaremos en la clase.
    private double radio;

    //constructor
    public Circulo(double radio) {
        this.radio=radio;
    }

    //construncor vacio
    public Circulo () {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //metodo calcular circunferencia 2 * PI * radio
    public double circunferenca () {
        return (2*PI*radio);
    }

    //metodo para calcular la superficie PI * (radio * 2)
    public double superficie () {
        return (PI+Math.pow(radio,2));
    }

    //metodo para calcular el diametro 2 * radio
    public double diametro () {
        return (2*radio);
    }

    @Override
    public String toString() {
        return "Valores del circulo creado:\n - Radio: " + radio +
                "\n - Circunferencia: " + circunferenca() +
                "\n - Superficie: " + superficie() +
                "\n - Diametro: " + diametro();
    }
}
