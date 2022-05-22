/*
 * Escriu un programa que declari tres variables: un enter, un real i  
 * una cadena de text amb el nom que volgueu, les assigni els valors 
 * 207, 2.71828 i “M03 Programació” i ho mostri per pantalla amb el 
 * format indicat.
 *
 * Exemple d'execució:
 *
 * Aquesta és l'aula 207
 * El nombre d'Euler (e) s'aproxima a 2.71828
 * Estic estudiant M03 Programació
 *
 */
package cat.copernic.m03.uf1a1;

/**
 *
 * @author txell
 */
public class Ex03_Variables {

    public static void main(String[] args) {

        int aula = 207;
        double euler = 2.71828;
        String assignatura = "M03 Programació";

        System.out.println("Aquesta és l'aula " + aula);
        System.out.println("El nombre d'Euler (e) s'aproxima a " + euler);
        System.out.println("Estic estudiant " + assignatura);

    }

}
