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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo tr1 = new Triangulo();
        tr1.a = new Punto(9,8);
        tr1.b = new Punto(5,-4);
        tr1.c = new Punto(-7,3);
        
        System.out.println(tr1.toString());
        System.out.printf("\nEl perimetro es: %.1f\n", tr1.perimetro());
        System.out.printf("\nEl area es: %.1f\n", tr1.area());
        
        int min = -10, max = 10;
        int dentro = 0, fuera = 0;
        int numeroPuntos = 100000000;
        
        for(int i = 0; i < numeroPuntos; i++) {
            int x = (int)(Math.random() * (max - min + 1) + min);
            int y = (int)(Math.random() * (max - min + 1) + min);
            if(tr1.pointInTriangle(new Punto(x, y))) {
                dentro += 1;
            }
        }
        
        double fraccion = (double)dentro / (double)numeroPuntos;
        double areaExp = fraccion * 400;
        
        System.out.printf("\nEl area experimental es: %.1f\n", areaExp);
        
        
        
    }
    
}
