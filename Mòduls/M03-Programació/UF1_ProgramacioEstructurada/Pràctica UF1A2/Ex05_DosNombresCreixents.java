/*
 * Fes un programa que ens demani dos nombres (a i b) y ens els escrigui en 
 * ordre creixent.
 * Exemple:
 *  Entrada 1:
 *  14
 *  3
 *  Sortida 1:
 *  Els teus nombres en ordre creixent són: 3, 14
 *  Entrada 2:
 *  31
 *  42
 *  Sortida 2:
 *  Els teus nombres en ordre creixent són: 31, 42 
 */
package cat.copernic.m03.uf1a2;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex05_DosNombresCreixents {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        
        if (num1 > num2)
        {
            System.out.println("Els teus nombres en ordre creixent són: "+ num2
                    +", "+ num1);
        } else
        {
            System.out.println("Els teus nombres en ordre creixent són: "+ num1
                    +", "+ num2);
        }
        
    }
    
}
