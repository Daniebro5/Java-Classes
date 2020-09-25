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
public class AccionVendida {
    
    Empresa empresa;
    int numeroDeAcciones;
    double valorTotalDeCompra;
    double valorCompra;
    double valorVenta;
    double rentabilidad;
    double porcentaje;

    public AccionVendida(AccionDisponible accion, int numeroDeAcciones) {
        this.empresa = accion.empresa;
        this.numeroDeAcciones = numeroDeAcciones;
        this.valorCompra = accion.valorDeCompra / accion.numeroDeAcciones;
        this.valorTotalDeCompra = this.valorCompra * numeroDeAcciones;
        this.valorVenta = accion.empresa.precioActual * numeroDeAcciones;
        this.rentabilidad = this.valorVenta - this.valorTotalDeCompra;
        this.porcentaje = (this.rentabilidad / this.valorTotalDeCompra) * 100;
    }

    @Override
    public String toString() {
        return "\n\t" + empresa.nombre + 
                "\t" + numeroDeAcciones + 
                "\t" + redondearADosDecimales(valorTotalDeCompra) + 
                "\t\t" + redondearADosDecimales(valorCompra) + 
                "\t\t" + redondearADosDecimales(valorVenta) + 
                "\t\t" + redondearADosDecimales(rentabilidad) + 
                "\t\t" + redondearADosDecimales(porcentaje);
    }
    
    public double redondearADosDecimales(double numero) {
        return Math.round(numero * 100.0) / 100.0;
    }
    
}
