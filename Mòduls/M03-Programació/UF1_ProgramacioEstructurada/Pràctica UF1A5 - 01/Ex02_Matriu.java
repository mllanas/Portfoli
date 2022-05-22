/*
 * Fes un programa que ens demani un enter que serà el nombre N de columnes 
 * d'una matriu i, a continuació, mostri per pantalla la matriu de N columnes
 * i 4 files de enters que haurem de omplir de la següent manera: la primera 
 * fila contindrà els N primers nombres parells començant pel 2, la segona els 
 * quadrats de les N primeres xifres, la tercera amb la resta del valor de la 
 * primera i segona fila de la mateixa columna i la quarta amb la suma de les 
 * tres caselles anteriors de la mateixa columna.
 * 
 * Nota: Fes servir tabulacions per separar els valors de les columnes.
 * 
 * Input:
 * 4
 * Output:
 * 2	4	6	8	
 * 1	4	9	16	
 * 1	0	-3	-8	
 * 4	8	12	16	
 */

package cat.copernic.m03.uf1a5;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex02_Matriu {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        int columnes = entrada.nextInt();
        
        final int FILES = 4;

        int[][] matriu = new int[FILES][columnes];

        for (int i = 0; i < columnes; ++i)
        {
            // [0] primera fila: deu primers nombres parells
            matriu[0][i] = 2 * (i + 1);

            // [1] segona fila: els quadrats de les 10 primeres xifres
            matriu[1][i] = (i + 1) * (i + 1); // També funciona be, però és menys eficient: (int)Math.pow(i+1, 2);

            // [2] tercera fila: resta del valor de la primera i segona fila de la mateixa columna
            matriu[2][i] = matriu[0][i] - matriu[1][i];

            // [3] quarta fila: suma de les tres caselles anteriors de la mateixa columna
            matriu[3][i] = matriu[0][i] + matriu[1][i] + matriu[2][i];
        }
        
        // OUTPUT
        for (int[] fila : matriu)
        {
          for (int valor : fila)
              System.out.print(valor+"\t"); // Tabulador
          
          System.out.print("\n");
        }  
        
        entrada.close();

    }
}
