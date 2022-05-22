/*
 * Fes un programa que demani el tipus de figura 2D: quadrat (q), rectangle (r),
 * triangle isòsceles (t), cercle (c). A continuació, ha de demanar les dades 
 * necessàries per a cadascun i en mostri el perímetre i la superfície.
 * 
 * Nota 1: Fes que el teu programa sigui modular fent servir un mètode per 
 * demanar les dades i fer els càlcul de cada figura. 
 * 
 * Nota 2: Per sortir del programa és necessari seleccionar l'opció s.
 * 
 * Nota 3: L'entrada del tipus de figura ha de ser insensible a majúscules.
 * 
 * Nota 4: Els resultats s'han de mostrar amb 2 decimals. 
 * 
 * Input:
 * q 
 * 2
 * c
 * 2.6
 * r
 * 3
 * 4
 * t
 * 1.6
 * 2.7
 * s
 * Output:
 * ==Quadrat==
 * Perímetre : 8.00
 * Superfície: 4.00
 * ==Cercle==
 * Perímetre : 16.34
 * Superfície: 21.24
 * ==Rectangle==
 * Perímetre : 14.00
 * Superfície: 12.00
 * ==Triangle isòsceles==
 * Perímetre : 5.90
 * Superfície: 1.16
 */

package cat.copernic.m03.uf2a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex03_Figures2D {
    
    static Scanner entrada;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        entrada = new Scanner(System.in);

        boolean sortida = false;
        do {
            System.out.print("Escull una figura [q-quadrat, r-rectangle, "
                    + "t-triangle, c-cercle, s-Sortida]: ");
            
            String figura = entrada.nextLine().toLowerCase();

            if (figura.equals("s")) {
                sortida = true;
            } else {
                switch (figura) {
                    case "q":
                        calculsQuadrat();
                        break;
                    case "r":
                        calculsRectangle();
                        break;
                    case "t":
                        calculsTriangleIsosceles();
                        break;
                    case "c":
                        calculsCercle();
                        break;
                    default:
                        System.out.println("Figura incorrecta!");
                }
            }
        } while (!sortida);

    }

    static void mostrarResultats(String nomFigura, double perimetre, double superficie) {
        System.out.println(nomFigura);
        System.out.printf("Perímetre : %.2f\n", perimetre);
        System.out.printf("Superfície: %.2f\n", superficie);
        entrada.nextLine();
    }
    static void calculsQuadrat() {
        System.out.print("Introdueix el valor del costat: ");
        double costat = entrada.nextDouble();

        double perimetre = 4 * costat;
        double superficie = costat * costat;

        String nomFigura = "==Quadrat==";
        mostrarResultats(nomFigura, perimetre, superficie);
    }
    static void calculsRectangle() {
        System.out.print("Introdueix el valor del costat llarg: ");
        double base = entrada.nextDouble();
        System.out.print("Introdueix el valor del costat curt: ");
        double alcada = entrada.nextDouble();

        double perimetre = 2 * (base + alcada);
        double superficie = base * alcada;

        String nomFigura = "==Rectangle==";
        mostrarResultats(nomFigura, perimetre, superficie);
    }
    static void calculsTriangleIsosceles() {
        System.out.print("Introdueix el valor del costat: ");
        double c1 = entrada.nextDouble();
        System.out.print("Introdueix el valor del costat2: ");
        double c2 = entrada.nextDouble();

        double perimetre = 2 * c1 + c2;
        double superficie = (c2 / 2) * Math.sqrt(c1 * c1 - c2 * c2 / 4);

        String nomFigura = "==Triangle isòsceles==";
        mostrarResultats(nomFigura, perimetre, superficie);
    }
    static void calculsCercle() {
        System.out.print("Introdueix el valor del radi: ");
        double radi = entrada.nextDouble();

        double perimetre = 2 * Math.PI * radi;
        double superficie = Math.PI * radi * radi;

        String nomFigura = "==Cercle==";
        mostrarResultats(nomFigura, perimetre, superficie);
    }
    
}
