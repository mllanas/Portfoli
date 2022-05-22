/*
 * Fes un programa que ens escrigui la taula de multiplicar del nombre que li 
 * entrem per teclat.
 * Exemple:
 *  Entrada:
 *  7
 *  Sortida:
 *  7 x 1 = 7
 *  7 x 2 = 14
 *  7 x 3 = 21
 *  7 x 4 = 28
 *  7 x 5 = 35
 *  7 x 6 = 42
 *  7 x 7 = 49
 *  7 x 8 = 56
 *  7 x 9 = 63
 *  7 x 10 = 70
 */
package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex01_TaulaDeMultiplicar {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);        
        System.out.print("Introdueix un nombre natural: ");
        int nombre = entrada.nextInt();
        
        System.out.println("La taula de multiplicar del "+ nombre +" és:");        
        for (int i = 1; i <= 10; i++)
        {
            int resultat = nombre * i;
            System.out.println(nombre +" x "+ i +" = "+ resultat);
        }
        
    }

}
