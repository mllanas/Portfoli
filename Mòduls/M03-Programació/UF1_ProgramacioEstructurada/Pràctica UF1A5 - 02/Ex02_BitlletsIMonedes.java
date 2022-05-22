/*
 * Fes un programa que ens demani una quantitat en € i amb decimals (nombre
 * real) i ens la desi en un vector desglossada pel nombre de bitllets i monedes
 * i ens mostri el resultat per pantalla. Nota 1: Mireu d’emmagatzemar els
 * valors de bitllets i monedes en un altre vector.
 *
 * Nota 2: Compte amb les possibles errades de precisió quan es treballa amb
 * decimals.
 * 
 * Input:
 * 888.88
 * Output:
 * Bitllets de  500 €: 1
 * Bitllets de  200 €: 1
 * Bitllets de  100 €: 1
 * Bitllets de   50 €: 1
 * Bitllets de   20 €: 1
 * Bitllets de   10 €: 1
 * Bitllets de    5 €: 1
 * Monedes  de    2 €: 1
 * Monedes  de    1 €: 1
 * Monedes  de 0.50 €: 1
 * Monedes  de 0.20 €: 1
 * Monedes  de 0.10 €: 1
 * Monedes  de 0.05 €: 1
 * Monedes  de 0.02 €: 1
 * Monedes  de 0.01 €: 1
 */

package cat.copernic.m03.uf1a5;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex02_BitlletsIMonedes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introdueixi quantitat de diners: ");
        float quantitat = entrada.nextFloat();

        int quantitatAEnter = (int) (quantitat * 100); // Transformo valor 'decimal' a 'enter'
        int[] valorsBitlletsMonedes = {500 * 100, 200 * 100, 100 * 100, 50 * 100, 20 * 100, 10 * 100, 5 * 100, 2 * 100, 1 * 100, 50, 20, 10, 5, 2, 1};
        int[] comptadorValors = new int[valorsBitlletsMonedes.length];

        int posicio = 0;
        while (quantitatAEnter > 0) 
        {
            if (quantitatAEnter >= valorsBitlletsMonedes[posicio]) 
            {
                quantitatAEnter -= valorsBitlletsMonedes[posicio];                
                comptadorValors[posicio]++;
            } else {
                posicio++;
            }
        }

        System.out.println();
        System.out.println("Els diners desglossats en bitllets i monedes són: ");
        for (int i = 0; i < valorsBitlletsMonedes.length; ++i) 
        {
            if (i < 7)             
                System.out.printf("Bitllets de %4d €: %d\n", valorsBitlletsMonedes[i] / 100, comptadorValors[i]);
            else if (i < 9) 
                System.out.printf("Monedes  de %4d €: %d\n", valorsBitlletsMonedes[i] / 100, comptadorValors[i]);
            else 
                System.out.printf("Monedes  de %3.2f €: %d\n", (float) valorsBitlletsMonedes[i] / 100, comptadorValors[i]);            
        }
        entrada.close();
    }
}
