/*
 * Fes un programa que ens demani un nombre enter N i, a continuació, torni els N 
 * primers nombres primers.
 * Nota: Fixa't al format en què es mostren amb les comes, els salts de línia i 
 * el punt final. Cada 10 valors, s'ha de fer un salt de línia.
 * 
 * Input:
 * 10
 * 12
 * Output:
 * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29.
 * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 
 * 31, 37.
 */

package cat.copernic.m03.uf1a5;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex01_VectorPrimersPrimers {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); 
        int numElements = entrada.nextInt();
        
        // Omplir array amb els n nombres primers
        int[] primers = new int[numElements];        
        int valor = 2, comptador = 0;  
        while (comptador < numElements)
        { 
            boolean primer = true; // Presuposo que TOTS són primers        
            for (int i = 2; i <= Math.sqrt(valor); ++i)
            {   
                if ((valor % i == 0)) 
                {
                    primer=false; // Dic que NO és PRIMER
                    break; // Forço el final del programa
                }               
            }

            if (primer) // Guardo valor si la condicio "primer" és certa
            {    
                primers[comptador] = valor;
                ++comptador; // Incremento el comptador
                // Codi Roberto equivalent: primers[comptador++] = valor;
            }
            valor++; // Incremento els valors a provar, poden o no ser primers
        }
        
        // OUTPUT
        int indexNovaFila = 9;
        for(int i = 0; i < numElements; ++i) // Mostrar n valors 'primers'
        {
            if(i == numElements-1) // Si és l'últim valor
                System.out.print(primers[i]+".");
            else
            {
                if(i == indexNovaFila)
                {
                    System.out.print(primers[i]+",\n");
                    indexNovaFila+=10;
                }else
                    System.out.print(primers[i]+", ");
            }
        }
        
        entrada.close();
    }
}
