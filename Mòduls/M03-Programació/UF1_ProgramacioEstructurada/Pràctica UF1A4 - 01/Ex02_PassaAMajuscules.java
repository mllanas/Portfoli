/*
 * Fes un programa que ens demani una cadena de caràcters i ens l'escrigui tota
 * en majúscules. Utilitzeu només 1 String!
 * 
 * Input:
 * Felipe Juan Froilán de Todos los Santos
 * Output:
 * Cadena en majúscules: FELIPE JUAN FROILÁN DE TODOS LOS SANTOS
 */

package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex02_PassaAMajuscules {

    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix una cadena de caràcters: ");
        String frase = entrada.nextLine().toUpperCase();
        
        System.out.println("Cadena en majúscules: " + frase);
        
    }
}
