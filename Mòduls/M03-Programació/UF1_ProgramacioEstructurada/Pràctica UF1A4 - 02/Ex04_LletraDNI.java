/*
 * Fes un programa que ens demani la part numèrica del DNI i ens retorni la seva
 * lletra corresponent .
 * 
 * Algoritme explicat a la pàg del gobierno del Interior: 
 * 
 * Para verificar el NIF se divide el número entre 23 y el 'resto' se sustituye 
 * por la posición de la letra correspondiente:
 * 
 * residu: 0 1 2 3 4 5 ...
 * lletra: T R W A G M ...
 * 
 * Input:
 * 12345678
 * Output:
 * El DNI amb lletra és: 12345678-Z
 */

package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex04_LletraDNI {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introdueix la part numèrica del DNI:");
        int dni = entrada.nextInt();  
        
        // Creo una seqüència amb tots els caràcters a buscar (total: 23)
        String totalLletres = "TRWAGMYFPDXBNJZSQVHLCKE"; 
        
        // 1. Dividir dni entre 23, el residu indica la lletra
        int residu = dni%23;
        
        // 2. Assigno la lletra corresponent
        char lletra = totalLletres.charAt(residu);
        
        // 3. Mostro lletra    
        System.out.println("El DNI amb lletra és: " + dni+ "-" + lletra);

    }
}
