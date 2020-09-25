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
public class Transaccion {
    
    String tipo;
    int periodo;
    Empresa empresa;
    int numeroDeAcciones;
    double valorTotal;
    double saldo;

    public Transaccion(String tipo, int periodo, Empresa empresa, int numeroDeAcciones, double capital) {
        this.tipo = tipo;
        this.periodo = periodo;
        this.empresa = empresa;
        this.numeroDeAcciones = numeroDeAcciones;
        this.valorTotal = empresa.precioActual * numeroDeAcciones;
        
        
        // tipo == "Compra"
        if( "Compra".equals(tipo) ) {
            this.saldo = capital - this.valorTotal;
        } else {
            this.saldo = capital + this.valorTotal;
        }
    }

    @Override
    public String toString() {
        return "\n\t" + periodo +
                "\t" + tipo +
                "\t" + empresa.nombre +
                "\t" + numeroDeAcciones +
                "\t" + redondearADosDecimales(valorTotal / numeroDeAcciones) +
                "\t\t" + redondearADosDecimales(valorTotal) +
                "\t\t" + redondearADosDecimales(saldo);
    }
    
    public double redondearADosDecimales(double numero) {
        return Math.round(numero * 100.0) / 100.0;
    }

}
