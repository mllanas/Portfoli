/*
 * Fes un programa que demani nombres enters per teclat, fins que entrem un 
 * zero, i ens respongui quin �s el m�xim i quin �s el m�nim.
 * 
 * Input:
 * 3
 * -14
 * 1
 * 0
 * Output:
 * M�nim: -14
 * M�xim: 3 
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex10_MaximMinim {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Inicialitzar variables
        int maxim = 0;
        int minim = 0;
        int nombre = 1;
        
        while (nombre != 0)
        {    
            // Demano nombre
            System.out.print("Introdueix un nombre (0 per acabar): ");
            nombre = entrada.nextInt();
        
             if (nombre < minim)        // Guardo valor minim
                 minim = nombre;
             
             else if (nombre > maxim)   // Guardo valor maxim
             {
                maxim = nombre;
             }
        }
        
        // Quan s'entri un zero (0), mostrar resultats:
        System.out.println("M�nim: " + minim);
        System.out.println("M�xim: " + maxim);
    }
}
