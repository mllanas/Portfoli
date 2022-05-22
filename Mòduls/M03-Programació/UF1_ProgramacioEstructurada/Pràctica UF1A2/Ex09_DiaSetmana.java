/*
 * Fes un programa que ens demani un nombre del 1 al 7 i ens contesti amb el dia
 * de la setmana que correspon.
 * Exemple:
 *  Entrada 1:
 *  7
 *  Sortida 1:
 *  El dia de la setmana és: diumenge.
 *  Entrada 2:
 *  8
 *  Sortida 2:
 *  El dia de la setmana és: incorrecte.
 */
package cat.copernic.m03.uf1a2;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex09_DiaSetmana {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int nombre = entrada.nextInt();

        String valor = "";
        switch (nombre) {
            case 1:
                valor = "dilluns";
                break;
            case 2:
                valor = "dimarts";
                break;
            case 3:
                valor = "dimecres";
                break;
            case 4:
                valor = "dijous";
                break;
            case 5:
                valor = "divendres";
                break;
            case 6:
                valor = "dissabte";
                break;
            case 7:
                valor = "diumenge";
                break;
            default:
                valor = "incorrecte";
        }
        
        System.out.println("El dia de la setmana és: " + valor + ".");        
    }
}
