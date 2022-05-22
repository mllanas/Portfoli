/*
 * Fes un programa que ens demani el PIN de la nostra targeta banc�ria. 
 * Si despr�s de 3 oportunitats no s�insereix correctament es mostrar� un 
 * missatge de que la targeta ha estat retinguda.
 * �s obligatori utilitzar bucles. Per definir el PIN de la targeta ( 1234 ) 
 * feu servir una constant.
 * 
 * Input:
 * 3333
 * 1234
 * Output:
 * PIN INCORRECTE. PROVA DE NOU.
 * PIN CORRECTE. SELECCIONI L�OPERACI� A REALITZAR ...
 */
package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex09_CaixerAutomatic {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("BENVINGUDA/BENVINGUT AL BANC COP�RNIC.");

        final int PIN = 1234;
        int pin = 0;
        int intents = 1;

        // Preguntar almenys 1 cop pel pin
        do {
            System.out.print("INSEREIX EL PIN: ");
            pin = entrada.nextInt();

            if (pin == PIN) // PIN correcte
            {
                System.out.println("PIN CORRECTE. SELECCIONI L�OPERACI� A "
                        + "REALITZAR ...");
                break;      // Surto del loop
            } else if (intents < 3) // PIN incorrecte
            {
                System.out.println("PIN INCORRECTE. PROVA DE NOU.");
            }
            intents++;

        } while (intents <= 3);

        if (pin != PIN && intents == 4) {
            System.out.println("HA ARRIBAT AL NOMBRE M�XIM D�INTENTS. "
                          + "TARGETA RETINGUDA.\n"
                          + "POSI�S EN CONTACTE AMB EL PERSONAL DE L�OFICINA.");
        }
    }
}
