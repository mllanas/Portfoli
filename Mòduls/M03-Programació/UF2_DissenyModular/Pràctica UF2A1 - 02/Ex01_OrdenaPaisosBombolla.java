/*
 * Fes un programa que demani un valor N i, a continuació, N països.
 * El programa tornarà els països ordenats pel mètode de la bombolla. 
 * 
 * Per fer-ho, crearem el mètode: 
 * static XXXX ordenaBombolla(YYYY paisos)
 * 
 * On XXXX  seran els tipus de retorn i YYYY el del paràmetre del mètode que 
 * omplireu vosaltres.
 * 
 * Input:
 * 5
 * França
 * Portugal
 * Suècia
 * Estats Units
 * Itàlia
 * Output:
 * Països ordenats:
 * Estats Units
 * França
 * Itàlia
 * Portugal
 * Suècia
 */

package cat.copernic.m03.uf2a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex01_OrdenaPaisosBombolla {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int casos = input.nextInt();
        input.nextLine();

        // Omplir array
        String[] paisos = new String[casos];
        for(int i = 0; i < paisos.length; i++)
            paisos[i] = input.nextLine();            
        
        // Ordeno i mostro
        ordenaBombolla(paisos);        
        mostraVector(paisos);
        
        input.close();
    }
    static void mostraVector(String[] vector){
        System.out.println("Països ordenats:");
        for(String element : vector)
            System.out.print(element + "\n");
        System.out.println("");
    }
    static void ordenaBombolla(String[] vector){
        for(int i = 0; i < vector.length-1; i++)
        {            
            for(int j = 0; j < vector.length-1-i; j++)
            {
                if(vector[j].compareTo(vector[j+1]) > 0)
                {
                    String aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }  
        }
    }
    
}
