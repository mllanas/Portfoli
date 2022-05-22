/*
 * Fes un programa que ens demani dos valors enters a l'usuari (A i B) i ens 
 * mostri la suma (A + B), la resta (A – B), la multiplicació (A * B), el 
 * quocient de la divisió entera (A div B), el residu de la divisió entera  
 * (A mod B), i la divisió real (A / B).
 * 
 * Exemple:
 *  Entrada:
 *  7
 *  2
 *  Sortida:
 *  Suma = 9
 *  Resta = 5
 *  Multiplicació = 14
 *  Quocient = 3
 *  Residu = 1
 *  Divisió real = 3.500
 */
package cat.copernic.m03.uf1a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex04_OperacionsEnters {
    
    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("en","US"));
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix el valor enter A: ");
        int a = entrada.nextInt(); // 7
        
        System.out.print("Introdueix el valor enter B: ");
        int b = entrada.nextInt(); // 2
        
        int suma = a+b ;
        System.out.println("Suma = " + suma);        
        int resta = a-b ;
        System.out.println("Resta = " + resta);
        int multiplicacio = a*b ;
        System.out.println("Multiplicació = " + multiplicacio);
        int quocient = a/b ;
        System.out.println("Quocient = " + quocient);
        int residu = a%b ;
        System.out.println("Residu = " + residu);
        double divisioReal = (double)a/b ;
        System.out.printf("Divisió real = %.3f\n", divisioReal);
        
    }
    
}
