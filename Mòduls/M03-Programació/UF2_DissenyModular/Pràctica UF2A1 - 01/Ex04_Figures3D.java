/*
 * Fes un programa que demani el tipus de figura 3D: cilindre (c),
 * hexaedre regular (cub) (h), tetraedre (t), esfera (e). A continuació, ha de 
 * demanar les dades  necessàries per a cadascun i en mostri el perímetre i la 
 * superfície.
 * 
 * Nota 1: Fes que el teu programa sigui modular fent servir un mètode per 
 * demanar les dades i fer els càlcul de cada figura. 
 * 
 * Nota 2: Per sortir del programa és necessari seleccionar l'opció s.
 * 
 * Nota 3: Qualsevol opció de figura que no sigui correcta, farà que el programa
 *         torni a demanar la figura.
 * 
 * Nota 4: L'entrada del tipus de figura ha de ser insensible a majúscules.
 * 
 * Nota 5: Els resultats s'han de mostrar amb 2 decimals. 
 * 
 * Input:
 * c
 * 1
 * 2
 * h
 * 2
 * f
 * s
 * Output:
 * ==Cilindre==
 * Superfície: 18.85
 * Volum: 6.28
 * ==Hexaedre==
 * Superfície: 24.00
 * Volum: 8.00
 */

package cat.copernic.m03.uf2a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex04_Figures3D {
    
    static Scanner entrada;
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        entrada = new Scanner(System.in);

        demanarDades();

    }

    static void demanarDades() {

        boolean sortida = false;
        do {            
            System.out.print("Quina figura vols calcular [c-cilindre, h-hexaedre, "
                             + "t-tetraedre, e-esfera]: ");
            
            String figura = entrada.nextLine().toLowerCase();

            if (figura.equals("s")) {
                sortida = true;
            } else {
                switch (figura) {
                    case "c":
                        calculsCilindre();
                        break;
                    case "h":
                        calculsHexaedre();
                        break;
                    case "t":
                        calculsTetraedre();
                        break;
                    case "e":
                        calculsEsfera();
                        break;
                    default:
                        System.out.println("Figura incorrecta!");
                }
            }
            
        } while (!sortida);

    }

    static void mostrarResultats(String nomFigura, double area, double volum) {
        System.out.println(nomFigura);
        System.out.printf("Superfície: %.2f\n", area);
        System.out.printf("Volum: %.2f\n", volum);
        entrada.nextLine();
    }
    static void calculsCilindre() {
        System.out.print("Introdueix el radi del cilindre: ");
        double radi = entrada.nextDouble();
        System.out.print("Introdueix l'alçada del cilindre: ");
        double alcada = entrada.nextDouble();

        double area = 2 * Math.PI * radi * (radi + alcada);
        double volum = Math.PI * (radi * radi) * alcada;

        String nomFigura = "==Cilindre==";
        mostrarResultats(nomFigura, area, volum);
    }
    static void calculsHexaedre() {
        System.out.print("Introdueix el valor del costat del cub: ");
        double aresta = entrada.nextDouble();

        double area = 6 * aresta * aresta;
        double volum = aresta * aresta * aresta;

        String nomFigura = "==Hexaedre==";
        mostrarResultats(nomFigura, area, volum);
    }
    static void calculsTetraedre() {
        System.out.print("Introdueix el valor del costat: ");
        double costat = entrada.nextDouble();

        double area = costat * costat * Math.sqrt(3.0);
        double volum = (costat * costat * costat * Math.sqrt(2) / 12);

        String nomFigura = "==Tetraedre==";
        mostrarResultats(nomFigura, area, volum);
    }
    static void calculsEsfera() {
        System.out.print("Introdueix el valor del radi: ");
        double radi = entrada.nextDouble();

        double area = 4 * Math.PI * radi * radi;
        double volum = (4 * Math.PI * radi * radi * radi) / 3;

        String nomFigura = "==Esfera==";
        mostrarResultats(nomFigura, area, volum);
    }
    
}
