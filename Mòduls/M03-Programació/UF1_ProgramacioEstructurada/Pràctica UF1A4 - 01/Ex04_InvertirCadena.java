/*
 * Fes un programa que ens demani una cadena de car�cters i ens l'escrigui a 
 * l'inrev�s.
 * 
 * Input:
 * una cadena de car�cters
 * Output:
 * La cadena a l'inrev�s �s: sretc�rac ed anedac anu
 */

package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex04_InvertirCadena {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix una cadena de car�cters: ");
        String frase = entrada.nextLine();
    
        String fraseAlReves = " ";
        int totalCaracters = frase.length();
        for (int i = frase.length(); i > 0; --i) // Recorro caracters
        {
            fraseAlReves += frase.substring(i-1,i);  // Afegeixo lletres del final a l'inici.
        }
        
        entrada.close();
        
        System.out.println("La cadena a l'inrev�s �s:"+ fraseAlReves);
    }
}
