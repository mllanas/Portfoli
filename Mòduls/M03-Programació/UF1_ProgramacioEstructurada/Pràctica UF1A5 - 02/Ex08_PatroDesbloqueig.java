/*
 * Desenvolupar una aplicació que, a partir d’una seqüència de números 
 * representi quin és el patró de desbloqueig d'un dispositiu mòbil. 
 * 
 * Input:
 * 3 3
 * 1 1
 * 687615
 * Output:
 * +-----+
 * |O-O .|
 * |  |  |
 * |O O .|
 * | X   |
 * |O-O .|
 * +-----+
 */

package cat.copernic.m03.uf1a5;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex08_PatroDesbloqueig {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // 1. VALIDAR VALOR FILES
        int num_files = 0;
        boolean valorFilaOk = false;
        do
        {
            System.out.print("Files: ");
            num_files = entrada.nextInt();
            
            if(num_files > 1 && num_files < 30)
                valorFilaOk = true;
            
        }while(!valorFilaOk);

        // 2. VALIDAR VALOR COLUMNES
        int num_columnes = 0;
        boolean valorColumnaOk = false;
        do
        {
            System.out.print("columnes: ");
            num_columnes = entrada.nextInt();
            
            if(num_columnes > 1 && num_columnes < 30)
                valorColumnaOk = true;
            
        }while(!valorColumnaOk);        
        
        // 3. VALIDAR VALOR INICI COORDENADES X
        int coordenada_X = 0;
        boolean valorCoordenadaXOk = false;
        do
        {
            System.out.print("inici coordenada X: ");
            coordenada_X = entrada.nextInt();
            
            if(coordenada_X < num_files)
                valorCoordenadaXOk = true;
            
        }while(!valorCoordenadaXOk);
         
        // 4. VALIDAR VALOR INICI COORDENADES Y
        int coordenada_Y = 0;
        boolean valorCoordenadaYOk = false;
        do
        {
            System.out.print("inici coordenada Y: ");
            coordenada_Y = entrada.nextInt();
            
            if(coordenada_X < num_columnes)
                valorCoordenadaYOk = true;
            
        }while(!valorCoordenadaYOk);
        
        
        // 5. DEMANAR I EXECUTAR PATRÓ DE DESBLOQUEIG        
        int valor = 0;
        int totalValors = 0;
        
        entrada.nextLine();
        System.out.print("Sequencia desbloqueig: ");                
        String patroDesbloqueig = entrada.nextLine();
             
        entrada.close();
        

        
        // 6. RENDERITZAR MATRIU
        String[][] matriu = new String[(num_files*2)-1][(num_columnes*2)-1];
        for(int fila = 0; fila < (num_files*2)-1; ++fila)
        {
            for(int columna = 0; columna < (num_columnes*2)-1; ++columna)
            {
                if (fila%2 == 0 && columna%2 == 0) // Resetejo matriu
                    matriu[fila][columna]=".";
                else
                    matriu[fila][columna]=" ";
            }            
        }   
        
        // Actualitzo matriu amb el patró
        int casella = 0;
        for(int fila = 0; fila < patroDesbloqueig.length(); ++fila) 
        {
            for(int columna = 0; columna < patroDesbloqueig.length(); ++columna) 
            {                
                if (fila == coordenada_Y-1 && columna == coordenada_X-1)                
                    matriu[fila][columna]="O"; // inicio patró                  
                
                                
                // Moviments
                if ( patroDesbloqueig.charAt(casella) == '1')
                {
                    if(matriu[fila-1][columna-1].equals("\\") || matriu[fila-1][columna-1].equals("/") || matriu[fila-1][columna-1].equals("X"))
                        matriu[fila-1][columna-1]="X";
                    else
                        matriu[fila-1][columna-1]="\\";
                    
                    fila--;
                    columna--;
                    matriu[fila-1][columna-1]="O"; 
                    fila--;
                    columna--;
                    columna--; 
                }

                if ( patroDesbloqueig.charAt(casella) == '2')
                {
                    matriu[fila-1][columna]="|";
                    fila--;
                    matriu[fila-1][columna]="O";
                    fila--;
                    columna--; 
                }

                if ( patroDesbloqueig.charAt(casella) == '3')
                {
                    if(matriu[fila-1][columna+1].equals("\\") || matriu[fila-1][columna+1].equals("/") || matriu[fila-1][columna+1].equals("X"))
                        matriu[fila-1][columna+1]="X";
                    else
                        matriu[fila-1][columna+1]="/";
                    
                    fila--;
                    columna++;
                    matriu[fila-1][columna+1]="O"; 
                    fila--;
                }
                
                if (patroDesbloqueig.charAt(casella) == '4')
                {
                    matriu[fila][columna-1]="-";
                    columna--; 
                    matriu[fila][columna-1]="O";
                    columna--;
                    columna--;
                }
                
                if ( patroDesbloqueig.charAt(casella) == '5')
                {
                    break;
                }
                
                if ( patroDesbloqueig.charAt(casella) == '6')
                {
                    matriu[fila][columna+1]="-";
                    columna++;
                    matriu[fila][columna+1]="O";
                }

                if ( patroDesbloqueig.charAt(casella) == '7')
                {
                    if(matriu[fila+1][columna-1].equals("\\") || matriu[fila+1][columna-1].equals("/") || matriu[fila+1][columna-1].equals("X"))
                        matriu[fila+1][columna-1]="X";
                    else
                        matriu[fila+1][columna-1]="/";
                    
                    fila++;                    
                    columna--;
                    matriu[fila+1][columna-1]="O"; 
                    fila++;
                    columna--;
                    columna--;
                }
                
                if ( patroDesbloqueig.charAt(casella) == '8')
                {                    
                    matriu[fila+1][columna]="|";
                    fila++;
                    matriu[fila+1][columna]="O";
                    fila++;
                    columna--;
                }

                if ( patroDesbloqueig.charAt(casella) == '9')
                {
                    if(matriu[fila+1][columna+1].equals("\\") || matriu[fila+1][columna+1].equals("/") || matriu[fila+1][columna+1].equals("X"))
                        matriu[fila+1][columna+1]="X";
                    else
                        matriu[fila+1][columna+1]="\\";                    
                    
                    fila++;                    
                    columna++;
                    matriu[fila+1][columna+1]="O"; 
                    fila++;
                }  
                casella++;

            }                  
            
        }
                
        
        // Marge superior
        System.out.print("+");
        for (int i = 1; i <= (num_columnes*2)-1; ++i)           
            System.out.print("-");
        System.out.println("+");        
                
        for(int fila = 0; fila < (num_files*2)-1; ++fila)
        {
            System.out.print("|"); // Tope inici fila
            
            for(int columna = 0; columna < (num_columnes*2)-1; ++columna)
            {
                System.out.print(matriu[fila][columna]);
            }
            System.out.println("|"); // Tope final fila   
        }
        
        // Marge inferior
        System.out.print("+");
        for (int i = 1; i <= (num_columnes*2)-1; ++i)           
            System.out.print("-");
        System.out.println("+");
        
    }
}
