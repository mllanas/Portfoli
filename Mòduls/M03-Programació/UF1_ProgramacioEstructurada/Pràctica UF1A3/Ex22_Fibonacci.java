/*
 * Fes un programa que ens demani un nombre natural (n > 1) i ens escrigui els n 
 * primers termes de la successió de Fibonacci. 
 * (1, 1, 2, 3, 5, 8, 13, 21, 34, ...........).
 * 
 * Input:
 * 7
 * 15
 * Output:
 * 1 1 2 3 5 8 13 
 * 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex22_Fibonacci {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int nombreUsuari = entrada.nextInt();
        
        // Nombres comodí, parteixo d'ells per calcular-ho tot
        int n1= 0; 
        int n2 = 1;
        int nombreFibonacci;
        
        System.out.print(n2 + " "); // Imprimeixo un 1 inicial, després el segueix el loop
        
        for(int i = 1; i < nombreUsuari; ++i)
        {
            nombreFibonacci = n1+n2;
            System.out.print(nombreFibonacci + " ");
            n1=n2;
            n2=nombreFibonacci;  
            
                // 0: 0
                // 1: 1
                // 2: 0+1 = 1
                // 3: 1+1 = 2
                // 4: 2+1 = 3
                // 5: 3+1 = 5
                //...
        }
        
    } 
}
