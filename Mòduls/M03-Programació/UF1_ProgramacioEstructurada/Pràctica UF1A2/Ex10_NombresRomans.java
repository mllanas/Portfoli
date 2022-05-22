/*
 * Fes un programa que demani un nombre natural entre 1 i 3999 i el mostri en 
 * nombres romans.
 * Exemple:
 *  Entrada:
 *  1224
 *  Sortida:
 *  MCCXXIV
 */
package cat.copernic.m03.uf1a2;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex10_NombresRomans {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nombre: ");
        int any = entrada.nextInt();

        // Separar els milers, centenes, desenes i unitats
        // Milers
        int milers = any / 1000;

        if (any >= 1 & any <= 3999) {
            if (milers == 1) {
                System.out.print("M");
            } else if (milers == 2) {
                System.out.print("MM");
            } else if (milers == 3) {
                System.out.print("MMM");
            }

            // Centenes  
            int centenes = (any - milers * 1000) / 100;
            //int centenes = (any % 1000) / 100;
            if (centenes == 1) {
                System.out.print("C");
            } else if (centenes == 2) {
                System.out.print("CC");
            } else if (centenes == 3) {
                System.out.print("CCC");
            } else if (centenes == 4) {
                System.out.print("CD");
            } else if (centenes == 5) {
                System.out.print("D");
            }
            if (centenes == 6) {
                System.out.print("DC");
            }
            if (centenes == 7) {
                System.out.print("DCC");
            }
            if (centenes == 8) {
                System.out.print("DCCC");
            }
            if (centenes == 9) {
                System.out.print("CM");
            }

            // Desenes
            //int desenes = (any - milers * 1000) - (centenes * 100) / 10;
            int desenes = (any % 100) / 10;
            if (desenes == 9) {
                System.out.print("XC");
            }
            if (desenes == 8) {
                System.out.print("LXXX");
            }
            if (desenes == 7) {
                System.out.print("LXX");
            }
            if (desenes == 6) {
                System.out.print("LX");
            }
            if (desenes == 5) {
                System.out.print("L");
            }
            if (desenes == 4) {
                System.out.print("XL");
            }
            if (desenes == 3) {
                System.out.print("XXX");
            }
            if (desenes == 2) {
                System.out.print("XX");
            }
            if (desenes == 1) {
                System.out.print("X");
            }

            // Unitats
            int unitats = any-(milers * 1000)-(centenes * 100)-(desenes * 10);
            if (unitats == 9) {
                System.out.println("IX");
            } else if (unitats == 8) {
                System.out.println("VIII");
            } else if (unitats == 7) {
                System.out.println("VII");
            } else if (unitats == 6) {
                System.out.println("VI");
            } else if (unitats == 5) {
                System.out.println("V");
            } else if (unitats == 4) {
                System.out.println("IV");
            } else if (unitats == 3) {
                System.out.println("III");
            } else if (unitats == 2) {
                System.out.print("II");
            } else if (unitats == 1) {
                System.out.println("I ");
            }
        } else {
            System.out.println("ERROR \n");
        }
    }

}
