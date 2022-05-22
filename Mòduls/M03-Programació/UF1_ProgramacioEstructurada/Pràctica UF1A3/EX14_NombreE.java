/*
 * Fes un programa que ens demani un nombre natural n i ens escrigui el valor 
 * del nombre e amb precisió n. 
 * El resultat s’haurà de donar amb 10 xifres decimals. 
 * (e n = 1/0! + 1/1! + 1/2! + 1/3! + ............ + 1/n!)
 * 
 * Input:
 * 8
 * 4
 * Output:
 * El nombre e amb precisió 8 és: 2.7182787698
 * El nombre e amb precisió 4 és: 2.7083333333
 */

package cat.copernic.m03.uf1a3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class EX14_NombreE {

    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("en", "US"));
        Scanner entrada = new Scanner(System.in);
                
        System.out.print("Introdueixi un nombre natural: ");
        int n = entrada.nextInt();
        
        double resultat = 0.0;
        
        // 1. RECORRER un LOOP per cada posició
        for (int i = 0; i<= n; ++i)
        {
            // 2. CALCULAR factorial de i! = 4! = 4*3*2*1
            int factorial = 1;
            for (int j = i; j > 1; --j) // optimització: no cal arribar a 1, pq multiplicar per 1 no aporta un nou valor, per tant (j>=1  --> j>1)
            {
                factorial *= j;   // el factorial de 0 és 1  !0 = 1,   
                // j=4   1 * 4 = 4
                // j=3   4 * 3 = 12
                // j=2   4 * 3 * 2 = 24
                // j=1   4 * 3 * 2 *1 = 24
                // j=0  surto del loop            
            }
            
            resultat += 1.0/factorial;  // passar el factorial a double, hi ha 2 maneres: 
                                        // forçar al numerador: 1.0/factorial; 
                                        // via càsting: (double)1/factorial; 
        }
        System.out.printf("El nombre e amb precisió "+ n +" és: %.10f\n", 
                          resultat);        
    }
}
