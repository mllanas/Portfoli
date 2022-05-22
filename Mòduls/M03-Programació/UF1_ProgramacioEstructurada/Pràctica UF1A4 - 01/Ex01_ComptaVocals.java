/*
 * Fes un programa que ens demani una frase i ens contesti quantes vocals cont�.
 * 
 * Input:
 * No tingueu PRESSA per fer l'examen SORPRESA
 * Aix� �s com MAI ser�s el seg�ent candidat
 * Output:
 * La frase cont� 15 vocals.
 * La frase cont� 16 vocals.
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
            if ((frase.charAt(i) == 'a') || (frase.charAt(i) == '�') ||
                (frase.charAt(i) == 'e') || (frase.charAt(i) == '�') || (frase.charAt(i) == '�') ||
                (frase.charAt(i) == 'i') || (frase.charAt(i) == '�') || (frase.charAt(i) == '�') ||
                (frase.charAt(i) == 'o') || (frase.charAt(i) == '�') || (frase.charAt(i) == '�') || 
                (frase.charAt(i) == 'u') || (frase.charAt(i) == '�') || (frase.charAt(i) == '�'))
                ++vocals;            
        }
        
        System.out.println("La frase cont� " + vocals + " vocals.");
    }
}
