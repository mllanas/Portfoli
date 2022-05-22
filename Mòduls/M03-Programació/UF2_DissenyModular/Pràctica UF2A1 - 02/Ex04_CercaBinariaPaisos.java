/*
 * Fes un programa que faci la mateixa ordenació de països que al primer 
 * exercici però fent servir el mètode sort() de la classe Collections.
 * 
 * Input:
 *  5
 *  Estats Units
 *  França
 *  Itàlia
 *  Portugal
 *  Suècia
 * Portugal
 * Output:
 *  Total passades: 2
 *  Trobat a la posició: 3
 */

package cat.copernic.m03.uf2a1;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex04_CercaBinariaPaisos {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int casos = input.nextInt();
        input.nextLine();
        
        // Omplir array
        String[] paisos = new String[casos];        
        for(int i = 0; i < paisos.length; i++)
            paisos[i] = input.nextLine();            
        
        // Element a cercar
        String elementACercar = input.nextLine();        
        int posicio = cercaBinaria(paisos, elementACercar);                      
        if (posicio != -1)
            System.out.println("Trobat a la posició: " + posicio);
        else
            System.out.println("No trobat");
        
        input.close();
        
    }    
    static int cercaBinaria(String[] array, String valor) {
        int comptadorPassades = 0;
        boolean trobat = false;
        int index = 0, indexEsq = 0, indexDret = array.length - 1;                
        while (indexEsq <= indexDret) 
        {
            comptadorPassades++;
            
            index = (indexDret + indexEsq)/2;
            if (array[index].equals(valor)) 
            {
                trobat = true;
                break;                
            }
            if (array[index].compareTo(valor) < 0)
                indexEsq = index + 1;
            else
                indexDret = index - 1;
        }                               
        System.out.println("Total passades: " + comptadorPassades);

        if (trobat)
            return index;        
        return -1;
    }
    
}
