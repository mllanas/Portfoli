/*
 * Fes un programa que ens demani dos nombres naturals (m i n) i ens calculi el 
 * màxim comú divisor (MCD) d'ells per l'algorisme d'Euclides dividint.
 * 
 * Input:
 * 60
 * 16
 * Output:
 * 60 % 16 = 12
 * 16 % 12 = 4
 * 12 % 4 = 0
 * MCD = 4 
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex18_MCD_dividint {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int dividend = entrada.nextInt();
        int divisor = entrada.nextInt();    
        int residu = 1;
        
        if (divisor < 1 ) // Si el divisor val zero o és negatiu 
            System.out.println("MCD = " + dividend);  // Mostro directament resultat del residu 
        else if (dividend < 1 ) // Si el dividend val zero o és negatiu
            System.out.println("MCD = " + divisor);   // Mostro directament resultat del residu 
        else
        {
            while (residu != 0) // Mentres el residu no sigui zero...
            {
                residu = dividend%divisor;  // Actualitzo valor del residu
                System.out.println(dividend + " % " + divisor + " = " + residu);
                
                // Actualitzo variables intercambiant valors:  valor divident = valor divisor  /  valor divisor = valor residu
                dividend = divisor;
                divisor = residu; 
            }
            System.out.println("MCD = " + dividend);
        }    
    }
}
