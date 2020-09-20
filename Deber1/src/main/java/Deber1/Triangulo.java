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
public class Triangulo {
    Punto a, b, c;

    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    public double perimetro(){
        return a.distanciaAlPunto(b) + a.distanciaAlPunto(c) + b.distanciaAlPunto(c);
    }
    
    public double area(){
        // obtenemos el semiperimetro
        double s = this.perimetro() / 2;
        
        // obtenemos las longitudes de los lados
        double ladoA = a.distanciaAlPunto(b);
        double ladoB = a.distanciaAlPunto(c);
        double ladoC = b.distanciaAlPunto(c);
        
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }
    
    public float sign(Punto p1, Punto p2, Punto p3) {
        return (p1.x - p3.x) * (p2.y - p3.y) - (p2.x - p3.x) * (p1.y - p3.y);
    }
    
    public boolean pointInTriangle(Punto aux) {
        float d1, d2, d3;
        boolean has_neg, has_pos;
        
        d1 = this.sign(aux, a, b);
        d2 = this.sign(aux, b, c);
        d3 = this.sign(aux, c, a);
        
        has_neg = (d1 < 0) || (d2 < 0) || (d3 < 0);
        has_pos = (d1 > 0) || (d2 > 0) || (d3 > 0);
        
        return !(has_neg && has_pos);
    }
    
    
}
