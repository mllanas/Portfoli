/*
 * Estem programant una calculadora que ens haurà de demanar dos nombres enters 
 * i, a continuació, l’operació a realitzar (+, -, x ó /). El programa haurà de 
 * mostrar el resultat.
 * 
 * El programa calcularà continuament fins que introduïm una S com a primer 
 * enter de l'operació. Fes que el teu programa sigui modular.
 * 
 * Input:
 * 2 5 + 3 1 - 2 5 x 9 2 / 6 0 / S
 * Output:
 * 2 + 5 = 7
 * 3 - 1 = 2
 * 2 x 5 = 10
 * 9 / 2 = 4
 * No es pot dividir per 0.
 */

package cat.copernic.m03.uf2a1;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex01_Calculadora {

    static Scanner entrada = new Scanner(System.in);
    static char operacio;

    public static void main(String[] args) {

        int enter1 = 0;
        boolean sortida = false;
        do 
        {
            System.out.print("Introdueix un enter: ");
            String input = entrada.nextLine().toUpperCase();
            
            if (input.equals("S")) 
                sortida = true;
            else 
            {
                enter1 = Integer.parseInt(input);

                System.out.print("Introdueix un altre enter: ");
                int enter2 = entrada.nextInt();

                System.out.print("Introdueix l'operació (+, -, x, /):");
                operacio = entrada.next().charAt(0);

                switch (operacio) {
                    case '+':               
                        sumar(enter1, enter2);
                        break;
                    case '-':
                        restar(enter1, enter2);
                        break;
                    case 'x':
                        multiplicar(enter1, enter2);
                        break;
                    case '/':
                        dividir(enter1, enter2);
                        break;
                    default:
                        System.out.println("Operació incorrecta!");
                }
                entrada.nextLine();
            }

        } while (!sortida);

        entrada.close();
    }

    static void mostraResultat(int n1, int n2, int resultat) {
        System.out.println(n1 + " " + operacio + " " + n2 + " = " + resultat);
    }
    static void sumar(int a, int b) {
        int resultat = a + b;
        mostraResultat(a, b, resultat);
    }
    static void restar(int a, int b) {
        int resultat = a - b;
        mostraResultat(a, b, resultat);
    }
    static void multiplicar(int a, int b) {
        int resultat = a * b;
        mostraResultat(a, b, resultat);
    }
    static void dividir(int a, int b) {
        int resultat = 0;

        if (b != 0) {
            resultat = a / b;
            mostraResultat(a, b, resultat);
        } else {
            System.out.println("No es pot dividir per 0.");
        }
    }
}
