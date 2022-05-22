/*
 * Fes un programa que ens demani dos nombres naturals (m i n) i ens calculi el 
 * mínim comú múltiple (mcm) d'ells sabent que m * n = mcm(m,n) * MCD(m,n).
 * 
 * Input:
 * 16
 * 60
 * Output:
 * MCD(16,60) = 240
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex20_MCM {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int m = entrada.nextInt();
        int n = entrada.nextInt();
        
        int mcd = 0;
        int mcm = 0;
        
        
        // Convertir nombres a valor absolut
        int n1 = Math.abs(m);
        int n2 = Math.abs(n);
        
        // Busco MCD d'n i m
        int residu = 0;
        if (n2 == 0) // Si el divisor val zero ( no es pot dividir entre zero...)
            mcd = n2;
        else
        {
            while (n1%n2 != 0) // Mentres ambdós nombres NO són divisors
            {
                residu = n1%n2; // Mostro resultat del residu            
                // Intercambio valors:  valor divident = valor divisor  /  valor divisor = valor residu
                n1 = n2;
                n2 = residu;
            }
            mcd = n2; 
        }
        
        // Busco mcm
        mcm = (m*n)/mcd;
        
        System.out.println("MCD(" + m + "," + n + ") = " + mcm);
    }
}
