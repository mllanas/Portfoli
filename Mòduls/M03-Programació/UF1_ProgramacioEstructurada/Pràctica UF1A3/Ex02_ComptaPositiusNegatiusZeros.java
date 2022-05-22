/*
 * Fes un programa que llegeixi 10 nombres enters per teclat i, al final, ens 
 * digui quants eren negatius, quants zero i quants positius.
 */
package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex02_ComptaPositiusNegatiusZeros {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix 10 nombres enters:");
        
        // Inicialitzar valors
        int positius = 0;
        int negatius = 0;
        int zeros = 0;
        // Recollir nombres
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Nombre "+ i + " = ");
            int nombre = entrada.nextInt();
            
            // Classificar-los segons:
            if (nombre > 0)
                positius += 1;
            
            else if (nombre < 0)
                negatius += 1;
            
            else
                zeros += 1;
        }
        
        System.out.println("Entre els valors que has introduït hi ha:");
        System.out.println(positius + " nombre/s positiu/s");
        System.out.println(negatius + " nombre/s negatiu/s");
        System.out.println(zeros + " nombre/s zero (0)");
        
    }

}
