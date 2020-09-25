/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockExchange;
import java.util.Vector;

/**
 *
 * @author dannibrito
 */
public class Main {
    
    static Vector<Empresa> empresas = new Vector();
    
    static int periodoActual = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empresa amazon = new Empresa("Amazon.com", 3200);
        Empresa apple = new Empresa("Apple", 100);
        Empresa facebook = new Empresa("Facebook", 280);
        Empresa google = new Empresa("Google", 1600);
        Empresa nvidia = new Empresa("NVIDIA---", 500);
        Empresa tesla = new Empresa("Tesla Motors", 400);
        Empresa disney = new Empresa("Walt Disney", 130);
        
        empresas.add(amazon);
        empresas.add(apple);
        empresas.add(facebook);
        empresas.add(google);
        empresas.add(nvidia);
        empresas.add(tesla);
        empresas.add(disney);
        
        avanzarPeriodo();
        
        Portafolio portafolio = new Portafolio(127000);
        portafolio.comprarAcciones(disney, 5);
        portafolio.comprarAcciones(facebook, 4);
        
        avanzarPeriodo();
        portafolio.comprarAcciones(nvidia, 10);
        
        avanzarPeriodo();
        portafolio.comprarAcciones(disney, 2);
        
        System.out.println(portafolio.toString());
        
        avanzarPeriodo();
        portafolio.venderAcciones(portafolio.accionesDisponibles.elementAt(1), 4);
        portafolio.comprarAcciones(amazon, 7);
        
        System.out.println("Aqui vendi de facebook " + portafolio.toString());
        
        avanzarPeriodo();
        portafolio.venderAcciones(portafolio.accionesDisponibles.elementAt(3), 1);
        
        
        
        portafolio.venderAcciones(portafolio.accionesDisponibles.elementAt(1), 2);
        
        System.out.println(portafolio.toString());
        
        portafolio.imprimirTransacciones();
        
    }
    
    public static void avanzarPeriodo() {
        periodoActual += 1;
        for(Empresa empresa: empresas) {
            empresa.avanzarPeriodo();
        }
    }
    
}
