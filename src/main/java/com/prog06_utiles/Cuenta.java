package com.prog06_utiles;

public class Cuenta {

    private String titular; //Obligatorio
    private double cantidad; //Opcional

    //constructor por defecto
    public Cuenta () {
    }

    //constructor por parametros
    public Cuenta(String titular) {
        this.titular=titular;
    }

    //Getters y setters
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //metodo to string
    @Override
    public String toString() {
        return "Los parametros de Cuenta son:\n Titular: " + titular + "\n Cantidad: " + cantidad;
    }

    //metodo ingresar
    public void ingresar (double ingreso) {
        if (ingreso >= 0) {
            setCantidad(this.cantidad + ingreso);
        }
    }

    //metodo retirar
    public void retirar (double retirada) {
        if ((this.cantidad - retirada) < 0) {
            setCantidad(0);
        } else {
            setCantidad(this.cantidad - retirada);
        }
    }

}
