/*
 * (La criba de Erat�stenes)
 * Fes un programa que ens demani un nombre natural "n" i ens escrigui els "n" 
 * primers nombres primers.
 * 
 * Primer nombre primer: 2
 * 
 * Input:
 * 25
 * 1
 * Output:
 * 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
 * 2
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex12_NPrimersPrimers {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introdueixi un n�mero: ");
        int n = entrada.nextInt();
        
        System.out.println("Els "+ n +" primers nombres primers s�n:");
        
        int valorAprovar = 2;
        int comptador = 0;    
        while (comptador < n) // 1r loop: estableix "n" voltes, des de 0 a n-1
        {
            // Busco els nombres primers, partint de 2 fins a 
            boolean primer = true;  // Presuposo que TOTS s�n primers        
            for ( int i = 2; i < valorAprovar; ++i) // Divisibles entre 2 i n-1, perqu� /1 i /n ja es pressuposa
            {   
                if ((valorAprovar % i == 0))
                {
                    primer=false;   // Dic que NO �s PRIMER
                    break;          // for�o el final del programa
                }               
            }

            if (primer)  // La condicio "primer" �s certa
            {    
                System.out.print(valorAprovar+" ");
                ++comptador;    // Incremento el comptador
            }
            ++valorAprovar;     // Incremento els valors a provar, poden o no ser primers
        }
        
        System.out.println();
    }
}
