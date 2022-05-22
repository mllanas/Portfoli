/*
 * Fes un programa amb una classe anomenada Rectangle que demani dos nombres 
 * naturals i representi un rectangle amb les columnes i files corresponents  
 * als valors demanats fent servir el car�cter �*�.
 * 
 * Input:
 * 5
 * 4
 * Output:
 * *****
 * *****
 * *****
 * *****
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex26_Rectangle {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // 1. Demano amplada         
        int amplada = 0;  
        boolean ampleOk = false;  // Ppressuposo TOTES les entrades com incorrectes
    
        while (ampleOk == false)  // Mentres el valor introdu�t sigui incorrecte
        {
            //System.out.print("Introdueix l�amplada del rectangle: ");
            if (!(entrada.hasNextInt()))  // si NO �s un nombre: msg ERROR
            {
                System.out.println("Valor incorrecte.");
                entrada.next();   // Fa un salt de l�nia i torna a comen�ar el LOOP ( si el trec, executa un Loop infinit...) NOM�S PER Strings/Chars

            } else   // Si �s un nombre, per�... 
            {
                amplada = entrada.nextInt();  // (capturo entrada com a un enter per aplicar la condicio)
                
                if (amplada <= 0) // ...�s 0 o negatiu: msg ERROR
                    System.out.println("Valor incorrecte.");
                else
                {
                    ampleOk = true;  // Si �s un ENTER DINS DEL RANG, surto  
                }                           
            }
        }
        
        // 2. Demano al�ada         
        int alcada = 0;  
        boolean altOk = false;  // Pressuposo TOTES les entrades com incorrectes
    
        while (altOk == false)  // Mentres el valor introdu�t sigui incorrecte
        {
            System.out.print("Introdueix l�al�ada del rectangle: ");
            if (!(entrada.hasNextInt()))  // Si NO �s un nombre: msg ERROR
            {
                System.out.println("Valor incorrecte.");
                entrada.next();   // Fa un salt de l�nia, torna a comen�ar el LOOP ( si el trec, executa un Loop infinit...) NOM�S PER Strings/Chars

            } else   // Si �s un nombre, per�... 
            {
                alcada = entrada.nextInt();  // (capturo entrada com a un enter per aplicar la condicio)
                
                if (alcada <= 0) // ...�s 0 o negatiu: msg ERROR
                    System.out.println("Valor incorrecte.");
                else
                    altOk = true;  // Si �s un ENTER DINS DEL RANG, surto                         
            }
        }
        
        // 3. Dibuixo rectangle
        int linia = 1;   // Igualo a 1 pq almenys ha de dibuixar 1 l�nia
        while (linia <= alcada) // Crea les FILES (de 1 a n)
        {
            for (int i = 1; i <= amplada; ++i)  // Crea les COLUMNES (de 1 a n)
                System.out.print("*"); // Trec "ln" per ajuntar caracters

            System.out.println();   // Provoco salt de l�nia final seq��ncia
            ++linia;                // 1 l�nia completa, sumo la seg�ent
        }        
    }
}
