/*
 * Fes un programa que ens demani a l'usuari nom, edat, adreça, telèfon, sexe i 
 * escrigui quelcom semblant a: Em dic Alba, tinc 19 anys, sóc dona, la meva 
 * adreça és Lepant, 23 i el meu telèfon és el 937801111.
 * 
 * Exemple:
 *  Entrada:
 *  Alba
 *  19
 *  Lepant, 23
 *  937800000
 *  Dona
 *  Sortida:
 *  Em dic Alba, tinc 19 anys, sóc dona, la meva adreça és "Lepant, 23" i el meu
 *  telèfon és 937800000.
 */
package cat.copernic.m03.uf1a2;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex04_DadesPersonals {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("nom: ");
        String nom = entrada.nextLine();
        
        System.out.print("edat: ");
        int edat = entrada.nextInt();
        
        System.out.print("carrer: ");
        entrada.nextLine();
        String carrer = entrada.nextLine();
        System.out.print("telèfon: ");
        int telefon = entrada.nextInt();  // També es por capturar com a nextLine() i així no tinc que posar-ho després
        
        System.out.print("sexe: ");
        entrada.nextLine();
        String sexe = entrada.nextLine();
        
        System.out.println("Em dic "+ nom +", tinc "+ edat +" anys, sóc "+ sexe.toLowerCase() +", la meva adreça és \""+ carrer +"\" i el meu telèfon és "+ telefon +".");
    }
}
