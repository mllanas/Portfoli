
package cat.copernic.m03.uf3p1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author txell
 */

public class LDIF2JPEG {

    public static void main(String[] args) throws IOException {
        
        try {
            
        // 1. Llegir fitxer de texte LDIF
            BufferedReader entrada = new BufferedReader(
                                     new FileReader("dades/fitxer.ldif"));
            
            String contingut = "", ldif = "";
            do 
            {
                contingut = entrada.readLine();                                 // Capturo línia a línia la seqüència de caràcters dins l'String

                if (contingut != null)                                          // mentres hi hagi caracters que llegir...
                    ldif += contingut;                                          // guardar dins l'String

            } while (contingut != null);            
            entrada.close();                                                    // Tancar Buffer
            
            
        // 2. Detectar codi fotos i noms d'usuaris
            int iniciCodiFoto   = ldif.indexOf("::"),                       
                fiCodiFoto      = ldif.indexOf("loginshell:"),
                iniciNomUsuari  = ldif.indexOf("uid:"),                     
                fiNomUsuari     = ldif.indexOf("uidnumber:");
                        
            String codiFotoUsuari = "", nomUsuari="";            
            do
            { 
            
                // 2.1 Guardar bloc de codi de la foto a un fitxer TXT
                int indexIniciCodiFoto  = iniciCodiFoto+2;                      // sumo 2 per evitar els 2 espais que hi ha davant del codi a capturar
                int indexFiCodiFoto     = fiCodiFoto;
                codiFotoUsuari = ldif.substring(indexIniciCodiFoto, 
                                 indexFiCodiFoto).replaceAll(" ", "");          // guardo contingut sense espais
                
            
                // 2.2. Recuperar nom usuari per nombrar l'arxiu
                int indexIniciNomUsuari = iniciNomUsuari+5;                     // sumo 5 per evitar els 5 caracters que hi ha davant del codi a capturar
                int indexFiNomUsuari    = fiNomUsuari;
                nomUsuari = ldif.substring(indexIniciNomUsuari, 
                                           indexFiNomUsuari);
                                
                
                // 2.3. Guardar foto usuari
                StringToPhoto(codiFotoUsuari, nomUsuari);
                
                
                // 2.4. Reiniciar índexs per seleccionar següent bloc de codis (foto/nom)
                iniciCodiFoto   = ldif.indexOf("::", indexFiCodiFoto);
                fiCodiFoto      = ldif.indexOf("loginshell:", iniciCodiFoto);
                iniciNomUsuari  = ldif.indexOf("uid:", indexFiNomUsuari);                     
                fiNomUsuari     = ldif.indexOf("uidnumber:", iniciNomUsuari);                
                                
                
            } while (!ldif.equals("") && iniciCodiFoto != -1);
                
            
        } catch (FileNotFoundException fnf) {
            System.out.println("El fitxer no s'ha trobat.");
        } catch (IOException ioe) {
            System.out.println("Error I/O: " + ioe.getMessage());
        }
         
    }
        
/* 
   Aquest mètode torna el codi enter que correspon a la taula Base64 de caràcter
   que li passem. Torna un -1 si el char que li passem no es troba a la taula 
*/
    static int codiBase64(char caracter) {                                      
        
        int resultat = -1;
        
        if (caracter >= 'A' && caracter <= 'Z') {
            resultat = caracter - 'A';
        } else if (caracter >= 'a' && caracter <= 'z') {
            resultat = 26 + caracter - 'a';
        } else if (caracter >= '0' && caracter <= '9') {
            resultat = 52 + caracter - '0';
        } else if (caracter == '+') {
            resultat = 62;
        } else if (caracter == '/') {
            resultat = 63;
        }
        
        return resultat;
    }
    

/* 
   Decodifica un grup de 4 caràcters consecutius que estan en Base64 a partir de 
   la posició index, on dades representa la cadena que conté la imatge en Base64. 
   Retornarà 3 bytes que serà la representació binària d’aquests caràcters.
   el nostre fitxer base64 ha de ser un String
*/    
    static byte[] decode(String dades,int index) {                              // converteix un grup de 4 caràcters en Base64 a 3 bytes en binari.
    
        byte[] resultat = new byte[3];
        
        resultat[0] = 
                (byte)( (codiBase64(dades.charAt(index)) << 2) | 
                        ((codiBase64(dades.charAt(index+1)) & 0b110000) >> 4));                 
        resultat[1] = 
                (byte)( (codiBase64(dades.charAt(index+1)) << 4) | 
                        ((codiBase64(dades.charAt(index+2)) & 0b111100) >> 2));        
        resultat[2] = 
                (byte)( (codiBase64(dades.charAt(index+2)) << 6) | 
                        ((codiBase64(dades.charAt(index+3)) & 0b111111)));
                                  
        return resultat;
} 
    
/* 
   A partir d’un String que conté caràcters en Base64 representant una foto, 
   desa un fitxer binari amb nom 'uid usuari' i extensió .jpg (ex: apuig.jpg) 
*/
    static void StringToPhoto(String dades, String nomFitxer) { 

        try {
            
        // 1. Declarar sortida pel fitxer binari  
            FileOutputStream sortida =
                              new FileOutputStream("imatges/"+nomFitxer+".jpg");
        
        
        // 2. Llegir codi foto i escriure'l al fitxer binari
            for (int c = 0; c < dades.length(); c+=4)                           // Decodifica en grups de 4 caràcters Base64-> retorna grup 3 en binari
            {                                                                   
                byte[] dadesBinari = decode(dades,c);                           // Guarda els 3 bytes decodificats al fitxer de sortida
                sortida.write(dadesBinari);                                     // Vaig volcant tota la info de l'array al fitxer binari
            }
            sortida.close();                                                    // Tanco fitxer
           
        } catch (IOException ioe) {                                             // excepció per entrada/sortida de fitxers binaris
            System.out.println("Error I/O: " + ioe.getMessage());
        }
        
    }

}
