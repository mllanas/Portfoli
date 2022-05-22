/*
 * Fes un programa que ens demani el radi i l'alçada d'un cilindre i ens calculi
 * la seva superfície i el seu volum.
 * 
 * Exemple:
 *  Entrada:
 *  3.3
 *  4.4
 *  Sortida:
 *  Superfície: 159.66
 *  Volum: 150.53
 */
package cat.copernic.m03.uf1a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex08_Cilindre {
    
    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("en","US"));
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix el radi del cilindre: ");
        double radi = entrada.nextDouble();
        System.out.print("Introdueix el radi del cilindre: ");
        double altura = entrada.nextDouble();
        
        final double PI   = Math.PI;
        double perimetre  = 2*PI*radi*altura;
        double superficie = 2*PI*(radi*radi) + (perimetre);
        double volum = PI*(radi*radi)*altura; 
        System.out.printf("La superfície del cilindre és: %.2f\n", superficie);
        System.out.printf("El volum del cilindre és: %.2f\n", volum);
        
    }
}
