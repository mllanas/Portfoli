/*
  * Fes un programa amb una classe anomenada Quadrat que demani a l’usuari la 
 * longitud del costat d’un quadrat, un caràcter i el representi per pantalla 
 * utilitzant aquest caràcter, sent cada caràcter equivalent a una unitat de 
 * longitud. 
 * S’ha de controlar que el valor indicat per l’usuari estigui entre 2 i 80.
 * 
 * Input:
 * -6
 * 4
 * tt
 * X
 * Output:
 * La longitud no és correcta.
 * El caràcter ha de tenir longitud 1.
 * XXXX
 * XXXX
 * XXXX
 * XXXX
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex25_Quadrat {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);                
        
        // 1. Demano costat         
        int costat = 0;
        boolean correcte = false;  // Pressuposo TOTES les entrades com incorrectes    
        while (correcte == false)  // Mentres el valor introduït sigui incorrecte
        {
            System.out.print("Indica la longitud del quadrat (2 - 80): ");
            if (!(entrada.hasNextInt()))  // Si NO és un nombre: msg ERROR
            {
                System.out.println("La longitud no és correcta.");
                entrada.next();   // Fa un salt de línia i torna a començar el LOOP ( si el trec, executa un Loop infinit...) NOMÉS PER Strings/Chars

            } else   // Si és un nombre, però... 
            {
                costat = entrada.nextInt();
                if (!(costat > 2 && costat < 80)) // ...està FORA DE RANG: msg ERROR
                    System.out.println("La longitud no és correcta.");
                else
                    correcte = true;  // Si és un ENTER DINS DEL RANG, surto                          
            }
        }                       
            
        // 2. Demano caràcter
        entrada.nextLine();       
        boolean longitud = false;  // Pressuposo TOTES les entrades com incorrectes        
        while (longitud == false)  // Mentres la longitud del valor introduït sigui incorrecte
        {    
            System.out.print("caracter: ");
            String caracter = entrada.nextLine();
            
            if (!(caracter.length() == 1))
                System.out.println("El caràcter ha de tenir longitud 1.");
            else
            {
                // 3. Renderitzar QUADRAT:
                int linia = 1;   // Igualo a 1 pq almenys ha de dibuixar 1 línia
                while (linia <= costat) // Crea les FILES (de 1 a n)
                {
                    for (int i = 1; i <= costat; ++i)  // Crea les COLUMNES (de 1 a n)
                        System.out.print(caracter);  // Trec "ln" per ajuntar caracters

                    System.out.println();  // Provoco un salt de línia al final de la seqüència
                    ++linia;  // 1 línia completa, sumo la següent
                }
                
                longitud = true;  // Si la longitud és correcta, surto  
            }
        }
    }
}
