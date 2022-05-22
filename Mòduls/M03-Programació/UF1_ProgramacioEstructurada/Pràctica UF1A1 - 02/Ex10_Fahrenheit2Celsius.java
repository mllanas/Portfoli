/*
 * Fes un programa que ens demani una temperatura (T) expressada en graus
 * Fahrenheit i ens la converteixi a graus Celsius.
 * Exemple:
 *  Entrada:
 *  451.1
 *  Sortida:
 *  Temperatura en Celsius: 232.83
 */
package cat.copernic.m03.uf1a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex10_Fahrenheit2Celsius {
    
    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("en","US"));
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix temperatura en graus Fahrenheit: ");
        double fahrenheit = entrada.nextDouble();
        
        double celsius = (fahrenheit-32) / 1.8;   // v2: (fahrenheit - 32) * 5 / 9);
        System.out.printf("La temperatura en graus Celsius és: %.2f\n", celsius);        
    }
    
}
