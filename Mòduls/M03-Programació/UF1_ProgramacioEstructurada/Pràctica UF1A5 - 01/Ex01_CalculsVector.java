/*
 * Fes un programa que, del vector obtingut al problema anterior, ens calculi la
 * mitjana aritmètica dels deu valors, el valor màxim, el mínim i la seva suma.
 * 
 * Input:
 * 3
 * 1
 * 4
 * 1
 * 5
 * 9
 * 2 
 * 6
 * 5
 * 3
 * Output:
 * 3.90000
 * 9
 * 1
 * 39
 */

package cat.copernic.m03.uf1a5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex01_CalculsVector {

    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("en", "US"));
        Scanner entrada = new Scanner(System.in);
        
        final int TOTAL_VALORS = 10;
        
        // INPUT: guardo valors de l'usuari dins l'array
        int[] valors = new int[TOTAL_VALORS];
        for (int i = 0; i < valors.length; ++i)
        {
            System.out.print("Introdueix el valor de la posició " + i + ": ");
            valors[i] = entrada.nextInt(); 
        }
        
        // Suma + MAX/MIN de tots els valors
        int suma=0, maxim=0, minim = valors[0];
        for (int i = 0; i < valors.length; ++i)
        {                
            suma += valors[i];            
            
            if (valors[i] > maxim)
                maxim = valors[i];       
            else if (valors[i] < minim)        
                minim = valors[i];
        }
        
        entrada.close();
        
        System.out.printf("%.5f\n", (float)suma / TOTAL_VALORS);
        System.out.println(maxim);
        System.out.println(minim);
        System.out.println(suma);       
    }
}
