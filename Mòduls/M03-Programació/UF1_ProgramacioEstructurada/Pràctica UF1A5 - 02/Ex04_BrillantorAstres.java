/*
 * Fes un programa que ens demani 10 valors que corresponen amb les brillantors
 * de 10 astres. A continuació, ens mostrarà la brillantor mitja, la més 
 * freqüent (moda) i la desviació típica.
 * 
 * Nota 1: Tots els valors de brillantors han de correspondre a enters entre 0 
 * i 9. El programa haurà de validar que no s'introdueixi cap valor fora 
 * d'aquest rang.
 * 
 * Nota 2: Els valors de mitja i desviació típica s'han de mostrar amb 2 
 * decimals.
 * 
 * Input:
 * 1 2 3 4 5 6 7
 * Output:
 * Brillantor mitja: 3.70
 * El valor més freqüent de brillantor és 3 que apareix 4 vegades.
 * Desviació típica: 1.73
 */

package cat.copernic.m03.uf1a5;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex04_BrillantorAstres {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        final int NUM_ELEMENTS = 10;
        int[] llistaValors = new int[NUM_ELEMENTS];
        int[] comptadorValors = new int[NUM_ELEMENTS];
        
        int valor = 0, comptador = 0, suma = 0;             
        do
        {
            System.out.print("Brillantor astre: ");
            valor = entrada.nextInt();
            
            // Comprovar valors brillantor (9 < n >= 0) i guardar-ne 'n' dins l'array
            if (valor >= 0 && valor < 10)
            {        
                llistaValors[comptador] = valor; 
                comptadorValors[valor] += 1;
                suma += valor;
                ++comptador;
            }
            
        }while(comptador < NUM_ELEMENTS);
               
        int valorMesRepetit = 0, numRepeticions = 0;
        for(int i = 1; i < comptadorValors.length; ++i)
        {
            if(comptadorValors[i-1] > valorMesRepetit)
            {
                valorMesRepetit = i-1; 
                numRepeticions = comptadorValors[i-1];
            }
            else if(comptadorValors[i] > valorMesRepetit)
            {
                valorMesRepetit = i; 
                numRepeticions = comptadorValors[i];
            }            
        }
        
        double mitja = 0.0, desviacio = 0.0;   
        mitja = (double)suma/llistaValors.length;        
        
        for(int i = 0; i < llistaValors.length; ++i)
        {
            desviacio += (llistaValors[i]- mitja) * (llistaValors[i]- mitja);
        }
        
        entrada.close();

        System.out.printf("Brillantor mitja: %.2f\n", mitja);
        System.out.println("El valor més freqüent de brillantor és " + 
                            valorMesRepetit + " que apareix " + numRepeticions +
                            " vegades.");
        System.out.printf("Desviació típica: %.2f\n", 
                           Math.sqrt(desviacio/NUM_ELEMENTS));
    }
}
