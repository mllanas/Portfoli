/*
 * Fes un programa que ens demani un nombre natural n ( entre 1 i 20) i ens 
 * escrigui en pantalla la suma i el producte dels n primers nombres naturals 
 * (1, 2, 3,.....,n).
 *
 * OUTPUT:
 *   7 -->  Suma    : 28
 *          Producte: 5040
 *   52 --> Valor fora de rang!
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex03_SumaProducteNaturals {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix un nombre natural [1-20]: ");
        int nombre = entrada.nextInt();
        
        // Comprovar si el nombre està dintre de l'interval
        if ((nombre > 20) || (nombre < 1))
            System.out.println("Valor fora de rang!");     
        else                
        {
            // Si ok, realitzar càlculs:
            int suma = 0;
            long producte = 1L;
            for (int i = 1; i <= nombre; i++)
            {
                suma += i;
                producte *= i; 
            }

            System.out.println("Suma    : "+ suma);
            System.out.println("Producte: "+ producte);
        }
    }
}
