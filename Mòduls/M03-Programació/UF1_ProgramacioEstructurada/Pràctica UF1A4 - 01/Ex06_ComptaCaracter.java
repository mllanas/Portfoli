/*
 * Fes un programa que ens demani una cadena de caràcters i un caràcter i ens 
 * digui quantes vegades apareix aquest caràcter a la cadena.
 * 
 * Input:
 * una cadena de caràcters
 * a
 * Output:
 * El caràcter 'a' apareix 4 vegades.
 */

package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex06_ComptaCaracter {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix una frase: ");
        String frase = entrada.nextLine();
        
        System.out.print("Introdueix una caracter: ");
        char caracter = entrada.next().charAt(0);
        
        int comptador = 0;
        for (int i = 0; i < frase.length(); ++i)
        {
            if (frase.charAt(i) == caracter)                
                ++comptador;
        }
        
        System.out.println("El caràcter \'" + caracter + "\' apareix " + 
                            comptador + " vegades.");
    }
}
