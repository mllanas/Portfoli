/*
 * Fes un programa que faci la mateixa ordenació de països que al primer 
 * exercici però fent servir el mètode sort() de la classe Collections.
 * 
 * Input:
 *  6
 *  Espanya
 *  Alemanya
 *  Noruega
 *  Suècia
 *  Dinamarca
 *  Portugal
 * Output:
 *  Països ordenats:
 *  Alemanya
 *  Dinamarca
 *  Espanya
 *  Noruega
 *  Portugal
 *  Suècia
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
        
        System.out.println("Països ordenats:");
        for(String element : vector)
            System.out.print(element+"\n");
        
    }
    
}
