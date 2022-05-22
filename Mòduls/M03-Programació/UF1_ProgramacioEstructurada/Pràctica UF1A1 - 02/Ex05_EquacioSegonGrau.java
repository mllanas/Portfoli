/*
 * Fes un programa que ens demani els coeficients d'una equació de segon grau 
 * (a,b i c) i ens calculi les seves solucions.
 * Exemple:
 *  Entrada:
 *  -2
 *  6
 *  20
 *  Sortida:
 *  x1 = -2.00
 *  x2 = 5.00
 */
package cat.copernic.m03.uf1a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex05_EquacioSegonGrau {
    
    public static void main(String[] args) {    
    
        Locale.setDefault(new Locale("en","US"));
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Introdueix els coeficients de l'equació de segon grau:");
        
        System.out.print("a = ");
        double a =entrada.nextDouble();
        System.out.print("b = ");
        double b = entrada.nextDouble();
        System.out.print("c = ");
        double c = entrada.nextDouble();
    
        double x1, x2;     
          
        // Calcular només els discriminants (+,-)
        x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a); 
        x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        
        System.out.printf("La primera solució de l'equació és x1 =  %.2f\n", x1); 
        System.out.printf("La segona solució de l'equació és x2 =  %.2f\n", x2);  
    }   
}
