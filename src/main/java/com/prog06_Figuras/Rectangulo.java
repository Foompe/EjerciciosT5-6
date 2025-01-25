package com.prog06_Figuras;

public class Rectangulo {

    private double alto;
    private double ancho;
    private String color = "xDefecto";

    public Rectangulo (int alto, int ancho, String color) {
        this.alto=alto;
        this.ancho=ancho;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    //metodo superficie alto x ancho
    public double superficie () {
        return (alto * ancho);
    }

    //metodo area (2 * alto) + (2 * ancho)
    public double area () {
        return ((2*alto)+(2*ancho));
    }

    @Override
    public String toString() {
        return "\nDatos rectangulo:\n - Alto: " + alto + "\n - Ancho: " + ancho + "\n - Area: " + area() +
                "\n - Superficie: " + superficie() + "\n";
    }
}
