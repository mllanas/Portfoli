/*
 * Fes un programa que ens demani una cadena però que només es puguin introduir
 * [que elimini tot el que no siguin] lletres i espais. 
 * 
 * Podeu utilitzar el mètode " Character.isLetter(...) "
 * 
 * Input:
 * public static void main(String[] args) {
 * Output:
 * public static void mainString args
 */

package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex03_NomesLletresEspais {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introdueix una cadena:");        
        String frase = entrada.nextLine();
        
        String fraseFinal = "";
        for(int i = 0; i < frase.length(); i++) 
          if (Character.isLetter(frase.charAt(i)) || frase.charAt(i) == ' ')
                fraseFinal +=frase.charAt(i);
                
        System.out.println(fraseFinal);
        entrada.close();
    }
}
