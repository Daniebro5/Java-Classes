/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber3;

import java.util.Vector;

/**
 *
 * @author dannibrito
 */
public class Orden {

    String tipo, tamanio;
    Vector<String> ingredientesAdicionales;
    int numeroBebidas;
    String tipoBebida;

    double costeTotal() {
        return precioPizza() + precioBebidas() + precioIngredientesAdicionales();
    }

    double precioPizza() {
        double valor;
        switch (tamanio) {
            case "Pequeña":
                valor = 1;
                break;
            case "Mediana":
                valor = 1.25;
                break;
            case "Familiar":
                valor = 1.75;
                break;
            case "Fiesta":
                valor = 2;
                break;
            default:
                valor = 1;
                break;
        }

        switch (tipo) {
            case "All Meats":
                valor *= 11.99;
                break;
            case "BBQ":
                valor *= 12.99;
                break;
            case "Hawaiiana":
                valor *= 13.99;
                break;
            case "Chocolate":
                valor *= 14.99;
                break;
            case "Pollo Teriyaki":
                valor *= 15.99;
                break;
            default:
                valor *= 10;
                break;
        }

        return valor;

    }

    double precioBebidas() {
        return numeroBebidas * 0.50;
    }

    double precioIngredientesAdicionales() {
        double valor = 0;

        // queso pepperoni jamon pan de ajo
        for (String ingrediente : this.ingredientesAdicionales) {
            switch (ingrediente) {
                case "Queso":
                    valor += 0.75;
                    break;

                case "Pepperoni":
                    valor += 0.75;
                    break;

                case "Jamón":
                    valor += 0.75;
                    break;

                case "Pan de Ajo":
                    valor += 0.75;
                    break;

                default:
                    valor += 0.50;
                    break;
            }
        }
        return valor;
    }

}
