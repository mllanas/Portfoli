/*
 * Fes un programa amb una classe anomenada Rombe que demani a l�usuari 
 * l�amplada de la diagonal d�un rombe, un car�cter i el representi per pantalla
 * utilitzant aquest car�cter, essent cada car�cter equivalent a una unitat de 
 * longitud.
 * S�ha de controlar que el valor indicat per l�usuari sigui un nombre senar que
 * estigui entre 3 i 79.
 * 
 * Input:
 * 2
 * aaa
 * 15 
 * # 
 * Output:
 * La longitud no �s correcta.
 * La longitud no �s correcta.
 *        #
 *       ###
 *      #####
 *     #######
 *    #########
 *   ###########
 *  #############
 * ###############
 *  #############
 *   ###########
 *    #########
 *     #######
 *      #####
 *       ###
 *        #
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex27_Rombe {

     public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // 1. DEMANO AMPLADA DIAGONAL
        int diagonal = 0;   
        boolean valorOk = false; // Pressuposo TOTES les entrades com incorrectes        
        while (valorOk == false) // Mentres el valor introdu�t sigui incorrecte
        {
             if(!(entrada.hasNextInt())) // Si NO �s un nombre: msg ERROR
            {
                System.out.println("La longitud no �s correcta.");
                entrada.next(); // Fa un salt de l�nia i torna a comen�ar el LOOP ( si el trec, executa un Loop infinit...) NOM�S PER Strings/Chars
            } else  // Si �s un nombre, per�... 
            {
                diagonal = entrada.nextInt();  // (capturo entrada com a un enter per aplicar la condicio)
                
                if (diagonal%2 == 0) // ...�s parell: msg ERROR
                    System.out.println("La longitud no �s correcta.");
                else if (diagonal >= 3 || diagonal <= 79)
                    valorOk = true;  // Si �s un ENTER DINS DEL RANG, surto 
                else
                    System.out.println("La longitud no �s correcta.");
            }
        }
        
        // 2. DEMANO 1 sol CAR�CTER/S�MBOL     
        entrada.nextLine();  // Capturo un string despr�s d'un enter (netejo buffer)
        String caracter = "";
        boolean longitud = false; // Pressuposo TOTES les entrades com incorrectes    
        while (longitud == false) // Mentres la longitud sigui incorrecte
        {
            System.out.print("Indica el car�cter a utilitzar: ");
            caracter = entrada.nextLine();
            if (!(caracter.length() == 1)) // Si NO �s 1 sol car�cter: msg ERROR
                System.out.println("La longitud no �s correcta.");
            else    
                longitud = true;  // Si la longitud �s d'un sol car�cter, surto                           
        }
        
        
        // 3. DIBUIXO ROMBE
        int meitatRombe = diagonal/2 + 1;  // Separo el rombe en 2 pir�mides
        
        // Primera meitat (creixent)
        for (int fila = 1; fila <= meitatRombe; fila++) {   // Calculo la meitat + l'equador (base pir�mide)
 
            // Calculo posicions en blanc
            for (int colBlanca = 1; colBlanca <= (meitatRombe - fila); colBlanca++) // De 0 a n columnes
                System.out.print(" ");

            // Calculo posicions ocupades
            for (int colCaracter = 1; colCaracter <= (fila * 2 - 1); colCaracter++) // M�xim contrari a la meitatRombe (diagonal/2 + 1)
                System.out.print(caracter);

            System.out.println();
        }
        
        // Segona meitat (decreixent)
        for (int fila = 1; fila < meitatRombe; fila++) {  // Calculo l'altre meitat, sense l'equador
 
            // Calculo posicions en blanc
            for (int colBlanca = fila; colBlanca >= 1; colBlanca--)  // Loop de n a 1
                System.out.print(" ");

            // Calculo posicions ocupades
            for (int colCaracter = fila; colCaracter <= (diagonal-1-fila); colCaracter++) 
                System.out.print(caracter);
    
            System.out.println();
        }
    }
}
