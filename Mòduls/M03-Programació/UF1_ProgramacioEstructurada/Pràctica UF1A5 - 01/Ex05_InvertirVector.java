/*
 * Fes un programa que ens demani un nombre enter N i, a continuació, llegeixi N 
 * nombres enters, els desi en un vector i, finalment,  mostri els valors del 
 * vector en ordre invers. 
 * 
 * Input:
 * 10
 * 5
 * 9
 * 7
 * 2
 * 6
 * 1
 * 8
 * 2
 * 0
 * 3
 * Output:
 * 3, 0, 2, 8, 1, 6, 2, 7, 9, 5.
 */

package cat.copernic.m03.uf1a5;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex05_InvertirVector {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueixi longitud total de nombres: ");
        int longitud_total = entrada.nextInt();
        
        System.out.println("Introdueixi "+ longitud_total +" nombres enters: ");
        
        int[] nombres = new int[longitud_total];
        for (int i = 0; i < longitud_total; ++i)
        {
            System.out.print("Introdueixi enter " + (i+1) + ": ");
            nombres[i] = entrada.nextInt();
        }
        
        System.out.println("El teu vector invertit és: ");
        
        for (int i = nombres.length-1; i >= 0; --i)
        {
            System.out.print(nombres[i]);
            if(i > 0)
                System.out.print(", ");
        }
        
        System.out.println(".");
        
        entrada.close();
    }
}
