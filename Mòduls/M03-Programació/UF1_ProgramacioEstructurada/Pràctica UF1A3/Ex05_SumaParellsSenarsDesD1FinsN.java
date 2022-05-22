/*
 * Fes un programa que ens demani un nombre natural n i ens respongui el 
 * resultat de la suma dels parells i dels senars de l'1 a l'n.
 * 
 * Intput:
 * Introdueixi un número: 7
 * Output:
 * Suma parells: 12
 * Suma senars : 16
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex05_SumaParellsSenarsDesD1FinsN {
    
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
