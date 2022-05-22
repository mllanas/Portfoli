/*
 * Fes un programa que demani un valor N generi un vector amb els N primers 
 * nombres primers. Per verificar si un nombre és primer s’haurà de crear un 
 * mètode que rebi com a paràmetre el nombre a verificar i retorni si és o no 
 * primer:
 * static boolean esNombrePrimer(int nombre)
 * 
 * A més, necessitarem fer un mètode per mostrar el vector:
 * tatic void mostrarVector(int[] primers)
 * 
 * El programa haurà de respectar el format de sortida indicat a l'exemple amb 
 * comes i punt al final.
 * 
 * Input:
 * 8
 * 100
 * Output:
 * 2, 3, 5, 7, 11, 13, 17, 19.
 * ---
 * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 
 * 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 
 * 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 
 * 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 
 * 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 
 * 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 
 * 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 
 * 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 
 * 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 
 * 467, 479, 487, 491, 499, 503, 509, 521, 523, 541.
 */

package cat.copernic.m03.uf2a1;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex02_GeneraPrimers {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introdueixi el total de nombres primers: ");
        int totalPrimers = entrada.nextInt();
        entrada.close();

        int[] primers = new int[totalPrimers];
        int valor = 2, comptadorPrimers = 0;

        while (comptadorPrimers < totalPrimers) 
        {
            esNombrePrimer(valor);

            if (esNombrePrimer(valor))             
                primers[comptadorPrimers++] = valor;
            
            ++valor;
        }

        mostrarVector(primers);

    }

    static boolean esNombrePrimer(int nombre) {
        boolean esPrimer = true;
        for (int i = 2; i <= Math.sqrt(nombre); ++i) 
        {
            if (nombre % i == 0) 
            {
                esPrimer = false;
                break;
            }
        }
        return esPrimer;
    }

    static void mostrarVector(int[] primers) {
        for (int i = 0; i < primers.length; ++i) 
        {
            System.out.print(primers[i]);
            if (i < primers.length - 1) 
            {
                System.out.print(", ");
                if ((i + 1) % 10 == 0) 
                    System.out.println();
            } else
                System.out.println(".");            
        }
    }
    
}
