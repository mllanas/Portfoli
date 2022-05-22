/*
 * Fes un programa que ens demani dos nombres naturals (a i b) i un caràcter 
 * d'operació aritmètica (+,-,*,/) i mostrar el resultat d'efectuar-la.
 * Exemple:
 *  Entrada 1:
 *  1
 *  2
 *  +
 *  Sortida 1:
 *  El resultat de l'operació és: 1 + 2 = 3
 *  Entrada 2:
 *  7
 *  2
 *  %
 *  Sortida 2:
 *  Operació incorrecta!
 */
package cat.copernic.m03.uf1a2;

import java.util.Scanner;

/**
 *
 * @author Txell
 */
public class Ex08_Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        entrada.nextLine();
        char operacio = entrada.nextLine().charAt(0);

        int resultat = 0;
        boolean error = false;
        switch (operacio)
        {
            case '+':
                resultat = num1 + num2;
                break;
            case '-':
                resultat = num1 - num2;
                break;
            case '*':
                resultat = num1 * num2;
                break;
            case '/':
                resultat = num1 / num2;
                break;
            default:
                error = true;
        }
        
        if (error)
            System.out.println("Operació incorrecta!");
        else
            System.out.println("El resultat de l'operació és: " + num1 + " " + 
                                operacio + " " + num2 + " = " + resultat);
    }
}
