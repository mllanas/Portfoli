/*
 * Fes un programa que ens demani una frase i ens l'escrigui amb la inicial de 
 * cada paraula en majúscules.
 * Podeu utilitzar el mètode "Character.toUpperCase(...) "
 * 
 * Input:
 * felipe juan froilán de todos los santos de marichalar y borbón
 * Output:
 * La frase amb les inicials en majúscules és:
 * Felipe Juan Froilán De Todos Los Santos De Marichalar Y Borbón
 */

package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex07_InicialMajuscules {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix una cadena de caràcters: ");
        String frase = entrada.nextLine().toLowerCase(); // Resetejo a minúscules
                
        boolean esMajuscula = true; // Pposo a true per contemplar el caracter de la primera posició. Quan el xivato és TRUE, indica que cal aplicar una MAJÚSCULA
        
        System.out.println("La frase amb les inicials en majúscules és:");
        
        for(int i = 0; i < frase.length(); ++i)
        {         
            if (esMajuscula)
            {               
                System.out.print(Character.toUpperCase(frase.charAt(i))); // Des de la posició 0 fins la primera lletra  
                esMajuscula = false; // Apago el xivato per seguir recorreguent l'string fins a trobar el pròxim espai, llavors activaré el xivato per aplicar una majúscula
            } else
                System.out.print(frase.charAt(i)); // Imprimim en minúscules fins a trobar el pròxim esapai
            
            if (frase.charAt(i) == ' ') // Si en aquesta posició hi ha un espai...      
                esMajuscula = true; // Activo xivato: el pròxim caràcter va en MAJÚSCULES!
        }        
    }
}
