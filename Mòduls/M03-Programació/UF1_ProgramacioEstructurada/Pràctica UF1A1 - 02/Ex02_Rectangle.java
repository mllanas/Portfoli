/*
 * Fes un programa que demani  l'alçada i l'amplada d'un rectangle i ens retorni
 * el seu perímetre i la seva superfície. Fes la sortida amb 2 xifres decimals.
 * 
 * Exemple:
 *  Entrada:
 *  2.5
 *  3.5
 *  Sortida:
 *  Perímetre: 12.00
 *  Superfície: 8.75
 */
package cat.copernic.m03.uf1a1;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author txell
 */
public class Ex02_Rectangle {
    
    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("en","US"));
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix l'alçada del rectangle: ");         
        double alt = entrada.nextDouble();
        
        System.out.print("Introdueix l'amplada del rectangle: ");
        double ample = entrada.nextDouble();
        
        double perimetre = 2*alt + 2*ample;
        System.out.printf("El perímetre del rectangle és: %.2f\n", perimetre);
        double superficie = alt * ample;
        System.out.printf("La superfície del rectangle és: %.2f\n", superficie);
    }
    
}
