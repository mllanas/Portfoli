/*
 * Fes un programa que ens demani una longitud (L) expressada en kilòmetres i 
 * ens la converteixi a milles.
 * Utilitzeu variables de tipus float! 
 * (Podeu utilitzar l'equivalència: 1 km = 0,621 milles).
 * 
 * Exemple:
 *  Entrada:
 *  141.707
 *  Sortida:
 *  Milles: 88.000 
 */
package cat.copernic.m03.uf1a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex11_Kilometres2Milles {
    
    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("en", "US"));
        Scanner entrada= new Scanner(System.in);
        
        System.out.print("Introdueixi distància en kilòmetres: ");
        float km = entrada.nextFloat();
        
        float milles = km*0.621f;
        System.out.printf("La distància en milles és: %.3f\n", milles);
    }
    
}
