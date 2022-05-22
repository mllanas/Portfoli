/*
 * Fes un programa que ens demani un nombre natural (n) i ens digui si és parell 
 * o senar.
 * 
 * Exemple:
 *  Entrada 1:
 *  6
 *  Sortida 1:
 *  El nombre és parell.
 *  Entrada 2:
 *  7
 *  Sortida 2:
 *  El nombre és senar.
 */
package cat.copernic.m03.uf1a2;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex01_ParellSenar {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introdueix un nombre natural: ");
        int nombre = entrada.nextInt();

        if (nombre % 2 == 0)
            System.out.println("El nombre és parell.");
        else
            System.out.println("El nombre és senar.");
 
    }

}

