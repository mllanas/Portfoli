/*
 * Fes un programa que ens demani una frase a la que escriurem la seq��ncia pepe
 * unes quantes vegades i ens ha de contestar quantes vegades apareix pepe .
 * 
 * (Compte que tamb� podem escriure pepepe que ha de comptar com a dos vegades
 * pepe ).
 * 
 * Input:
 * pepepe pepe pepepe pepe pepepe pepepe... Samba da Bahia...
 * Output:
 * La frase cont� 10 cops la seq��ncia "pepe".
 */

package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex02_ComptaPepe {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introdueix una frase que contingui la seq��ncia \"pepe\": ");
        String frase = entrada.nextLine();
        
        int comptador = 0;
        
        int indexPepe = 0;
        int fromIndex = 0;
        String comptarPepes = "";

        boolean trobat = true;
        do 
        {
            indexPepe = frase.indexOf("pepe", fromIndex); // Detecto la posici� on comen�a la seq��ncia "pepe"

            if (indexPepe != -1) 
            {
                comptarPepes += frase.substring(fromIndex, indexPepe); // Des de l'inici (0,...) fins a trobar el seg�ent "pepe"
                comptador++; // Comptabilitzo cops que la seq��ncia "pepe" apareix
                fromIndex = indexPepe + 1; // Actualitzo l'index de cerca a partir d'on (+1) ha trobat la seq��ncia "pepe"

            } else {
                trobat = false;
            }

        } while (trobat); // Mentres trobi  "pepe", quan no ho trobi tornar� un -1 pq la seq��ncia de caracters no existeix en cap m�s posici�
        
        entrada.close();
        
        System.out.println("La frase cont� "+ comptador +" cops la seq��ncia \"pepe\".");
        
    }
}
