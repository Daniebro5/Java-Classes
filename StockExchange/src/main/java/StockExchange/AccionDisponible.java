/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockExchange;

/**
 *
 * @author dannibrito
 */
public class AccionDisponible {
    
    Empresa empresa;
    double valorDeCompra;
    int numeroDeAcciones;

    public AccionDisponible(Empresa empresa, int numeroDeAcciones) {
        this.empresa = empresa;
        this.valorDeCompra = empresa.precioActual * numeroDeAcciones;
        this.numeroDeAcciones = numeroDeAcciones;
    }

    @Override
    public String toString() {
        return "AccionDisponible{" + "empresa=" + empresa.nombre + "numeroDeAcciones=" + numeroDeAcciones + "}\n";
    }
    
}
