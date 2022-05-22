/*
 * Fes un programa que ens demani la mida de l'aresta d'un tetraedre regular i 
 * ens calculi la seva superfície i el seu volum.
 *
 * Exemple:
 *  Entrada:
 *  4.4 
 *  Sortida:
 *  Superfície: 33.53
 *  Volum: 10.04
 */
package cat.copernic.m03.uf1a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex09_Tetraedre {
    
    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("en","US"));
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix l'aresta del tetraedre: ");
        Double aresta = entrada.nextDouble();
        
        Double superficie = Math.sqrt(3) * Math.pow(aresta,2);
        System.out.printf("La superfície del tetraedre és: %.2f\n", superficie);
        //v2: System.out.printf("Superfície: %.2f\n", Math.sqrt(3) * aresta * aresta);
        Double volum = (Math.sqrt(2)/12) * Math.pow(aresta,3);
        System.out.printf("El volum del tetraedre és: %.2f\n", volum);
        //v2: System.out.printf("Volum: %.2f\n", aresta * aresta * aresta / (6 * Math.sqrt(2)));
    }
    
}
