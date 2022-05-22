/*
 * Fes un programa que ens mostri per pantalla els nombres perfectes menors que 
 * 1000. 
 * (Un nombre és perfecte si la suma de tots els seus divisors, sense comptar 
 * el propi nombre però sí l’1, dóna el mateix nombre).
 * 
 * Definiu el 1000 com a constant ! (Per exemple: MAX )
 * 
 * Output:
 * Els nombres perfectes menors que 1000 són:
 * 6 28 496
 */

package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author txell
 */
public class Ex16_NombresPerfectes {

    public static void main(String[] args) {
        
        final int MAX = 1000;        
        String nombresPerfectes = "";
        
        // 1. Recorro tots els nombres de l'1 al MAX
        int sumaDivisors = 0;        
        for (int n = 1; n < MAX; ++n)  
        {            
            // 2. Busco els divisors de cada nombre (n)
            for (int i = 1; i < Math.sqrt(n); ++i)  
            {                
                if (n%i == 0) // Si "n" es múltiple de "i"
                {  
                    sumaDivisors+=i; // Sumo divisor
                    
                    if (n/i != i) // Si el quocient(n) NO és igual al divisor(i)  
                        sumaDivisors+=n/i; // sumo quocient
                }                
            }              
            sumaDivisors-=n;  // D'aquesta suma de valors, li resto el propi nombre(n)                
            
            // 3. Comprovo si la suma dels divisors == nombre(n), llavors...
            if (sumaDivisors == n)  
               nombresPerfectes += sumaDivisors + " ";  // És un nombre perfecte
            
            sumaDivisors = 0;  // Resetejo valor de les sumes. Busco següent nombre perfecte (loop)
        }  
        
        System.out.println("Els nombres perfectes menors que 1000 són:");  
        System.out.println(nombresPerfectes);
    }
}
