/*
 * Fes un programa que ens demani una cadena de car�cters i ens digui quantes 
 * maj�scules i min�scules cont�. 
 * Podeu utilitzar els m�todes "Character.isUpperCase(...) " i 
 * "Character.isLowerCase(...)"
 * 
 * Input:
 * Felipe Juan Froil�n de Todos los Santos de Marichalar y Borb�n
 * Output:
 * La frase cont� 7 maj�scules
 * La frase cont� 45 min�scules
 * La frase cont� 10 altres car�cters
 */

package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex03_ComptaMajusMinus {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine();

        int majuscules = 0, minuscules = 0, altres = 0;
        for (int i = 0; i < frase.length(); ++i) // Recorro caracters
        {      
            if (Character.isUpperCase(frase.charAt(i))) // Si trobo una maj�scula
                ++majuscules;
            else if (Character.isLowerCase(frase.charAt(i)))  // Si trobo una min�scula
                ++minuscules;           
            else
                ++altres;
        }      

        System.out.println("La frase cont� " + majuscules + " maj�scules");
        System.out.println("La frase cont� " + minuscules + " min�scules");
        System.out.println("La frase cont� " + altres + " altres car�cters");
    }
}
