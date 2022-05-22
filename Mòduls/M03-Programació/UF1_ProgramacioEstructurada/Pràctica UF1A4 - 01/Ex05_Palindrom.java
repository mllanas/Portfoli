/*
 * Fes un programa que ens demani una cadena de car�cters i ens digui si �s o 
 * no pal�ndrom.
 * 
 * Input:
 * atrapa'l o l'aparta
 * atrapa'l o t'aparta
 * I rimeu que rimi i mireu que rimi i mireu que miri
 * Output:
 * La cadena �s un pal�ndrom.
 * La cadena NO �s un pal�ndrom.
 * La cadena �s un pal�ndrom.
 */

package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex05_Palindrom {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);        
        
        System.out.print("Introdueix una cadena de car�cters: ");        
        // Evito conflictes entre MAJUSCULES-MINUSCULES, i elimino espais
        String frase = entrada.nextLine().toLowerCase().replace(" ", "");  
        
        int siPalindrom = 0, noPalindrom = 0;
        for(int lletra = 0; lletra < frase.length()/2; ++lletra)
        {   
            if (frase.charAt(lletra) == frase.charAt(frase.length()-1-lletra))
                ++siPalindrom; // La frase �s capicua i sumo puntuaci�
            else
                ++noPalindrom;              
        }
        
        if(noPalindrom > 0) // Si noPal�ndrom val m�s que zero, significa que...
            System.out.println("La cadena NO �s un pal�ndrom.");
        else
            System.out.println("La cadena �s un pal�ndrom.");
    }
}
