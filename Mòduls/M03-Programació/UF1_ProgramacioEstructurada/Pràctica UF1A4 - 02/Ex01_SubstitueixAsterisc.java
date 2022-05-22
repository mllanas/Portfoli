/*
 * Fes un programa que ens demani dues frases. La primera ha de contenir un
 * asterisc. Ens ha d'escriure a la pantalla la primera frase a la que se l'ha
 * de canviar l'asterisc per la segona frase.
 * 
 * Input:
 * En * * * el que * en aquest *
 * CAP
 * Output:
 * En CAP CAP CAP el que CAP en aquest CAP
 */

package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex01_SubstitueixAsterisc {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introdueix una frase que contingui algun asterisc:");
        String frase = entrada.nextLine();
        System.out.println("Introdueix la frase que substituirà l'asterisc:");
        String paraula = entrada.nextLine();
        
        // Mètode 2: .indexOf(...) i .substring(...)        
        int indexAsterisc = 0;
        int indexInicial = 0;
        String fraseResultant = "";
        boolean quedenAsteriscs = true;
        do 
        {
            indexAsterisc = frase.indexOf("*", indexInicial); // Detecto la posició que conté un asterisc

            if (indexAsterisc != -1) 
            {
                fraseResultant += frase.substring(indexInicial, indexAsterisc) + paraula; // Des de l'inici (0) fins on hi ha un '*' acomulo les lletres fins arribar a "*"...
                indexInicial = indexAsterisc + 1;                                         // ... que canvio per la PARAULA
            } else 
                quedenAsteriscs = false;

        } while (quedenAsteriscs); // Mentres trobi "*", quan no en trobi tornarà un -1 pq el caràcter no existeix en cap posició

        System.out.println(fraseResultant);
        entrada.close();
    }
}
