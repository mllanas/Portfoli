/*
 * Fes un programa que ens demani un DNI vàlid i l’aplicació haurà de retornar 
 * la lletra corresponent a aquest DNI.
 * 
 * Input:
 * 12345678
 * Output:
 * La lletra corresponent al DNI és: Z
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex23_TrobaLletraDNI {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int dni = entrada.nextInt();
        char lletra = 0;
        
        // 1. Dividir dni entre 23, el resto indica la lletra
        int resto = dni%23;
        
        // 2. Triar lletra
        switch(resto)
        {
            case 0:     lletra = 'T';
                        break;
            case 1:     lletra = 'R';
                        break;
            case 2:     lletra = 'W';
                        break;
            case 3:     lletra = 'A';
                        break;
            case 4:     lletra = 'G';
                        break;
            case 5:     lletra = 'M';
                        break;
            case 6:     lletra = 'Y';
                        break;
            case 7:     lletra = 'F';
                        break;
            case 8:     lletra = 'P';
                        break;    
            case 9:     lletra = 'D';
                        break;
            case 10:    lletra = 'X';
                        break;
            case 11:    lletra = 'B';
                        break; 
            case 12:    lletra = 'N';
                        break;
            case 13:    lletra = 'J';
                        break;
            case 14:    lletra = 'Z';
                        break;
            case 15:    lletra = 'S';
                        break;
            case 16:    lletra = 'Q';
                        break;
            case 17:    lletra = 'V';
                        break;
            case 18:    lletra = 'H';
                        break;
            case 19:    lletra = 'L';
                        break;
            case 20:    lletra = 'C';
                        break;    
            case 21:    lletra = 'K';
                        break;
            case 22:    lletra = 'E';
                        break;
            default:    System.out.println("Opció incorrecta");
        }
        
        System.out.println("La lletra corresponent al DNI és: " + lletra);
    }
}
