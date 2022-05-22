/*
 * Fes un programa que desxifri una frase xifrada segons l'algorisme de 
 * l'exercici anterior.
 * L'aplicaci� demanar� primer la clau de xifrat (enter entre 1 i 9) que ser� la
 * mateixa que en el proc�s de xifrat i, a continuaci� la frase xifrada.
 * 
 * La sortida ser� la frase original abans de ser xifrada.
 * 
 * Input:
 * 3
 * s� nu quaste ed rafes xeeplme neam a ueq mba le ifxarr ecsetr odci
 * Output:
 * aquest �s un exemple de frase que anem a xifrar amb el codi secret
 */

package cat.copernic.m03.uf1a5;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex07_DesxifratRotatori {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int clau = entrada.nextInt();
        entrada.nextLine();
        String frase = entrada.nextLine().replaceAll("[.,?!:'/\"]", "");
        
        
        // 1. Capturar misstge encriptat
        String[] paraules = frase.split(" "); // Converteix la frase en un Array de paraules
        String[] paraulesReordenades = new String[paraules.length];                
        int valorMultiple = clau;
        for(int i = 0; i < paraules.length; i++)
        {
            if(i == 0) // �ltima paraula[0] de l'�ltim bloc, la moc al principi del bloc
            {
                if(paraules.length >= clau)
                    paraulesReordenades[i] = paraules[clau-1];
                else
                     paraulesReordenades[i] = paraules[paraules.length-1];
            }
            else if(i == valorMultiple) // �ltima paraula[n] de cada bloc, la moc al principi del bloc
            {  
                valorMultiple+=clau;               
                
                if(i+clau >= paraules.length) // Si �s l'�ltim bloc 
                {
                    if(paraules.length%clau == 0) // I si �s un bloc m�ltiple
                        paraulesReordenades[i] = paraules[valorMultiple-1]; 
                    else
                        paraulesReordenades[i] = paraules[paraules.length-1];
                }else
                    paraulesReordenades[i] = paraules[valorMultiple-1]; 
            }  
            else // Resta de paraules, els sumo 1 posici�
                paraulesReordenades[i] = paraules[i-1];
        }
        
        // 2. Desxifrar missatge
        String paraula = new String(); // Contenidor per 1 paraula
        String[] fraseXifrada = new String[paraules.length]; // Contenidor per la paraula xifrada
        
        char[] lletres = new char[paraula.length()]; // Array amb les lletres de cada paraula que m'entra
        for(int i = 0; i < paraulesReordenades.length; i++)
        {
            paraula = paraulesReordenades[i]; // Recupero la paraula a ordenar
            lletres = paraula.toCharArray(); // Omplo array amb les lletres de la paraula que m'entra
            char[] tempChar = new char[lletres.length]; // Contenidor temporal per les lletres ordenades
            int valorMultipleChar = clau;
            
            for(int posicio = 0; posicio < lletres.length; posicio++)
            {
                if(posicio == 0) // �ltima lletra[0] del primer bloc, la moc al principi del bloc
                {
                    if(lletres.length%clau == 0) // Si total lletres m�ltiple de 'n'
                        tempChar[posicio] = lletres[clau-1];
                    else
                    {
                        if(lletres.length > clau)
                            tempChar[posicio] = lletres[clau-1];
                        else
                            tempChar[posicio] = lletres[lletres.length-1];
                    }
                }
                else if(posicio == valorMultipleChar) // �ltima lletra[n] de cada bloc, la moc al principi del bloc
                {  
                    valorMultipleChar+=clau;               

                    if(posicio+clau >= lletres.length) // Si �ltim bloc 
                    {
                        if(lletres.length%clau == 0) // Si bloc m�ltiple
                            tempChar[posicio] = lletres[valorMultipleChar-1]; 
                        else
                            tempChar[posicio] = lletres[lletres.length-1];
                    }else
                        tempChar[posicio] = lletres[valorMultipleChar-1]; 
                }  
                else // Resta de lletres, els sumo 1 posici�
                    tempChar[posicio] = lletres[posicio-1];
            }
            String paraulaXifrada = new String(tempChar);
            fraseXifrada[i] = paraulaXifrada; // Transformo caracters en una paraula            
        }
        
        
        for(int i = 0; i < fraseXifrada.length; i++)
        {
            System.out.print(fraseXifrada[i] + " ");
        }
        
    }
}
