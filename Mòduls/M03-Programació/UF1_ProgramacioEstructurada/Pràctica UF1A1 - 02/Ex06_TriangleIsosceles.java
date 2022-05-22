/*
 * Fes un programa que ens demani l'alçada i l'amplada d'un triangle isòsceles i
 * ens retorni el seu perímetre i la seva superfície. Has d'utilitzar el teorema
 * de Pitàgores.
 * 
 * Exemple:
 *  Entrada:
 *  4.4
 *  6.6
 *  Sortida:
 *  Perímetre: 17.60
 *  Superfície: 14.52
 */
package cat.copernic.m03.uf1a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex06_TriangleIsosceles {
    
    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("en","US"));
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix l'alçada del triangle isòsceles: ");
        double altura = entrada.nextDouble();
        
        System.out.print("Introdueix l'amplada del triangle isòsceles: ");
        double base = entrada.nextDouble();
        
        double costat     = Math.sqrt(altura*altura+(base/2)*(base/2));
        double perimetre  = costat*2 + base ;
        double superficie = (base*altura)/2;
        
        System.out.println("costat: " + costat);
        System.out.printf("El perímetre del triangle és: %.2f\n", perimetre);
        System.out.printf("La superficie del triangle és: %.2f\n", superficie);
        
    }
    
}
