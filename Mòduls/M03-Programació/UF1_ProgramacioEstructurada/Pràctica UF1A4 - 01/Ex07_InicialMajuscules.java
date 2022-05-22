/*
 * Fes un programa que ens demani una frase i ens l'escrigui amb la inicial de 
 * cada paraula en maj�scules.
 * Podeu utilitzar el m�tode "Character.toUpperCase(...) "
 * 
 * Input:
 * felipe juan froil�n de todos los santos de marichalar y borb�n
 * Output:
 * La frase amb les inicials en maj�scules �s:
 * Felipe Juan Froil�n De Todos Los Santos De Marichalar Y Borb�n
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
        
        System.out.print("Introdueix una cadena de car�cters: ");
        String frase = entrada.nextLine().toLowerCase(); // Resetejo a min�scules
                
        boolean esMajuscula = true; // Pposo a true per contemplar el caracter de la primera posici�. Quan el xivato �s TRUE, indica que cal aplicar una MAJ�SCULA
        
        System.out.println("La frase amb les inicials en maj�scules �s:");
        
        for(int i = 0; i < frase.length(); ++i)
        {         
            if (esMajuscula)
            {               
                System.out.print(Character.toUpperCase(frase.charAt(i))); // Des de la posici� 0 fins la primera lletra  
                esMajuscula = false; // Apago el xivato per seguir recorreguent l'string fins a trobar el pr�xim espai, llavors activar� el xivato per aplicar una maj�scula
            } else
                System.out.print(frase.charAt(i)); // Imprimim en min�scules fins a trobar el pr�xim esapai
            
            if (frase.charAt(i) == ' ') // Si en aquesta posici� hi ha un espai...      
                esMajuscula = true; // Activo xivato: el pr�xim car�cter va en MAJ�SCULES!
        }        
    }
}
