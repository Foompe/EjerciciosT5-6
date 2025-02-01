package com.prog06_Escuela;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alumno {

    private String nombre;
    private String ape1;
    private String ape2;
    private String dni;
    private LocalDate fechaNac;
    private String nombreEscuela;


    //constructor por parametros
    public Alumno (String nombre, String ape1, String ape2, String dni, int dia, int mes,int ano) {
        this.nombre=nombre;
        this.ape1=ape1;
        this.ape2=ape2;
        this.dni=dni;
        this.fechaNac=LocalDate.of(ano,mes,dia);
        this.nombreEscuela="Fernando Wirtz Suarez";
    }

    //Metodo que nos dice si es mayor de edad o no
    public boolean mayorEdad() {
        long edad = fechaNac.until(LocalDate.now(), ChronoUnit.YEARS);
        if (edad >= 18) {
            return true;
        }
        return false;
    }

    //Metodo que comprara si los datos de un alumno son iguales a los de otro
    public boolean esIgual(Alumno alumno) {
        if (this.nombre.equals(alumno.getNombre()) &&
            this.ape1.equals(alumno.getApe1()) &&
            this.ape2.equals(alumno.getApe2()) &&
            this.dni.equals(alumno.dni) &&
            this.fechaNac.equals(alumno.getFechaNac())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Datos alumno:\n nombre completo: " + nombre + " " + ape1 + " " + ape2 +
                "\n DNI: " + dni +
                "\n Fecha de nacimiento: " + fechaNac +
                "\n Nombre escuela: " + nombreEscuela;

    }

    public boolean esMayorQue (Alumno alumno) {
        return this.fechaNac.isBefore(alumno.getFechaNac());
    }

    //getters y setters.
    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }
}
