/*
 * Fes un programa que ens llegeixi un nombre natural, l'introdueixi, xifra a
 * xifra, a un vector, i ens digui si és o no capicua.
 * 
 * Input:
 * 12321
 * 12341
 * Output:
 * El nombre 12321 té 5 xifres.
 * Xifra 1: 1
 * Xifra 2: 2
 * Xifra 3: 3
 * Xifra 4: 2
 * Xifra 5: 1
 * El teu nombre és capicua.
 * El nombre 12341 té 5 xifres.
 * Xifra 1: 1
 * Xifra 2: 2
 * Xifra 3: 3
 * Xifra 4: 4
 * Xifra 5: 1
 * El teu nombre NO és capicua.
 */

package cat.copernic.m03.uf1a5;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex04_Capicua {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); 
        
        String valor = "";
        boolean valorCorrecte = true;
        do
        {
            System.out.print("Introdueix un nombre natural: "); 
            
            // Validar input
            if(!(entrada.hasNextInt()))
            {
                entrada.next();
                valorCorrecte = false;
            }else
            {
                valor = entrada.nextLine();
                for(int i=0; i<valor.length(); ++i)
                {
                    if(Integer.parseInt(valor.substring(i, i+1)) > 0 || Integer.parseInt(valor.substring(i, i+1)) < 10)
                        valorCorrecte = true;             
                }                
            }                
        } while (!valorCorrecte); 
        
        // Assigno cada dígit de l'string a una posició dins un array
        int[] digits = new int [valor.length()];
        for(int i=0; i<valor.length(); ++i)
            digits[i] = Integer.parseInt(valor.substring(i, i+1));
        
        System.out.println("El nombre "+valor+" té "+valor.length()+" xifres.");
        
        // Mostrar dígits de l'array 
        for(int i=0; i<digits.length; ++i)
        {
            System.out.println("Xifra "+(i+1)+": "+digits[i]);
        }
        
        // Determinar si és capicua        
        boolean esCapicua = true;           
        for(int i=0; i<digits.length/2; ++i)
        {
            if(digits[i] != digits[digits.length-1-i])
            {
                esCapicua = false;
                break;
            }                   
        }             
     
        if(esCapicua)
            System.out.println("El teu nombre és capicua.");
        else
            System.out.println("El teu nombre NO és capicua.");
        
        entrada.close();
    }
}
