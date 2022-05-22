/*
 * Fes un programa que ens demani un nombre gran de segons 
 * (< 1000,000,000,000,000,000) i ens digui quants dies, hores, minuts i segons
 * hi ha.
 * Utilitzeu el tipus de dada més adient per a cada variable (fixa't en l'exemple)!.
 * 
 * Exemple:
 *  Entrada:
 *  900000000000120130
 *  Sortida:
 *  900.000.000.000.120.130 segons =
 *  10.416.666.666.668 dies 1 hores 22 minuts 10 segons 
 */
package cat.copernic.m03.uf1a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex12_Segons {
    
    public static void main(String[] args) {
                
        Locale.setDefault(new Locale("es","ES"));
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueixi nombre gran de segons: ");
        long totalSegons = entrada.nextLong();
        
        long dies = totalSegons / (60 * 60 * 24);   // (segons * minuts * hores)
        long segons = totalSegons - dies * (60 * 60 * 24);
        
        int hores = (int)segons / (60 * 60);
        segons = segons - hores * 60 * 60;
        
        int minuts = (int)segons / 60;
        segons = segons % 60;

        System.out.printf("%,d segons = \n", totalSegons);
        System.out.printf("%,d dies  %d hores  %d minuts  %d segons", dies, hores, minuts, segons);        
        // Posar la coma davant la (d) mostra separació de milers en . ò , segons LOCALE (es/en)
    }
    
}
