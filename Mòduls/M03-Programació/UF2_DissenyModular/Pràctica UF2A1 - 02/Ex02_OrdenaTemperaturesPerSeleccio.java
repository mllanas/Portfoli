/*
 * Fes un programa que demani un valor N i, a continuació, N temperatures.
 * El programa tornarà les temperatures  ordenades pel mètode de la selecció 
 * (la segona versió vista a classe). Per fer-ho, crearem el mètode:
 * 
 * static XXXX ordenaSelecció2(YYYY vector)
 * 
 * On XXXX  seran els tipus de retorn i YYYY el del paràmetre del mètode que 
 * omplireu vosaltres. A més, mostrarem el total de passades que hem hagut de fer.
 * 
 * Input:
 *  3
 *  2.1
 *  7.9
 *  3.4
 * Output:
 *  2.1 3.4 7.9 
 *  Total passades: 3
 */

package cat.copernic.m03.uf2a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex02_OrdenaTemperaturesPerSeleccio {
    
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Scanner input = new Scanner(System.in);

        int totalValors = input.nextInt();
        
        // Omplir array
        double[] temperatures = new double[totalValors];
        for (int i = 0; i < temperatures.length; i++) 
            temperatures[i] = input.nextDouble();

        // Ordeno temperatures
        ordenaSeleccio2(temperatures);

        input.close();
    }

    static void mostraVector(double[] vector) {
        for (double element : vector)         
            System.out.print(element + " ");        
        System.out.println("");
    }

    static void ordenaSeleccio2(double[] vector) {
        int comptadorPassades = 0;
        for (int i = 0; i < vector.length - 1; ++i) 
        {
            for (int j = i + 1; j < vector.length; ++j) 
            {
                comptadorPassades++;
                if (vector[i] > vector[j]) 
                {                    
                    double aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
        mostraVector(vector);
        System.out.println("Total passades: " + comptadorPassades);
    }
    
}
