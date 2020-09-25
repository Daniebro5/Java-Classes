/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockExchange;
import java.util.Vector;
import java.time.*;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author dannibrito
 */
public class Portafolio {
    
    double capital;
    double capitalOriginal;
    Vector<Transaccion> transacciones;
    Vector<AccionDisponible> accionesDisponibles;

    public Portafolio(double capital) {
        this.capital = capital;
        this.capitalOriginal = capital;
        transacciones = new Vector();
        accionesDisponibles = new Vector();
    }
    
    public void comprarAcciones(Empresa empresa, int numeroDeAcciones) {
        if(this.capital < empresa.precioActual * numeroDeAcciones) {
            
            System.out.println("No tienes el suficiente dinero");
            
        } else {
            
            Transaccion transaccion = new Transaccion("Compra", empresa.acciones.elementAt(0).periodo, empresa, numeroDeAcciones, this.capital);
            this.transacciones.add(transaccion);
            
            AccionDisponible accion = new AccionDisponible(empresa, numeroDeAcciones);
            this.accionesDisponibles.add(accion);
            
            this.capital -= empresa.precioActual * numeroDeAcciones;
        }
    }
    
    public void venderAcciones(AccionDisponible accion, int numeroDeAcciones) {
        if(accion.numeroDeAcciones < numeroDeAcciones) {
            
            System.out.println("No tengo suficientes acciones");
            
        } else {
            
            Transaccion transaccion = new Transaccion("Venta", accion.empresa.acciones.elementAt(0).periodo, accion.empresa, numeroDeAcciones, this.capital);
            this.transacciones.add(transaccion);
            
            this.capital += accion.empresa.precioActual * numeroDeAcciones;
            
            if(accion.numeroDeAcciones == numeroDeAcciones) {
                this.accionesDisponibles.remove(accion);
            } else {
                accion.numeroDeAcciones -= numeroDeAcciones;
            }
            
        }
    }
    
    public void imprimirTransacciones() {
        String aux = "\nListado de Transacciones\n";
        aux += "Capital original: " + this.capitalOriginal;
        aux += "\n\n\tPeriodo\tTipo\tEmpresa\t\tNum\tValor Accion\tInversion\tSaldo";
        
        for(Transaccion transaccion: this.transacciones) {
            aux += transaccion.toString();
        }
        
        System.out.println(aux);
    }

    @Override
    public String toString() {
        return "Portafolio{" + "accionesDisponibles=" + accionesDisponibles + '}';
    }
    

    
    
}
