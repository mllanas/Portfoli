/*
 * Fes un programa que faci la mateixa ordenaci� de pa�sos que al primer 
 * exercici per� fent servir el m�tode sort() de la classe Collections.
 * 
 * Input:
 *  6
 *  Espanya
 *  Alemanya
 *  Noruega
 *  Su�cia
 *  Dinamarca
 *  Portugal
 * Output:
 *  Pa�sos ordenats:
 *  Alemanya
 *  Dinamarca
 *  Espanya
 *  Noruega
 *  Portugal
 *  Su�cia
 */

package cat.copernic.m03.uf2a1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex03_OrdenaPaisosSort {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int casos = input.nextInt();
        input.nextLine();
        
        // Omplir array
        ArrayList<String> paisos = new ArrayList<String>();
        for(int i = 0; i < casos; i++)
            paisos.add(input.nextLine()); 
        
        // Ordenar i mostrar array
        Collections.sort(paisos);       
        mostraVector(paisos);
        
        input.close();
    }
    
    static void mostraVector(ArrayList<String> vector){
        
        System.out.println("Pa�sos ordenats:");
        for(String element : vector)
            System.out.print(element+"\n");
        
    }
    
}
