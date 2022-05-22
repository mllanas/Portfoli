/*
 * Fes un programa que ens demani una nota (Enter entre 0 i 10) i ens escrigui 
 * per pantalla el seu literal. (0,1 i 2 -> Molt deficient; 3 i 4 -> Insuficient; 
 * 5 -> Suficient; 6 -> Bé; 7 i 8 -> Notable; 9 i 10 -> Excel·lent).
 * Exemple:
 *  Entrada:
 *  9
 *  Sortida:
 *  El literal de la nota és Excel·lent
 */
package cat.copernic.m03.uf1a2;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex07_NotaLiteral {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int nota = entrada.nextInt();
        
        switch (nota)
        {
            case 0:
            case 1:
            case 2:
                System.out.println("El literal de la nota és Molt deficient");
                break;
            case 3:
            case 4:
                System.out.println("El literal de la nota és Insuficient");
                break;
            case 5:
                System.out.println("El literal de la nota és Suficient");
                break;
            case 6:
                System.out.println("El literal de la nota és Bé");
                break;
            case 7:
            case 8:
                System.out.println("El literal de la nota és Notable");
                break;
            case 9:
            case 10:
                System.out.println("El literal de la nota és Excel·lent");
                break;
            default:
                System.out.println("Opció incorrecta");
        }
        
    }
    
}
