/*
 * Fes un programa que ens demani dos nombres naturals (n i m) i ens digui si un
 * d'ells és múltiple de l'altre.
 * Exemple:
 *  Entrada 1:
 *  9
 *  18
 *  Sortida 1:
 *  El 18 és múltiple de 9.
 *  Entrada 2:
 *  8
 *  19
 *  Sortida 2:
 *  Cap d'ells és múltiple de l'altre.
 */
package cat.copernic.m03.uf1a2;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex03_Multiples {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introdueixi un nombre natural: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Introdueixi un altre nombre natural: ");
        int num2 = entrada.nextInt();

        if (num1 % num2 == 0)
            System.out.println("El " + num1 + " és múltiple de " + num2 + ".");
        
        else if (num2 % num1 == 0)
            System.out.println("El " + num2 + " és múltiple de " + num1 + ".");
        
        else 
            System.out.println("Cap d'ells és múltiple de l'altre.");
        
    }
}
