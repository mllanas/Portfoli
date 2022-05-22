/*
 * Fes un programa que ens demani un nombre natural (n) per teclat i, en el cas 
 * que sigui menor que 100 que el torni a demanar tantes vegades com calgui fins
 * que sigui major o igual a 100.
 */
package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex07_MenorQue100 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i = 0;
        int nombre = 0;

        while (nombre < 100) {
            System.out.print("Introdueix un nombre (>=100 per acabar): ");
            nombre = entrada.nextInt();
            i++;
        }

        // Capturo últim nombre introduït:
        int ultim = nombre;

        System.out.println("Acabat! El darrer nombre introduït és: " + ultim);
    }
}
