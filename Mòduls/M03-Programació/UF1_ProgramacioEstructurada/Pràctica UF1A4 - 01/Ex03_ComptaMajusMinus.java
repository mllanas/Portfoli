/*
 * Fes un programa que ens demani una cadena de caràcters i ens digui quantes 
 * majúscules i minúscules conté. 
 * Podeu utilitzar els mètodes "Character.isUpperCase(...) " i 
 * "Character.isLowerCase(...)"
 * 
 * Input:
 * Felipe Juan Froilán de Todos los Santos de Marichalar y Borbón
 * Output:
 * La frase conté 7 majúscules
 * La frase conté 45 minúscules
 * La frase conté 10 altres caràcters
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
            if (Character.isUpperCase(frase.charAt(i))) // Si trobo una majúscula
                ++majuscules;
            else if (Character.isLowerCase(frase.charAt(i)))  // Si trobo una minúscula
                ++minuscules;           
            else
                ++altres;
        }      

        System.out.println("La frase conté " + majuscules + " majúscules");
        System.out.println("La frase conté " + minuscules + " minúscules");
        System.out.println("La frase conté " + altres + " altres caràcters");
    }
}
