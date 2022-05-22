/*
 * Fes un programa que demani un nombre natural entre 1 i 3999 i el mostri en 
 * nombres romans.
 * Exemple:
 *  Entrada:
 *  1224
 *  Sortida:
 *  MCCXXIV
 */
package cat.copernic.m03.uf1a2;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex11_AnyTraspas {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("any: ");
        int any = input.nextInt();        
        
        if(any%4 == 0)
        {           
            if((any%100 == 0) & (any%400 != 0))
            {
                System.out.println("L'any "+ any +" NO és de traspàs.");
            } else
            {
                System.out.println("L'any "+ any +" és de traspàs.");
            }
        } else
        {
            System.out.println("L'any "+ any +" NO és de traspàs.");
        }       
        
    }

}
