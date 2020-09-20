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
public class Empresa {
    
    String nombre;
    double precioOriginal;
    double precioActual;
    Vector<Accion> acciones;

    public Empresa(String nombre, double precioOriginal) {
        this.precioActual = precioOriginal;
        this.nombre = nombre;
        this.precioOriginal = precioOriginal;
        
        this.acciones = new Vector();
    }
    
    public void avanzarPeriodo() {
        
        // Avanzar periodo, significa avanzar al siguiente viernes
        
        // (0..<1) * (max - min) + min
        double porcentaje = (Math.random() * (19.99 + 19.99)) - 19.99 ;
        
        // En el siguiente viernes crearemos una nueva accion
        Accion nuevaAccion = new Accion(this.precioActual, porcentaje, this.acciones.size() + 1);
        
        
        
        // añadimos nuestra nueva accion al vector de acciones
        this.acciones.add(nuevaAccion);
        
        // el valor actual de esta nueva acción será el precio actual de 
        // las accionesde la compañia
        this.precioActual = nuevaAccion.valorActual;
    }

    // Empresa
    // Nombre: nombre
    // Precio Original: #####
    // Precio Actual: #####
    // Acciones:
    //  Periodo Valor Inicial   Valor Actual    Variacion   Porcentaje
    //  xxx xxx x   x   x   xx  x   x   x   x   x   xx  x   x   x  
    //  xxx xxx x   x   x   xx  x   x   x   x   x   xx  x   x   x  
    //  xxx xxx x   x   x   xx  x   x   x   x   x   xx  x   x   x  
    //  xxx xxx x   x   x   xx  x   x   x   x   x   xx  x   x   x  
    //  xxx xxx x   x   x   xx  x   x   x   x   x   xx  x   x   x  
    @Override
    public String toString() {
        String aux = 
                "Empresa" + "\nNombre: " + nombre + 
                "\nPrecio Original: " + precioOriginal + 
                "\nPrecio Actual: " + precioActual +
                "\nAcciones:" +
                "\n\tPeriodo\t\tValor Inicial\tValor Actual\tVariacion\tPorcentaje";
        
        System.out.println(this.acciones.size());
        for(Accion accion: this.acciones) {
            aux += accion.toString();
        }
        
        return aux;
    }
    
    public void imprimirHistograma() {
        
        int asteriscos = 50;
        String aux = "\n\n\nHistograma\n\nPeriodo\tValor";
        
        double mayor = this.acciones.elementAt(0).valorActual;
        for(Accion accion: this.acciones) {
            if(accion.valorActual > mayor) {
                mayor = accion.valorActual;
            }
        }
        
        // imprimimos el valor original
        aux += "\n0\t" + redondearADosDecimales(this.precioOriginal) + "\t";
        for(int i = 0; i < (int)(this.precioOriginal * asteriscos / mayor); i++) {
            aux += "*";
        }
        
        // imprimimos los valores actuales de cada periodo
        for(Accion accion: this.acciones) {
            aux += "\n" + accion.periodo + "\t" + redondearADosDecimales(accion.valorActual) + "\t";
            for(int i = 0; i < (int)(accion.valorActual * asteriscos / mayor); i++) {
                aux += "*";
            }
        }
        
        System.out.println(aux);
        
        
    }
    
    public double redondearADosDecimales(double numero) {
        return Math.round(numero * 100.0) / 100.0;
    }
    
}
