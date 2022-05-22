/*
 * Fes un programa que ens demani un nombre natural senar del 3 al 21 i ens 
 * generi el quadrat màgic corresponent carregant els valors a una matriu i 
 * mostrant-lo per pantalla. Si el valor introduït no és correcte, tornar a 
 * demanar-lo.
 * 
 * Nota 1: Fixa't que, quan es mostra el resultat del quadrat, cada valor ocupa 
 * l'amplada del més gran, alineat per la dreta.
 * 
 * Input:
 * 5
 * ---
 * 3
 * Output:
 * 17 24  1  8 15
 * 23  5  7 14 16
 *  4  6 13 20 22
 * 10 12 19 21  3
 * 11 18 25  2  9
 * ---
 * 8 1 6
 * 3 5 7
 * 4 9 2
 */

package cat.copernic.m03.uf1a5;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex05_QuadratMagic {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); 
        
        int dimensio = 0;        
        boolean valorCorrecte = true;
        do
        {
            System.out.print("Introdueixi la dimensió del quadrat màgic "
                             + "(senar entre 3 i 11): ");
            
            // 1. Validar input
            if(!(entrada.hasNextInt()))
            {  
                entrada.next();                
                valorCorrecte = false;
            }else
            {
                dimensio = entrada.nextInt();
                if((dimensio%2 != 0) && (dimensio <= 21 && dimensio >= 3))
                    valorCorrecte = true;              
                else
                    valorCorrecte = false;
            }
                
        } while (!valorCorrecte); 
        
        
        // 2. Omplir matriu
        final int NUM_ELEMENTS = dimensio*dimensio; // Nombre total de valors
        int[][] quadratMagicSenar = new int[dimensio][dimensio]; // Creo matriu   
        int nombre = 1; // valor inicial per començar a omplir la matriu  
        int fila = 0, posicio = quadratMagicSenar.length/2; // Començo pel mig
        
        while (nombre <= NUM_ELEMENTS)
        {          
            quadratMagicSenar[fila][posicio] = nombre; // Assigno el valor
            
            if (nombre % dimensio == 0) 
            {
                fila++;                 // Baixo una fila i mantinc posició
                posicio = posicio;
            }else                       
            {
                fila--;                 // Sinó, segueixo pujant en diagonal
                posicio += 1;
            }            
            
            // Actualitzo valors de fila/posició si em surto de la matriu:
            if (fila < 0) 
                fila = quadratMagicSenar.length-1;

            if (posicio > quadratMagicSenar.length-1)
                posicio = 0;
            
            nombre++; 
        }        
        
        // 3. Mostrar matriu
        // Variables per l'espaiat (amplada) de cada columna, permet escalabilitat
        double espaiat = Math.round((int)Math.log10(NUM_ELEMENTS) + 1);
        for(int i = 0; i < dimensio; ++i)
        {
            for(int j = 0; j < dimensio; ++j)
                System.out.printf("%" + (int)espaiat + "d ", quadratMagicSenar[i][j]);
            System.out.println();
        }
        entrada.close();
    }
}
