/*
 * Fes un programa que demani un valor N i, a continuaci�, N pa�sos.
 * El programa tornar� els pa�sos ordenats pel m�tode de la bombolla. 
 * 
 * Per fer-ho, crearem el m�tode: 
 * static XXXX ordenaBombolla(YYYY paisos)
 * 
 * On XXXX  seran els tipus de retorn i YYYY el del par�metre del m�tode que 
 * omplireu vosaltres.
 * 
 * Input:
 * 5
 * Fran�a
 * Portugal
 * Su�cia
 * Estats Units
 * It�lia
 * Output:
 * Pa�sos ordenats:
 * Estats Units
 * Fran�a
 * It�lia
 * Portugal
 * Su�cia
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
        System.out.println("Pa�sos ordenats:");
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
