/*
 * Fes un programa que ens demani un nombre natural n i ens digui si �s 
 * o no primer.
 * 
 * Input:
 * 42
 * 43
 * Output:
 * El nombre 42 NO �s primer.
 * El nombre 43 �s primer. 
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
        
        System.out.print("Introdueixi un n�mero: ");
        int nombre = entrada.nextInt();
                        
        // Si "nombre" �s major que 1 (a partir de 2...) i divisible per 1 o ell mateix
        // divisibles entre 2 i n-1, perqu� /1 i /n ja es pressuposa
        boolean primer = true;  // Presuposo que TOTS s�n primers
        for ( int i = 2; i < nombre; ++i) 
        {      
            if ((nombre % i == 0)) // i
            {
                System.out.println("El nombre " + nombre + " NO �s primer.");
                primer=false;   // Dic que NO �s PRIMER
                break;          // For�o el final del programa
            }               
        }
        
        if (primer)
            System.out.println("El nombre "+ nombre +" �s primer.");
    }
}
