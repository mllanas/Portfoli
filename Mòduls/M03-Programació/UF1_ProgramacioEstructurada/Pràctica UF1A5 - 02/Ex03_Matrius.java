/*
  * Fes un programa que ens demani els valors d'una matriu 4x4. A continuació,
 * ens ha de mostrar la matriu, després la traça (la suma de la diagonal) i,
 * finalment, la matriu transposada (canviant files per columnes). Nota: Fixa't
 * que els valors de les matrius es mostren separats per tabulacions excepte a
 * la última columna que no es posa una tabulació extra al final.
 * 
 * Input:
 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * Output:
 *  1    2   3	 4
 *  5	 6   7	 8
 *  9	10  11	12
 * 13	14  15	16
 * 
 * Traça: 34
 * 
 * Matriu transposada:
 * 1	5    9	13
 * 2	6   10	14
 * 3	7   11	15
 * 4    8   12	16
 */

package cat.copernic.m03.uf1a5;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex03_Matrius {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        // 1. INPUT
        final int NUM_ELEMENTS = 4;
        int[][] nombres = new int[NUM_ELEMENTS][NUM_ELEMENTS];        
        for(int i = 0; i < nombres.length; ++i)
        {
            for(int j = 0; j < nombres[i].length; ++j)
            {
                System.out.print("Valor: ");
                nombres[i][j] = entrada.nextInt();
            }
        }
        
        // 2. MOSTRAR MATRIU
        for(int i = 0; i < nombres.length; ++i)
        {
            for(int j = 0; j < nombres[i].length; ++j)
            {
                if (j == nombres[i].length-1)
                    System.out.println(nombres[i][j]);
                else
                    System.out.print(nombres[i][j] + "\t");  
            }
        }
        System.out.println();
        
        // 3. TRAÇA
        int traca = 0;
        for(int i = 0, j = 0; i < nombres.length; ++i, ++j)
        {
            traca += nombres[j][i];
        }
        System.out.println("Traça: " + traca);
        System.out.println();
        
        // 4. MATRIU TRANSPOSADA
        System.out.println("Matriu transposada:");
        for(int i = 0; i < nombres.length; ++i)
        {
            for(int j = 0; j < nombres[i].length; ++j)
            {
                if (j == nombres[i].length-1)
                    System.out.println(nombres[j][i]);
                else
                    System.out.print(nombres[j][i] + "\t");  
            }
        }
        
        entrada.close();
    }
}
