/*
 * Fes un programa que ens vagi recollint notes de classe (0, 1, 2 ,3...10) fins
 * rebre una dada no vàlida (<0 o >10) i anar creant un vector amb les
 * freqüències de cada nota que després mostrarem per pantalla.
 * 
 * Input:
 * 10
 * 9
 * 10
 * 8
 * 10
 * 9 
 * 0
 * 11
 * Output:
 * La nota 0 ha sortit 1 vegades
 * La nota 1 ha sortit 0 vegades
 * La nota 2 ha sortit 0 vegades
 * La nota 3 ha sortit 0 vegades
 * La nota 4 ha sortit 0 vegades
 * La nota 5 ha sortit 0 vegades
 * La nota 6 ha sortit 0 vegades
 * La nota 7 ha sortit 0 vegades
 * La nota 8 ha sortit 1 vegades
 * La nota 9 ha sortit 2 vegades
 * La nota 10 ha sortit 3 vegades
 */

package cat.copernic.m03.uf1a5;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex03_FrequenciesNotes {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // 1. Introduir notes
        int[] comptadorNotes = new int [11]; // Totes les posicions estan inicialitzades a 0
        
        int nota= 0;
        boolean notaCorrecte = true;
        while (notaCorrecte)
        {
            System.out.print("Introdueix una nota (de 0 a 10, o un valor diferent per sortir): ");
            
            // 2. Validar input
            if(!(entrada.hasNextInt()))
            {  
                System.out.println("Entrada invàlida!");
                entrada.next();
            }else
            {
                nota = entrada.nextInt();
                if(nota < 0 || nota > 10)
                    notaCorrecte = false;  // Forma més purista de finalitzar un programa: utilitzar un xivato (boolean)                                
                else
                    ++comptadorNotes[nota]; // Com que la nota (valor) i la posició (índex) coincideixen, no cal especificar una condició
            }
                
        }
        
        entrada.close();
        
        // OUTPUT
        for(int i =0; i<comptadorNotes.length; ++i)
        {
            System.out.println("La nota "+i+" ha sortit "+ comptadorNotes[i]+ " vegades"); 
        }
        
    }
}
