package com.prog06_Biblioteca;

import java.time.LocalDate;

public class EjemplarLibro {

    private String tituloLibro;
    private LocalDate fechaActual;
    private int numEjemplar;
    private boolean prestado;

    public EjemplarLibro (String tituloLibro) {
        this.tituloLibro=tituloLibro;
        fechaActual=LocalDate.now();
        numEjemplar= 1;
        prestado=false;
    }

    //Creamos un constructor copia que tome los parametros de libro
    public EjemplarLibro (EjemplarLibro libro) {
        this.tituloLibro=libro.getTituloLibro();
        this.fechaActual =libro.getFechaActual();
        this.prestado=isPrestado();
        this.numEjemplar= libro.getNumEjemplar()+1;
    }

    //metodo prestar
    public boolean prestar() {
        if(prestado) { //si esta prestado devuelve false
            System.out.println("El libro que intentas prestar ya esta prestado");
            return false;
        } else { //si no esta prestado pasamos prestadoa true y devolvemos true
            System.out.println("libro prestado");
            this.prestado=true;
            return true;
        }
    }

    //metodo devolver.
    public boolean devolver() {
        if(prestado) { //comprobamos si esta prestado, si lo esta, pasamos a false y devolvemos true
            System.out.println("libro devuelto");
            this.prestado=false;
            return true;
        } else { //si no esta prestado por tanto la accion devolver no se puede ejecutar y devolvemos false
            System.out.println("El libro ya esta devuelto");
            return false;
        }
    }

    @Override
    public String toString() {
        return "\nNombre (fecha) [numero ejemplar]\n" + tituloLibro + " (" + fechaActual + ") [" + numEjemplar +"]\n";
    }

    public LocalDate getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(LocalDate fechaActual) {
        this.fechaActual = fechaActual;
    }

    public int getNumEjemplar() {
        return numEjemplar;
    }

    public void setNumEjemplar(int numEjemplar) {
        this.numEjemplar = numEjemplar;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }
}
