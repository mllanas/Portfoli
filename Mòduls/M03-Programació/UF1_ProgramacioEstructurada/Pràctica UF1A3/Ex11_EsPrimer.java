/*
 * Fes un programa que ens demani un nombre natural n i ens digui si és 
 * o no primer.
 * 
 * Input:
 * 42
 * 43
 * Output:
 * El nombre 42 NO és primer.
 * El nombre 43 és primer. 
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex11_EsPrimer {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueixi un número: ");
        int nombre = entrada.nextInt();
                        
        // Si "nombre" és major que 1 (a partir de 2...) i divisible per 1 o ell mateix
        // divisibles entre 2 i n-1, perquè /1 i /n ja es pressuposa
        boolean primer = true;  // Presuposo que TOTS són primers
        for ( int i = 2; i < nombre; ++i) 
        {      
            if ((nombre % i == 0)) // i
            {
                System.out.println("El nombre " + nombre + " NO és primer.");
                primer=false;   // Dic que NO és PRIMER
                break;          // Forço el final del programa
            }               
        }
        
        if (primer)
            System.out.println("El nombre "+ nombre +" és primer.");
    }
}
