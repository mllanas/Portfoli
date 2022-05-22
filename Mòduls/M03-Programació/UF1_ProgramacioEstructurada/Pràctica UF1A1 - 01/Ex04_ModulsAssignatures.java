/*
 * Escriu un programa que faci servir 11 variables per emmagatzemar el nom dels
 * mòduls i dels professors i les utilitzi per mostrar una taula com la de l’exemple. 
 *
 * Exemple d'execució:
 * +----------------------------------------------------------------+
 * | 1 |                  Sistemes Informàtics  |    Ricardo López  |
 * | 2 |                        Bases de dades  |      Juan Martín  |
 * | 3 |                           Programació  |  Roberto Ferrero  |
 * | 4 |                Llenguatges de marques  |  David Fernández  |
 * | 5 |      Empresa i Iniciativa Emprenedora  |     Mercè Sitges  |
 * | 6 |         Formació i Orientació Laboral  |     Mercè Sitges  |
 * +----------------------------------------------------------------+
 *
 */
 
package cat.copernic.m03.uf1a1;

/**
 *
 * @author txell
 */
public class Ex04_ModulsAssignatures {
    
    public static void main(String[] args) {
        
        String m01 = "Sistemes Informàtics";
        String m02 = "Bases de dades";
        String m03 = "Programació";
        String m04 = "Llenguatges de marques";
        String eie = "Empresa i Iniciativa Emprenedora";
        String fol = "Formació i Orientació Laboral";
        
        String prof1 ="Ricardo López";
        String prof2 ="Juan Martín";
        String prof3 ="Roberto Ferrero";
        String prof4 ="David Fernández";
        String prof5 ="Mercè Sitges";
        
        System.out.println("+----------------------------------------------------------------+");
        System.out.println("| 1 |                  " + m01 +"  |    " + prof1 + "  |");
        System.out.println("| 2 |                        " + m02 +"  |      " + prof2 + "  |");
        System.out.println("| 3 |                           " + m03 +"  |  " + prof3 + "  |");
        System.out.println("| 4 |                " + m04 +"  |  " + prof4 + "  |");
        System.out.println("| 5 |      " + eie +"  |     " + prof5 + "  |");
        System.out.println("| 6 |         " + fol +"  |     " + prof5 + "  |");
        System.out.println("+----------------------------------------------------------------+");
        
    }
    
}
