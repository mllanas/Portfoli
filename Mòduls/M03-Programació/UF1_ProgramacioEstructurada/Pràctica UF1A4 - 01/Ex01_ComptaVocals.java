/*
 * Fes un programa que ens demani una frase i ens contesti quantes vocals conté.
 * 
 * Input:
 * No tingueu PRESSA per fer l'examen SORPRESA
 * Així és com MAI seràs el següent candidat
 * Output:
 * La frase conté 15 vocals.
 * La frase conté 16 vocals.
 */

package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex01_ComptaVocals {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix una frase: ");
        String frase = entrada.nextLine().toLowerCase();
        
        int vocals = 0;
        for (int i = 0; i < frase.length(); ++i)
        {
            if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'à') ||
                (frase.charAt(i) == 'e') || (frase.charAt(i) == 'è') || (frase.charAt(i) == 'é') ||
                (frase.charAt(i) == 'i') || (frase.charAt(i) == 'í') || (frase.charAt(i) == 'ï') ||
                (frase.charAt(i) == 'o') || (frase.charAt(i) == 'ò') || (frase.charAt(i) == 'ó') || 
                (frase.charAt(i) == 'u') || (frase.charAt(i) == 'ú') || (frase.charAt(i) == 'ü'))
                ++vocals;            
        }
        
        System.out.println("La frase conté " + vocals + " vocals.");
    }
}
