/*
 * Fes un programa que ens demani un enter i ens digui si el valor entrat és un 
 * nombre capicua o no.
 * 
 * Input:
 * 123321
 * 12345
 * Output:
 * El nombre 123321 és capicua.
 * El nombre 12345 no és capicua.
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex24_EsCapicua_enters {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueixi un valor: ");
        int valor = entrada.nextInt();
        int aux = valor;  // Variable auxiliar per guardar el valor inicial pq després es modifica la variable valor...
        
        int invertit = 0; 
        // ex: 12321 (12321) => capicua
        // 1a volta: invertit = 1, valor = 1232  (12321/10)
        // 2a volta: invertit = 12, valor = 123  (1232/10)
        // 3a volta: invertit = 123, valor = 12  (123/10)
        // 4a volta: invertit = 1232, valor = 1  (12/10)
        // 5a volta: invertit = 12321, valor = 0  (1/10)
                
        do
        {
            invertit = (valor % 10) + invertit * 10;
            valor = valor/10;
        } while (valor > 0);
        
        valor = aux;
        if(valor == invertit)
            System.out.println("El nombre " + valor + " és capicua.");
        else
            System.out.println("El nombre " + valor + " no és capicua.");
    } 
}
