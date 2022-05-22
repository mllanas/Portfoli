/*
 * Fes un programa que ens demani una frase i un nombre natural n i repeteixi 
 * la frase n vegades.
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex04_Eco {
    
     public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escriu una frase: ");
        String frase = entrada.nextLine();
        System.out.print("Quants cops vols repetir-la? ");
        int num = entrada.nextInt();
        
        for (int i = 1; i <= num; i++)
        {
            System.out.println(i +" - "+ frase);
        }
    }
}
