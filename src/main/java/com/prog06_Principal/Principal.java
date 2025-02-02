package com.prog06_Principal;
import com.prog06_Biblioteca.EjemplarLibro;
import com.prog06_Escuela.Alumno;
import com.prog06_Figuras.Circulo;
import com.prog06_Figuras.Rectangulo;
import com.prog06_Figuras.Triangulo;

import java.time.DayOfWeek;
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
             System.out.println("6. Fechas 2");
             System.out.println("7. Alumno");
             System.out.println("8. Cadenas");
         /**   System.out.println("9. Opción 9");
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

                    System.out.println("Parte D:\nIntroducir una fecha y mostrar el dia de la semana que le corresponde");
                    DayOfWeek diafechacumple = fechaCumple.getDayOfWeek();
                    System.out.println("Tomamos la fecha de cumpleaños que pertenece el dia: " + diafechacumple);

                    break;
                case 6:
                    System.out.println("***** ***** FECHAS 2 ***** *****");
                    System.out.println("Calculo de domingos en el año.\nIntroduce año:");
                    int anosc= sc.nextInt();
                    sc.nextLine();
                    LocalDate fecha = LocalDate.of(anosc,1,1);
                    int contadorDomingos = 0;

                    while (fecha.getYear() == anosc) { //mientras el año sea 2025 se dara el bucle
                        if (fecha.getDayOfWeek() == DayOfWeek.SUNDAY) { //si el dia de la semana es domingo
                            contadorDomingos++; //se suma uno en el contador
                        }
                        fecha = fecha.plusDays(1); //sumamos uno a la fecha
                    }

                    System.out.println("El año: " + anosc + " tiene " + contadorDomingos + " Domingos");
                    System.out.println("Parte F:\nIndica el día de la semana del 31 de diciembre de los ultimos 5 años");
                    //tomamos la fecha actual
                    LocalDate fechaActual2 = LocalDate.now();
                    System.out.println("Teniendo en cuenta que la fecha actual es: " + fechaActual2);
                    //en vase a esta fecha calcular los ultimos 5 años
                    for(int i= 1; i < 6; i++) {
                      int anoAct = fechaActual2.getYear();
                      LocalDate anoCal = LocalDate.of((anoAct - i),12,31);
                        System.out.println("El 31 de Diciembre del año " + anoCal.getYear() + " era " + anoCal.getDayOfWeek());
                    }

                    break;
                case 7:
                    System.out.println("***** ***** ALUMNO ***** *****");
                    System.out.println("Creamos tres alumnos, el primero y el segundo iguales  y el tercero diferente");

                    Alumno a1 = new Alumno("Ruben","Suarez", "Gonzalez", "123456789A", 16,8,1993);
                    Alumno a2 = new Alumno("Ruben", "Suarez", "Gonzalez", "123456789A", 16, 8, 1993);
                    Alumno a3 = new Alumno("Roberto", "Jose", "Luzbet", "123456789C", 11, 9, 2024);
                    Alumno a4 = new Alumno("Roberto", "Suarez", "Gonzalez", "123456789A", 16, 8, 1993);

                    System.out.println("Mostramos datos de cada alumno" +
                            "\nAlumno 1:\n" + a1 +
                            "\n\nAlumno 2:\n" + a2 +
                            "\n\nAlumno 3:\n" + a3 +
                            "\n\nAlumno 4:\n" + a4);


                    System.out.println("\nVemos si alumno 1 es mayor de edad");
                    if (a1.mayorEdad()) {
                        System.out.println("Es mayor de edad");
                    } else {
                        System.out.println("No es mayor de edad");
                    }
                    System.out.println("\nHacemos lo mismo con alumno 3");
                    if (a3.mayorEdad()) {
                        System.out.println("Es mayor de edad");
                    } else {
                        System.out.println("No es mayor de edad");
                    }

                    System.out.println("\nComparamos si alumno1 es mayor que alumno 3");
                    if (a1.esMayorQue(a3)) {
                        System.out.println("a1 es mayor que a3");
                    } else {
                        System.out.println("a1 es menor que a3");
                    }

                    System.out.println("\nComparamos los datos de los alumnos a1 y a3 para ver si son el mismo");
                    if (a1.esIgual(a3)) {
                        System.out.println("a1 es igual a a3");
                    } else {
                        System.out.println("a1 es diferente de a3");
                    }

                    System.out.println("\nComparamos ahora a a1 con a2");
                    if (a1.esIgual(a2)) {
                        System.out.println("a1 es igual a a2");
                    } else {
                        System.out.println("a1 es diferente de a2");
                    }

                    break;
                case 8:
                    System.out.println("***** ***** CADENAS ***** *****");
                    System.out.println("Introduce una cadena de caracteres:");
                    String cad1 = sc.nextLine();
                    System.out.println("Mostramos la cadena:\n En minusculas: " + cad1.toLowerCase() +
                            "\n En mayusculas: " + cad1.toUpperCase());

                    System.out.println("Parte B:\nBuscar si en la cadena aparece una letra");
                    String letra = sc.nextLine();
                    if (cad1.contains(letra)) {
                        System.out.println("Contiene la letra " + letra);
                    } else {
                        System.out.println("No contiene la letra " + letra);
                    }

                    System.out.println("Parte C:\nCalcular si la letra tiene mas de 10 posiciones");
                    if (cad1.length() > 10) {
                        System.out.println("La palabra es mayor de 10 letras");
                    } else {
                        System.out.println("La palabra es menor o igual que 10");
                    }

                    System.out.println("Parte D:\nDecir si la dadena contiene un cararter a escoger a partir de la 4 posición");
                    System.out.println("Introduce el caracter que quieras buscar a partir de la 4 posiciçon");
                    String letra2 = sc.nextLine();
                    char l2 = letra2.charAt(0);
                    boolean contiene = false;
                    for (int i = 4; i < cad1.length(); i++) {  //usamos este bucle para recorrer la distnacia total de la cadena
                        if (cad1.charAt(i) == l2) { //comprobamos a partir de la 4 posicion si coincide con la letra escogida
                            contiene = true;        //si coincide se pasa a true y se imprime el mensaje
                        }
                    }
                    if (contiene) {
                        System.out.println("La palabra -" + cad1 + "- contriene la letra -" + l2 + "- a partir de la 4 posicion");
                    } else {
                        System.out.println("No contiene la letra");
                    }

                    System.out.println("\nParte E:\nCrea una cadena formada por las primeras 5 posiciones de la cadena");
                    String cadRes = cad1.substring(0,5);
                    System.out.println("Cadena resultado: " + cadRes);

                    System.out.println("\nParte F:\nCrea una cadena formada por las 5 ultimas posiciones y ver si es igual que hola");
                    int inicio = (cad1.length() - 5);
                    int fin = cad1.length();
                    String cadFin = cad1.substring(inicio,fin);
                    System.out.println("Cadena final: " + cadFin);
                    if (cadFin.equalsIgnoreCase("hola")) {
                        System.out.println("Es igual a hola");
                    } else {
                        System.out.println("No es igual a hola");
                    }

                    System.out.println("\nParte H:\nConvertir una cadena de numero a formato int");
                    System.out.println("Introduce una cadena de numeros");
                    String cadNum = sc.nextLine();
                    int trans = Integer.parseInt(cadNum);
                    System.out.println("Cadena texto introcucida: " + cadNum + "\nConversion a formato numerico: " + trans);

                    System.out.println("\nParte J:\nPasar una cadena de texto hexadecimal a formato numerico");
                    String numHex = "1A3F";
                    int numeroHex = Integer.parseInt(numHex,16); //el 16 representa la base hexadecimal
                    System.out.println("El String: " + numHex + " representa: " + numeroHex);

                    System.out.println("\nParte J:\nBuscar en el interior de un String la palabra prueva y sustituirla por prueba");
                    String s2 = "jsalksjdpruevaasodkj";
                    System.out.println("String pasado: " + s2);
                    s2 = s2.replace("prueva","prueba");
                    System.out.println("String con cambio: " + s2);

                    System.out.println("\nParte k:\nComprobar si la primera posicion de la cadena es igual a la ultima");
                    System.out.println("Introduce una cadena");
                    String f2 = sc.nextLine();
                    //solucion A: pasar la primera y ultima posicion del String a char y despues compararlos
                    char primerCaracter = f2.charAt(0);
                    char ultimoCaracter = f2.charAt(f2.length() - 1);
                    if (primerCaracter ==  ultimoCaracter) {
                        System.out.println("El primer caracter y el ultimo son el mismo en " + s2);
                    } else {
                        System.out.println("El primer y ultimo caracter son diferentes");
                    }
                    //solucion B: usar substring:
                    String primerCaracter1 = f2.substring(0, 1);
                    String ultimoCaracter1 = f2.substring(f2.length() - 1);
                    if (primerCaracter1.equals(ultimoCaracter1)) {
                        System.out.println("El primer y último carácter son IGUALES.");
                    } else {
                        System.out.println("El primer y último carácter son DIFERENTES.");
                    }

                    System.out.println("\nParte K:\nDecir cuantos digitos numericos hay en la cadena");
                    String cadDig = "ñfokjhd5fd4gdfgd5g4d";
                    System.out.println("Tomaremos la cadena " + cadDig);
                    int contador = 0;
                    for (int i = 0; i < cadDig.length(); i++) {
                        char caracter = cadDig.charAt(i);

                        if (Character.isDigit(caracter)) { //comprueba si el caracter pasado es un digito
                            contador++;
                        }
                    }
                    System.out.println("Contiene " + contador + " numeros");

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