/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber3;

import java.util.regex.Pattern;

/**
 *
 * @author dannibrito
 */
public class Validador {
    
    boolean verificarCedula(String cedula) {
        Pattern cedulaPattern = Pattern.compile("(0[1-9]|1\\d|2[0-4])(\\d{8}|\\d{7}-\\d)");
        return cedulaPattern.matcher(cedula).find();
    }
    
    boolean verificarCorreo(String correo) {
        Pattern correoPattern = Pattern.compile("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}");
        return correoPattern.matcher(correo).find();
    }
}
