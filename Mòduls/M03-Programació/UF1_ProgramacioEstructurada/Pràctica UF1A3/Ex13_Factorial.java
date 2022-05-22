/*
 * Fes un programa que ens demani un nombre natural n i ens escrigui el factorial
 * de n (entre 0 i 20). (n! = 1*2*3*....*n).
 * 
 * Input:
 * 7
 * 20
 * Output:
 * Factorial de 7 = 7! = 5040
 * Factorial de 20 = 20! = 2432902008176640000 
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex13_Factorial {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int nombre = entrada.nextInt();
        
        System.out.print("Introdueixi un nombre natural: ");

        long factorial = 1L;
        int comptador = 1;     
        while (comptador <= nombre)
        {        
            factorial *= comptador;
            
            ++comptador;
        }

        System.out.println("Factorial de " + nombre + " = " + nombre + "! = " +
                            factorial);
                
    }
}
