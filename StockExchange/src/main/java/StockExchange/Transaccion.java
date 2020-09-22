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

    public Transaccion(String tipo, int periodo, Empresa empresa, int numeroDeAcciones) {
        this.tipo = tipo;
        this.periodo = periodo;
        this.empresa = empresa;
        this.numeroDeAcciones = numeroDeAcciones;
        this.valorTotal = empresa.precioActual * numeroDeAcciones;
    }

    @Override
    public String toString() {
        return "\n\t" + periodo +
                "\t" + tipo +
                "\t" + empresa.nombre +
                "\t" + numeroDeAcciones +
                "\t" + valorTotal / numeroDeAcciones +
                "\t" + valorTotal +
                "\t"; // falta el saldo
    }

}
