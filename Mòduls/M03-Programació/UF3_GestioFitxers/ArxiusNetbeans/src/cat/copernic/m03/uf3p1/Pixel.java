/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf3p1;

/**
 * Representa un pixel
 
 codifica 3 bytes en 1 pixel
 
 * @author rferrero
 */
public class Pixel {
    
    private byte red;
    private byte green;
    private byte blue;
    
    public Pixel(byte red, byte green, byte blue) {
    
        this.red   = red;
        this.green = green;
        this.blue  = blue;
    }
    
    public Pixel() {}
    
    public Pixel(byte[] dades,int posicio) {
        
        blue  = dades[posicio];
        green = dades[posicio+1];
        red   = dades[posicio+2];
    }
    
    public byte getRed() {
        return red;
    }
    
    public byte getGreen() {
        return green;
    }
    
    public byte getBlue() {
        return blue;
    }
    
    public void setRed(byte red) {
        this.red = red;
    }
    
    public void setGreen(byte green) {
        this.green = green;
    }
    
    public void setBlue(byte blue) {
        this.blue = blue;
    }
    
    
    public void setPixelToData(byte[] dades, int posicio) {
        dades[posicio]   = blue;
        dades[posicio+1] = green;
        dades[posicio+2] = red;
    }
    
}
