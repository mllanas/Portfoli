/*
 * Fes un programa que ens demani un nombre natural n i ens escrigui tots els 
 * seus divisors.
 * 
 * Fixa�t a la soluci� que no estan ordenats per optimitzar!
 * 
 * Input:
 * Introdueixi un nombre natural: 12
 * Introdueixi un nombre natural: 16
 * Output:
 * Els divisors de 12 s�n: 1 12 2 6 3 4
 * Els divisors de 16 s�n: 1 16 2 8 4 
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex15_DivisorsOptimitzat {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introdueixi un nombre natural:");
        int n = entrada.nextInt();
        
        System.out.print("Els divisors de "+ n +" s�n: ");
        /*
         Per optimitzar el nombre de c�lculs a fer, interessa establir un 
         interval m�nim de possibles nombres divisors d'n.
        
         Quan calculem un divisor d'N i el residu �s 0, el quocient tamb� �s 
         divisor d'N:   12 / 2(divisor) = 6(quocient)  // residu: 0
                        12 / 6(divisor) = 2(quocient)  // residu: 0
         Obtenim 2 divisors de cop (son parelles): "2 i 6"  �  "6 i 2"
        
         Tipus d'intervals possibles:
         Ex: n = 12;
         de 1 a n-1         // 1-11 <-- llarg
         de 1 a n/2         // 1-6
         de 1 a sqrt(n)     // 1-3  <-- curt  (menys calculs a fer)
        */      
        for (int i = 1; i <= Math.sqrt(n); ++i)
        {
            if (n%i == 0) // Si "n" es m�ltiple de "i"
            {
                System.out.print(i + " "); // mostro valor del divisor
                if (n/i != i) // Si el quocient de "n" NO �s igual a "i"
                    System.out.print(n/i + " "); // mostro valor del quocient
            }
        }
        
        System.out.println(); // salt de l�nia al final del llistat de divisors
    }
}
