/*
 * Fes un programa que demani un nostre nom i cognoms generi una adreça de
 * correu vàlida amb el format: 1ercognom.2oncognom.nom@alumnat.copernic.cat 
 * 
 * Cal tenir en compte que una adreça de correu no pot contenir espais ni cap
 * caràcter que formi part de l'alfabet anglès. 
 * 
 * Les vocals accentuades s'han de reemplaçar per vocals sense accents, les 'ñ' 
 * per 'n' i les 'ç' per 'c'.
 * 
 * Input:
 * Adriá
 * Laporta Cabaña
 * Output:
 * laporta.cabana.adria@mail.cat
 */

package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex06_GeneraCorreu {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introdueix el teu nom: ");
        String nom = entrada.nextLine().toLowerCase();
        System.out.print("Introdueix els teus cognoms: ");
        String cognoms = entrada.nextLine().toLowerCase();
        
        //1. Identifico posicions d'inici per cada mot
        int index = cognoms.indexOf(' '); // Trobo posició primer espai: mot1 (espai) mot2        
        String cognom1 = cognoms.substring(0, index).trim(); // Elimino possibles espais als extrems
        String cognom2 = cognoms.substring(index+1).trim();  // Elimino possibles espais als extrems       
        
        // 2. Filtro caracters especials
        String caractersEspecials   = "áàéèíïóòúüçñ";
        String caractersAlternatius = "aaeeiioouucn";
        
        for (int i = 0; i < caractersEspecials.length(); ++i)
        {   
            nom = nom.replace(caractersEspecials.substring(i,i+1), caractersAlternatius.substring(i,i+1));
            cognom1 = cognom1.replace(caractersEspecials.substring(i,i+1), caractersAlternatius.substring(i,i+1));
            cognom2 = cognom2.replace(caractersEspecials.substring(i,i+1), caractersAlternatius.substring(i,i+1));    
        }        
        
        entrada.close();
        
        System.out.println(cognom1+"." + cognom2 + "." + nom + "@mail.cat");
        
    }
}
