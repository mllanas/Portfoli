/*
 * Fes un programa que ens demani una cadena de car�cters i ens l'escrigui tota
 * en maj�scules. Utilitzeu nom�s 1 String!
 * 
 * Input:
 * Felipe Juan Froil�n de Todos los Santos
 * Output:
 * Cadena en maj�scules: FELIPE JUAN FROIL�N DE TODOS LOS SANTOS
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
        
        System.out.print("Introdueix una cadena de car�cters: ");
        String frase = entrada.nextLine().toUpperCase();
        
        System.out.println("Cadena en maj�scules: " + frase);
        
    }
}
