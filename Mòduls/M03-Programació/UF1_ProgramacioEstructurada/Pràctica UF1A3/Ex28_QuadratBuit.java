/*
 * Fes un programa amb una classe anomenada QuadratBuit que demani a l�usuari la 
 * longitud del costat d�un quadrat, l�amplada de la vora, un car�cter, i el 
 * representi per pantalla utilitzant aquest car�cter, sent cada car�cter 
 * equivalent a una unitat de longitud.
 * S�ha de controlar que el valor indicat per l�usuari per la longitud estigui  
 * entre 2 i 80 i que el valor de la vora sigui superior o igual a 1 i inferior 
 * o igual a la meitat de la longitud indicada pr�viament per l�usuari.
 * 
 * Input:
 * 99
 * aaa
 * 15 
 * 12
 * ccc
 * 3
 * @
 * Output:
 * La longitud no �s correcta.
 * La longitud no �s correcta.
 * L'amplada de la vora no �s correcta.
 * L'amplada de la vora no �s correcta.
 * @@@@@@@@@@@@@@@
 * @@@@@@@@@@@@@@@
 * @@@@@@@@@@@@@@@
 * @@@         @@@
 * @@@         @@@
 * @@@         @@@
 * @@@         @@@
 * @@@         @@@
 * @@@         @@@
 * @@@         @@@
 * @@@         @@@
 * @@@         @@@
 * @@@@@@@@@@@@@@@
 * @@@@@@@@@@@@@@@
 * @@@@@@@@@@@@@@@
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex28_QuadratBuit {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        // 1. Demanar dada num�rica LONGITUD quadrat
        int longitudQuadrat = 0;
        boolean longitudCorrecte = false; 
        do
        {
            System.out.print("Indica la longitud del quadrat (2 - 80): ");
            if (entrada.hasNextInt())  // Si introdueixo un enter
            {
                longitudQuadrat = entrada.nextInt();                
                if (longitudQuadrat >= 2 && longitudQuadrat <= 80) // Dins del rang
                    longitudCorrecte=true;
                else
                    System.out.println("La longitud no �s correcta.");
            } else {
                System.out.println("La longitud no �s correcta."); // Si NO �s enter
                entrada.next(); // Fa un salt de l�nia i torna a comen�ar el LOOP ( si el trec, executa un Loop infinit...) NOM�S PER Strings/Chars
            }
        } while (!longitudCorrecte);
        
        
        // 2. Demanar dada num�rica AMPLADA VORA
        int ampladaVora = 0;
        boolean voraCorrecte = false; 
        do
        {
            System.out.print("Indica l'amplada de la vora (1 - " + 
                             (longitudQuadrat/2) + "): ");
            if (entrada.hasNextInt())  // Si introdueixo un enter
            {
                ampladaVora = entrada.nextInt();                
                if (ampladaVora >= 1 && ampladaVora <= (longitudQuadrat/2)) // Dins del rang
                    voraCorrecte=true;
                else
                    System.out.println("L'amplada de la vora no �s correcta.");
            } else {
                System.out.println("L'amplada de la vora no �s correcta."); // Si NO �s enter
                entrada.next(); // Fa un salt de l�nia i torna a comen�ar el LOOP ( si el trec, executa un Loop infinit...) NOM�S PER Strings/Chars
            }
        } while (!voraCorrecte);

        
        // 3. Demano car�cter
        entrada.nextLine();  // Purgo salt de l�nia per capturar b� el seg�ent "char"       
        String caracter = "";
        boolean longitud = false;  // Pressuposo TOTES les entrades com incorrectes
        
        while (longitud == false)  // Mentres la longitud del valor introdu�t sigui incorrecte
        {    
            System.out.print("Indica el car�cter a utilitzar: ");
            caracter = entrada.nextLine();
            
            if (!(caracter.length() == 1))
                System.out.println("El car�cter ha de tenir longitud 1.");
            else
                longitud = true;  // Si �s un ENTER DINS DEL RANG, surto             
        }  
        
        // 4. Renderitzar QUADRAT:
        int espaisBuits = longitudQuadrat-ampladaVora*2;  // Proporci� per calcular els espais buits                
        int fila = 1;   // Igualo a 1 pq almenys ha de dibuixar 1 fila
       
        for (int casella = 1; casella <= longitudQuadrat; ++casella)  // Crea les CASELLES (de 1 a n)
        {
            if (fila <= espaisBuits-fila-2)  // Fila(es) superior(s)
                for (int colCaracter = 1; colCaracter <= longitudQuadrat; colCaracter++) 
                    System.out.print(caracter);
                
            else if ((fila >= ampladaVora+1) && (fila <= (longitudQuadrat-ampladaVora)))  // Interval que determina les files intermitges
            {
                if (espaisBuits >= longitudQuadrat-fila-2) // Proporci� que determina que hi ha forat al centre
                {
                    // Calculo posicions ocupades: porci� 1 de 3
                    for (int colCaracter = 1; colCaracter <= ampladaVora; colCaracter++) // Topall contrari a la meitatRombe (diagonal/2 + 1) (fila * 2 - 1)
                        System.out.print(caracter);                    

                    // Calculo posicions en blanc: porci� 2 de 3
                    for (int colBlanca = 1; colBlanca <= espaisBuits; colBlanca++) // De 0 a n columnes
                        System.out.print(" ");

                    // Calculo posicions ocupades: porci� 3 de 3
                    for (int colCaracter = 1; colCaracter <= ampladaVora; colCaracter++) // Topall contrari a la meitatRombe (diagonal/2 + 1) (fila * 2 - 1)
                        System.out.print(caracter);
                }
                    
            } else  // Fila(es) inferior(s)
            {
                for (int colCaracter = 1; colCaracter <= longitudQuadrat; colCaracter++) 
                    System.out.print(caracter);   
            }
            
            System.out.println();   // Provoco un salt de l�nia al final de la seq��ncia
            ++fila;                 // 1 fila completa, sumo la seg�ent
        }     
    }
}
