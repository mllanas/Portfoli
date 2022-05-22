/*
 * Escriu un programa que declari variables del tipus adequat i li assigni el valor segons es mostra a l’exemple. 
 * Faci les operacions matemàtiques indicades, emmagatzemant el resultat a noves variables i mostri el resultat 
 * amb el mateix format de l’exemple, utilitzant totes les variables.
 *
 * Exemple d'execució:
 *
 * a és 10, b és 27
 * a+b és 37
 * a-b és -17
 * a+b*3 és 91
 * b/2 és 13
 * b%10 és 7
 * x és 1.1
 * x*x és 1.2100000000000002
 * b/2 és 13
 * para és una paraula
 * caigudes és una altra paraula
 * Si les juntem tenim la paraula composta paracaigudes
 *
 */

package cat.copernic.m03.uf1a1;

/**
 *
 * @author txell
 */
public class Ex05_Operacions {
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 27;        
        
        // Output
        System.out.println("a és " + a +", b és " + b);
        
        int suma = a+b;
        System.out.println("a+b és " + suma);
        System.out.println("a-b és " + (a-b));
        System.out.println("a+b*3 és " + (a+b*3));
        System.out.println("b/2 és " + (b/2));
        System.out.println("b%10 és " + (b%a));        
        
        double x = 1.1;
        System.out.println("x és " + x);
        System.out.println("x*x és " + x*x);
        System.out.println("b/2 és " + (b/2));
        
        
        String paraula1="para";
        String paraula2 ="caigudes";
        System.out.println(paraula1 + " és una paraula");
        System.out.println(paraula2 + " és una altra paraula");
        System.out.println("Si les juntem tenim la paraula composta " + paraula1 
                                                                    + paraula2);
        
    }
    
}
