/*
 * Fes un programa que ens demani el resultat del llançament d'un projectil, 
 * espai recorregut en Km (E) i temps que ha trigat en arribar [en segons] (T), 
 * i ens digui quina ha estat la seva velocitat expressada en metres per segon.
 * (Velocitat = espai / temps).
 * Exemple:
 *  Entrada:
 *  5.5
 *  3.3
 *  Sortida:
 *  Velocitat: 1666.67 
 */
package cat.copernic.m03.uf1a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex07_VelocitatProjectil {
    
    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("en","US"));
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Quin espai ha recorregut el projectil (en km)? ");
        double espai = entrada.nextDouble();        
        System.out.print("Quant temps ha trigat (en segons)? ");
        double temps = entrada.nextDouble();
        
        double velocitat = (espai*1000) / temps;
        System.out.printf("La velocitat del projectil ha estat: %.2f m/s\n", 
                           velocitat);
    }
    
}
