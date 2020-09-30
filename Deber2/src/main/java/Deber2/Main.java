/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;

/**
 *
 * @author dannibrito
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // creamos nuestro objeto para almacenar la expresion regular
        Pattern password = Pattern.compile("^(?=.{8,16}$)(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%&]).*$");
        
        Pattern nombre = Pattern.compile("([A-ZÁÉÍÓÚÑ][a-záéíóúñ]+\\s{0,1}){3,4}");
        
        Pattern cedula = Pattern.compile("(0[1-9]|1\\d|2[0-4])(\\d{8}|\\d{7}-\\d)");
        
        Pattern ip = Pattern.compile("((0|[1-9]|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.)((0|[1-9]|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.)((0|[1-9]|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.)((0|[1-9]|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]))");
        
        Pattern hoy = Pattern.compile("(date|fecha|hoy|today)", Pattern.CASE_INSENSITIVE);
        
        Pattern tomorrow = Pattern.compile("(mañana|tomorrow)", Pattern.CASE_INSENSITIVE);
        
        Pattern hora = Pattern.compile("(hora|time)", Pattern.CASE_INSENSITIVE);
        
        Pattern yo = Pattern.compile("(yo|i)", Pattern.CASE_INSENSITIVE);
        
        Pattern salir = Pattern.compile("(quit|salir|q|s)", Pattern.CASE_INSENSITIVE);
        
        // creamos un objeto que busque la expresion dentro del input
        Matcher matcher = tomorrow.matcher("dame la tODAy");
        
        boolean encontrado = matcher.find();
        
        do {
            String entrada = JOptionPane.showInputDialog("Ingrese su cadena");
            
            if(password.matcher(entrada).find()) {
                JOptionPane.showMessageDialog(null, "Bienvenido");
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }
            
            
        } while (true);
    }
    
}
