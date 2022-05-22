/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf3p1;

/**
 * Representa un valor de retorn amb dos atributs:
 *  - posicio : És la posició del següent byte a llegir 
 *  - missatge: És el missatge llegit del fitxer
 *  
 * @author rferrero
 */
public class ValorRetorn {

    ValorRetorn(int posicio, String missatge) {
        this.posicio  = posicio;
        this.missatge = missatge;
    }

    public int posicio;
    public String missatge;
}
