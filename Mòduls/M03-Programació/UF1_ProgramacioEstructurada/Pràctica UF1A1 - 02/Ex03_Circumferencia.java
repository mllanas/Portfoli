/*
 * Fes un programa que demani el radi d'una circumferència i ens retorni la seva 
 * longitud, la seva àrea i el volum de l'esfera corresponent. 
 * (longitud = 2*pi*r, àrea = pi*r2, volum = (4/3)*pi*r3).
 * 
 * La sortida haurà d'estar formatada per visualitza 3 xifres decimals.
 * Exemple:
 *  Entrada:
 *  3
 *  Sortida:
 *  La seva longitud és: 18.850
 *  L'àrea del cercle és: 28.274
 *  El volum de l'esfera és: 113.097
 */
package cat.copernic.m03.uf1a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex03_Circumferencia {
    
    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("en","US"));
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueixi el radi de la circumferència: ");         
        double radi = entrada.nextDouble();
        
        final double PI = Math.PI;
        double longitud = 2 * PI * radi;
        System.out.printf("La seva longitud és: %.3f\n", longitud);
        
        double area = PI * (radi*radi);
        System.out.printf("L'àrea del cercle és: %.3f\n", area);
        
        double volum = (4*PI*radi*radi*radi)/3;
        System.out.printf("El volum de l'esfera és: %.3f\n", volum);
    }
    
}
