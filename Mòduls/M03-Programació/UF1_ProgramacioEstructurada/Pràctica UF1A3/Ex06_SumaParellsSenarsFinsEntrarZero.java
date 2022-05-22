/*
 * Fes un programa que demani nombres naturals per teclat, fins que entrem un 
 * zero, i ens respongui quant sumen els parells i els senars introduïts.
 * 
 * Intput:
 * 3
 * 14 
 * 1 
 * 6 
 * 0
 * Output:
 * La suma dels parells introduïts és: 20
 * La suma dels senars introduïts és : 4
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex06_SumaParellsSenarsFinsEntrarZero {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Inicialitzar variables
        int parell= 0;
        int senar= 0;
        int i = 0;
        int nombre = 1; // inicialitzo a 1 perquè s'iniciï el bucle
        
        while (nombre != 0)
        {    
            // Demano nombre
            System.out.print("Introdueix un nombre (0 per acabar): ");
            nombre = entrada.nextInt();
        
            if (nombre % 2 == 0)   // Sumar a parells
                parell += nombre;
            else                   // Sumar a senars
                senar  += nombre;
            i++;
        }
        
        // Quan s'entri un zero (0), mostrar resultats:
        System.out.println("La suma dels parells introduïts és: " + parell);
        System.out.println("La suma dels senars introduïts és : " + senar);
    }
}
