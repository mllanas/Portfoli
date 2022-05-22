/*
 * Fes un programa que ens demani una cadena per� que nom�s es puguin introduir 
 * lletres i espais (exercici 3) i que ens la mostri amb els seus car�cters 
 * ordenats alfab�ticament deixant els espais al final. 
 * 
 * Input:
 * public static void main(String[] args) {
 * Output:
 * "Saaabccdggiiiiilmnnoprrsstttuv     "
 */

package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex05_NomesLletresEspaisOrdenats {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introdueix una cadena:");
        String frase = entrada.nextLine();

        // 1. Filtrar car�cters frase: nom�s lletres i espais        
        String lletres = "";
        String espais = "";
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                lletres += frase.charAt(i);         // guardo NOM�S les lletres
            } else if (frase.charAt(i) == ' ')      // guardo NOM�S els espais
            {
                espais += frase.charAt(i);
            }
        }
                  
        // 2. Ordenar car�cters de la frase resultant
        String fraseOrdenada = lletres.substring(0, 1);  // length() = 1: inicialitzo insertant-hi el 1r caracter per donar-li una longitud m�nima i un caracter amb el que poder comen�ar a comparar
        boolean insertat = false; 
        
        for (int i = 1; i < lletres.length(); i++) {  // Partir del 2n caracter 
     
            String caracterActual = lletres.substring(i, i+1);  // Selecciono caracter actual per comparar-lo                        

            for (int j = 0; j < fraseOrdenada.length(); ++j)
            {                 
                // Recorro la cadena ordenada per veure on inserto el nou caracter
                if (caracterActual.compareTo(fraseOrdenada.substring(j,j+1)) <= 0)  // Si la posici� del car�cter va abans... 
                {                
                    fraseOrdenada = fraseOrdenada.substring(0,j) + caracterActual + fraseOrdenada.substring(j); // l'insereixo davant de tot o entremig
                    insertat = true;                
                    break; // Surto del bucle per analitzar el seg�ent car�cter a posicionar                    
                }else
                   insertat = false; // Surto del bucle per inserir el car�cter a la cua
            }
            
            if(!insertat)
                fraseOrdenada += caracterActual; // Insereixo caracter a la cua
        }
        
        entrada.close();
        
        System.out.println("\"" + fraseOrdenada + espais + "\"");
        
    }
}
