/*
 * Fes un programa anomenat XifratRotatori que realitzi el seg�ent:
 * - El programa demanar� primer la clau a l�usuari, que ser� un nombre N entre 1 i 9.
 * - A continuaci� anir� demanant a l�usuari frases que haur� de xifrar i mostrar 
 *   per pantalla, utilitzant el valor de N anterior.
 * 
 * El xifrat es realitzar� de la manera seg�ent:
 * 1. Si la frase t� N o m�s paraules, agafar� les N primeres i rotar� cap enrere 
 *    la seva posici�, ubicant a la posici� 1 la paraula que estava a la posici� 2,
 *    a la posici� 2 la que estava a la posici� 3, �, i finalment a la posici� N 
 *    la que estava en la posici�.
 * 
 * 2. Amb la resta de la frase seguir� l�algoritme anterior.
 * 
 * 3. Si la frase inicial o la resta que queda t� menys de N paraules, 
 *    realitzar� tamb� la rotaci� per� amb M paraules, sent M el nombre de 
 *    paraules de la frase inicial o el restant.
 * 4. Per a cada lletra de cada paraula s�utilitzar� el mateix procediment que 
 *    amb les paraules: agafant grups de N lletres, rotar cap enrere les lletres
 *    de cada paraula 1 posici�.
 * 
 * Les frases no han de contenir signes de puntuaci� i el separador de paraules 
 * ha de ser l�espai en blanc.
 * 
 * Input:
 * 5
 * aquest �s un exemple de frase que anem a xifrar amb el codi secret
 * Output:
 * s� nu quaste ed rafes xeeplme neam a ueq mba le ifxarr ecsetr odci
 */

package cat.copernic.m03.uf1a5;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex06_XifratRotatori {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int clau = entrada.nextInt();
        entrada.nextLine();
        String frase = entrada.nextLine().replaceAll("[.,?!:'/\"]", "");        

        String[] paraules = frase.split(" "); // Converteix la frase en un Array de paraules
        String[] paraulesReordenades = new String[paraules.length];                
        int valorMultiple = clau;
        for(int i = 0; i < paraules.length; i++)
        {
            if(i == 0) // Primera paraula[0] del primer bloc, la moc al final del bloc
            {
                if(paraules.length >= clau)
                    paraulesReordenades[clau-1] = paraules[i];
                else
                    paraulesReordenades[paraules.length-1] = paraules[i];
            }
            else if(i == valorMultiple) // Primera paraula[n] de cada bloc, la moc al final del bloc
            {  
                valorMultiple += clau;               
                
                if(i+clau >= paraules.length) // Si �s l'�ltim bloc 
                {
                    if(paraules.length%clau == 0) // Si �s un bloc m�ltiple
                        paraulesReordenades[valorMultiple-1] = paraules[i]; 
                    else
                        paraulesReordenades[paraules.length-1] = paraules[i];
                }else
                    paraulesReordenades[valorMultiple-1] = paraules[i]; 
            }  
            else // Resta de paraules, els resto 1 posici�
                paraulesReordenades[i-1] = paraules[i];
        }
        
        String paraula = new String(); // Contenidor per 1 paraula
        String[] fraseXifrada = new String[paraules.length]; // Contenidor per la paraula xifrada
        
        char[] lletres = new char[paraula.length()]; // Array amb les lletres de cada paraula que m'entra
        for(int i = 0; i < paraulesReordenades.length; i++)
        {
            paraula = paraulesReordenades[i]; // Recupero la paraula a desordenar
            lletres = paraula.toCharArray(); // Omplo array amb les lletres de la paraula que m'entra
            char[] tempChar = new char[lletres.length]; // Contenidor temporal per les lletres desordenades
            int valorMultipleChar = clau;
            
            for(int posicio = 0; posicio < lletres.length; posicio++)
            {
                if(posicio == 0) // Primera lletra[0] del primer bloc, la moc al final del bloc
                {
                    if(lletres.length%clau == 0) // Si total lletres m�ltiple de 'n'
                        tempChar[clau-1] = lletres[posicio];
                    else
                    {
                        if(lletres.length > clau)
                            tempChar[clau-1] = lletres[posicio];
                        else
                            tempChar[lletres.length-1] = lletres[posicio];
                    }
                }
                else if(posicio == valorMultipleChar) // Primera lletra[n] de cada bloc, la moc al final del bloc
                {  
                    valorMultipleChar += clau;               

                    if(posicio+clau >= lletres.length) // Si �ltim bloc 
                    {
                        if(lletres.length%clau == 0) // Si bloc m�ltiple
                            tempChar[valorMultipleChar-1] = lletres[posicio]; 
                        else
                            tempChar[lletres.length-1] = lletres[posicio];
                    }else
                        tempChar[valorMultipleChar-1] = lletres[posicio]; 
                }  
                else // Resta de lletres, els resto 1 posici�
                    tempChar[posicio-1] = lletres[posicio];
            }
            String paraulaXifrada = new String(tempChar);
            fraseXifrada[i] = paraulaXifrada; // Inserto paraula a l'array final
        }
        entrada.close();
        
        for(int i = 0; i < fraseXifrada.length; i++)
            System.out.print(fraseXifrada[i] + " ");
    
    }
}
