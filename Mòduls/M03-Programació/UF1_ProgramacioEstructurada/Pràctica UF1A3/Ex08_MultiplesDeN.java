/*
 * Fes un programa que ens mostri per pantalla els múltiples de 5 majors que 1 i 
 * menors que 100.
 * Definiu el 5 i el 100 com a constants! Per exemple: N i MAX, respectivament).
 * 
 * Output:
 * Els múltiples de 5 majors que 1 i menors que 100 són:
 * 5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex08_MultiplesDeN {

    public static void main(String[] args) {
        
        final int N = 5;
        final int MAX = 100;
        
        System.out.println("Els múltiples de "+N+" majors que 1 i menors que "+ 
                            MAX +" són: ");
        
        // Creo un loop per llistar tots els nombres entre 1 i 100 (constant MAX)
        for (int i = 1; i < MAX; i++)
        {
            if (i%N == 0)   // Si el nombre actual és múltiple, llista'l
            System.out.print(i+" ");
        }      
        
    }
}
