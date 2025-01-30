package com.prog06_Principal;
import com.prog06_Biblioteca.EjemplarLibro;
import com.prog06_Figuras.Circulo;
import com.prog06_Figuras.Rectangulo;
import com.prog06_Figuras.Triangulo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 10) {
            System.out.println("\nPor favor, selecciona una opción:");
            System.out.println("1. Rectangulo");
            System.out.println("2. Circulo");
            System.out.println("3. Triangulo");
            System.out.println("4. Libro");
            System.out.println("5. Fechas");
      /**       System.out.println("6. Opción 6");
            System.out.println("7. Opción 7");
            System.out.println("8. Opción 8");
            System.out.println("9. Opción 9");
            System.out.println("10. Salir");
*/
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\n***** ***** RECTANGULO ***** *****\n");
                    Rectangulo r1 = new Rectangulo(6,5,"negro");
                    Rectangulo r2 = new Rectangulo(9,5,"rojo");

                    System.out.println("Valores rectangulo1:\n - Alto: " + r1.getAlto() + "\n - Ancho: " + r1.getAncho() +
                            "\n - Color: " + r1.getColor());

                    System.out.println("\nValores rectangulo2:\n - Alto: " + r2.getAlto() + "\n - Ancho: " + r2.getAncho() +
                            "\n - Color: " + r2.getColor());

                    System.out.println("\nCambiamos el color del rectangulo 1 a verde e imprimimos de nueve\n");

                    r1.setColor("verde");

                    System.out.println("Valores rectangulo1:\n - Alto: " + r1.getAlto() + "\n - Ancho: " + r1.getAncho() +
                            "\n - Color: " + r1.getColor());

                    System.out.println("\nValores rectangulo2:\n - Alto: " + r2.getAlto() + "\n - Ancho: " + r2.getAncho() +
                            "\n - Color: " + r2.getColor());

                    System.out.println("Valores rectangulos:\n" + r1 + r2);
                    break;
                case 2:
                    System.out.println("\n***** ***** CIRCULO ***** *****\n");
                    System.out.println("Creamos un circulo c1 de radio 5");
                    Circulo c1 = new Circulo(5);
                    System.out.println(c1);

                    System.out.println("\nParte dos, creamos un circulo c2 con gettes y setter");
                    Circulo c2 = new Circulo();
                    c2.setRadio(6);
                    System.out.println(" - Radio: " + c2.getRadio());
                    System.out.println(" - Circunferencia: " + c2.circunferenca());
                    System.out.println(" - Superficie: " + c2.superficie());
                    System.out.println(" - Diametro: " + c2.diametro());
                    break;
                case 3:
                    System.out.println("***** ***** TRIANGULO ***** *****");
                    System.out.println("Creamos un triangulo con el valor de los tres lados en 5");
                    Triangulo t1 = new Triangulo(5,5,5);
                    System.out.println(t1);
                    break;
                case 4:
                    System.out.println("***** ***** LIBRO ***** *****");
                    System.out.println("Creamos 4 libros...");
                    EjemplarLibro e1 = new EjemplarLibro("El nombre del viento");
                    EjemplarLibro e2 = new EjemplarLibro("El temor de un hombre sabio");
                    EjemplarLibro e3 = new EjemplarLibro(e1);
                    EjemplarLibro e4 = new EjemplarLibro("Nacidos de la bruma");

                    System.out.println("Simulamos prestamos y deboluciones\n");
                    e1.prestar();
                    e2.devolver();
                    e3.prestar();
                    e1.devolver();
                    e3.prestar();

                    System.out.println("\nMostramos los datos de cada libro creado:\n" +
                            " Libro 1:" + e1 + "\n Libro 2: " + e2 + "\n Libro 3 " + e3 + "\n Libro 4: " + e4);
                    break;
                case 5:
                    System.out.println("***** ***** FECHAS ***** *****");
                    System.out.println("Parte A:\nIntroduce tu fecha de nacimiento en formato AAAA-MM-DD");
                    String fechaC = sc.nextLine();
                    LocalDate fechaCumple = LocalDate.parse(fechaC); //pasamos la entrada de teclado a tipo fecha
                    LocalDate fechaActual = LocalDate.now();  //tomamos la fecha de hoy para los calculos
                    long dias = fechaCumple.until(fechaActual, ChronoUnit.DAYS); //calculamos los dias que han pasado
                    System.out.println("Desde tu cumpleaños el día " + fechaCumple + " han pasado " + dias + " días");

                    System.out.println("Parte B:\nIntroduce un número de dias para sumar a tu fecha anterior");
                    long diasSuma = sc.nextLong();
                    sc.nextLine(); //para recoger el enter y que no de problemas a futuro
                    fechaCumple = fechaCumple.plus(diasSuma,ChronoUnit.DAYS);
                    System.out.println("Has sumado " + diasSuma + " días. La fecha ahora es: " + fechaCumple);

                    System.out.println("Parte C:\nIntroducir dos horas de reloj y que nos de la diferencia en segundos");
                    System.out.println("Introduce la primera hora en formato hh:mm:ss");
                    String hora1 = sc.nextLine();
                    System.out.println("Introduce la segunda hora en formato hh:mm:ss");
                    String hora2 = sc.nextLine();

                    //pasamos los string a formato hora
                    LocalTime h1 = LocalTime.parse(hora1);
                    LocalTime h2 = LocalTime.parse(hora2);

                    //calculamos la diferencia en segundos entre ambas horas
                    Duration diferencia = Duration.between(h1,h2);
                    long segundos = diferencia.getSeconds(); //pasamos la diferencia a segundos

                    //mostramos en pantalla
                    System.out.println("La diferencia entre las dos horas son: " + segundos + " sec");
                    System.out.println("diferencia calcula: " + diferencia);


                    break;
                case 6:
                    System.out.println("***** ***** RECTANGULO ***** *****");
                    break;
                case 7:
                    System.out.println("***** ***** RECTANGULO ***** *****");
                    break;
                case 8:
                    System.out.println("***** ***** RECTANGULO ***** *****");
                    break;
                case 9:
                    System.out.println("***** ***** RECTANGULO ***** *****");
                    break;
                case 10:
                    //cierra el programa
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    break;
            }
        }
    }
}