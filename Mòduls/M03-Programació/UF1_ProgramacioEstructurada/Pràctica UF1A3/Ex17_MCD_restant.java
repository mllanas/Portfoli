/*
 * Fes un programa que ens demani dos nombres naturals (m i n) i ens calculi el
 * màxim comú divisor (MCD) d'ells per l'algorisme d'Euclides. L'algorisme 
 * d'Euclides parteix dels dos nombres i mentre que no són iguals, va restant-li
 * al major el menor. Quan ja tenim el mateix valor en tots dos aquest és el 
 * màxim comú divisor.
 * 
 * Input:
 * 16
 * 60
 * Output:
 * 60 - 16 = 44
 * 44 - 16 = 28
 * 28 - 16 = 12
 * 16 - 12 = 4
 * 12 - 4 = 8
 * 8 - 4 = 4
 * MCD = 4 
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex17_MCD_restant {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        System.out.print("Introdueix un nombre natural: ");
        int nombre1 = entrada.nextInt();
        System.out.print("Introdueix un altre  natural: ");
        int nombre2 = entrada.nextInt();
        
        System.out.println("El màxim comú divisor de " + nombre1 + " i " + 
                            nombre2 + " és: ");
        int mcd = 0;         
        while (nombre1 != nombre2)  // Mentres els 2 nombres siguin DIFERENTS
        {   
            // Si un dels nombres val 0, el MCD serà l'altre nombre
            if (nombre1==0)  
            {
                mcd=nombre2;
                break;
            } else if (nombre2==0) 
            {
                mcd=nombre1;
                break;
            }
            
            if (nombre1 > nombre2) // Ordeno nombres per restar-los
            {
                mcd = nombre1-nombre2;                    
                System.out.println(nombre1 + " - " + nombre2 + " = " + mcd);
                nombre1 = mcd; // Assigno nou valor al nombre1
            } else
            {
                mcd = nombre2-nombre1;
                System.out.println(nombre2 + " - " + nombre1 + " = " + mcd);
                nombre2 = mcd; // Assigno nou valor al nombre2
            }
        }
        System.out.println("MCD = " + mcd);
    }
}
