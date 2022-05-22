/*
 * Fes un programa que ens demani tres nombres (a, b i c) i ens mostri el major 
 * d'ells.
 * Exemple:
 *  Entrada:
 *  5
 *  7
 *  3
 *  Sortida:
 *  El més gran és: 7
 */
package cat.copernic.m03.uf1a2;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex06_TresNombresMesGran {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();
        
        if (num1 > num2)
        { 
            if (num1 > num3)
                System.out.println("El més gran és: "+ num1);
            else
                System.out.println("El més gran és: "+ num3);
            
        } else if (num2 > num3)        
            System.out.println("El més gran és: "+ num2);
        else        
            System.out.println("El més gran és: "+ num3);        
    }
}
