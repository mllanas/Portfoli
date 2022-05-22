/*
 * Fes un programa que ens demani un nombre natural ( n ) i ens escrigui la 
 * taula de divisi� entera mostrant el quocient i el seu residu.
 * 
 * Input:
 * 9
 * Output:
 * 9 / 1: quocient = 9 i residu = 0
 * 9 / 2: quocient = 4 i residu = 1
 * 9 / 3: quocient = 3 i residu = 0
 * 9 / 4: quocient = 2 i residu = 1
 * 9 / 5: quocient = 1 i residu = 4
 * 9 / 6: quocient = 1 i residu = 3
 * 9 / 7: quocient = 1 i residu = 2
 * 9 / 8: quocient = 1 i residu = 1
 * 9 / 9: quocient = 1 i residu = 0
 * 9 / 10: quocient = 0 i residu = 9
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex21_TaulaDivisioEntera {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // 1. Filtrar valor introdu�t
        int nombre = 0;
        boolean incorrecte = true; // Pressuposo TOTES les entrades com incorrectes
        do
        {
            System.out.print("Introdueixi un nombre natural: ");
            if(!(entrada.hasNextInt())) // Si NO �s un ENTER: msg ERROR
                entrada.next();   // Fa un salt de l�nia i torna a comen�ar el LOOP ( si el trec, executa un Loop infinit...) NOM�S PER Strings/Chars
            else   // Si �s un nombre enter, per�... 
            {
                nombre = entrada.nextInt();                
                if (nombre <= 0)        // ...�s NEGATIU o ZERO
                    entrada.next();
                else
                    incorrecte = false; // Si �s un ENTER POSITIU, surto 
            }
        } while (incorrecte);   // Mentres el valor introdu�t sigui incorrecte;
        
        // 2. Llistar valors
        for (int i = 1; i <=10; ++i)
        {
            int quocient= nombre/i;
            int residu = nombre%i;
            System.out.println(nombre + " / " + i + ": quocient = " + quocient +
                               " i " + "residu = " + residu); 
        }        
    }
}
