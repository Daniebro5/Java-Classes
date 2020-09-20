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
public class Accion {
    
    int periodo;
    
    double valorInicial;
    double valorActual;
    double variacion;
    double porcentaje;

    public Accion(double valorInicial, double porcentaje, int periodo) {
        this.valorInicial = valorInicial;
        this.porcentaje = porcentaje;
        this.periodo = periodo;
        
        // 
        this.variacion = valorInicial * (porcentaje / 100);
        this.valorActual = this.valorInicial + this.variacion;
    }

    // Viernes 1    23.12  24.12 1.23   45%
    // Viernes 2    23.12  24.12 1.23   45%
    // Viernes 3    23.12  24.12 1.23   45%
    @Override
    public String toString() {
        return "\n\tViernes " + periodo + 
                "\t" + redondearADosDecimales(valorInicial) + 
                "\t\t" + redondearADosDecimales(valorActual) + 
                "\t\t" + redondearADosDecimales(variacion) + 
                "\t\t" + redondearADosDecimales(porcentaje);
    }

    public double redondearADosDecimales(double numero) {
        return Math.round(numero * 100.0) / 100.0;
    }
}
