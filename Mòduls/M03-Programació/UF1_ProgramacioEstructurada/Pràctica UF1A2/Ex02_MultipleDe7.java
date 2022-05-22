/*
 * Fes un programa que ens demani un nombre natural (n) i ens digui si és o no
 * múltiple de 7.
 * Exemple:
 *  Entrada 1:
 *  14
 *  Sortida 1:
 *  El nombre és múltiple de 7.
 *  Entrada 2:
 *  12
 *  Sortida 2:
 *  El nombre NO és múltiple de 7.
 */
package cat.copernic.m03.uf1a2;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex02_MultipleDe7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nombre = entrada.nextInt();

        if (nombre % 7 == 0)
            System.out.println("El nombre és múltiple de 7.");
        else 
            System.out.println("El nombre NO és múltiple de 7.");
       
    }

}
