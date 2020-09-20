/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber1;

/**
 *
 * @author dannibrito
 */
public class Punto {
    float x, y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    public double distanciaAlPunto(Punto otroPunto) {
        return Math.sqrt(Math.pow(x - otroPunto.x, 2) + Math.pow(y - otroPunto.y, 2));
    }
    
}
