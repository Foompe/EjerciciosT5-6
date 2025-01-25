package com.prog06_Principal;
import com.prog06_Figuras.Circulo;
import com.prog06_Figuras.Rectangulo;
import com.prog06_Figuras.Triangulo;

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
      /**       System.out.println("4. Opción 4");
            System.out.println("5. Opción 5");
            System.out.println("6. Opción 6");
            System.out.println("7. Opción 7");
            System.out.println("8. Opción 8");
            System.out.println("9. Opción 9");
            System.out.println("10. Salir");
*/
            option = sc.nextInt();

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
                    System.out.println("***** ***** RECTANGULO ***** *****");
                    break;
                case 5:
                    System.out.println("***** ***** RECTANGULO ***** *****");
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