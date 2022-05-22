/*
 * Fes un programa que ens demani el grau d'un polinomi (n), el valor de la 
 * variable (x) i els seus coeficients (a0, a1, a2, ... , an)  i ens calculi el  
 * seu valor.
 * 
 * a0x0 + a1x1 + a2x2 +a3x3 + ... + anxn
 * 
 * Input:
 * 2
 * 3
 * 1
 * 0
 * -1
 * 10
 * Output:
 * El valor del polinomi és: 77.0000
 */

package cat.copernic.m03.uf1a3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex19_AvaluaPolinomi_creixent {

    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("en", "US")); // Sempre abans de l'Scanner
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix grau del polinomi (>=0): ");
        float grau = entrada.nextFloat();
        System.out.print("Introdueix el valor de la variable (x): ");
        float x = entrada.nextFloat();
        
        float resultat = 0;    
        for (int i =0; i<=grau; i++)
        {
            System.out.print("Introdueix coeficient de grau "+i+": ");
            float coeficient = entrada.nextFloat();
            resultat += coeficient*Math.pow(x, i);
        }
        
        System.out.printf("El valor del polinomi és: %.4f\n", resultat);  // Mostro 4 decimals
    }
}
