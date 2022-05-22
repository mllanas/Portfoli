/*
 * Fes un programa que demani: Nom, primer cognom i segon cognom i que a la 
 * sortida escrigui el nom i cognoms complets.
 *
 * Exemple:
 *
 * Entrada:
 * Felipe Juan Froilán de Todos los Santos de Marichalar y Borbón
 * 
 * Sortida:
 * El seu nom complet és: Felipe Juan Froilán de Todos los Santos de Marichalar 
 * y Borbón
 *
 */
package cat.copernic.m03.uf1a1;

import java.util.Scanner; 

/**
 *
 * @author txell
 */
public class Ex01_NomCognoms {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); 
        System.out.print("Introdueixi el seu nom: ");         
        String nom = entrada.nextLine(); // Felipe Juan Froilán de Todos los Santos
        
        System.out.print("Introdueixi el seu primer cognom: ");
        String cognom1 = entrada.nextLine(); // de Marichalar
        
        System.out.print("Introdueixi el seu segon cognom: ");
        String cognom2 = entrada.nextLine(); // y Borbón
        
        System.out.println("El seu nom complet és: " + nom + " " + cognom1 + 
                           " " + cognom2);
        
    }
        
}
    

