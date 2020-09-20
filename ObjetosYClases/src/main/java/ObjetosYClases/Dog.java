/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosYClases;

/**
 *
 * @author dannibrito
 */
// tipos de variables

/*
Variables locales: definidas dentro de métodos, constructores o bloques de código.
Estas variables son construidas dentro del bloque y destruidas al finalizar.
Variables de instancia: son variables dentro de una clase, pero fuera de cualquier método.
estas variables son inicializadas cuando la clase es inicializada, estas variables
pueden ser accedidas desde adentro de cualquier método, constructor o bloque de esa
misma clase.
Variables de clase: estas son declaradas dentro de la clase, fuera de cualquier método
pero con la palabra static. Variable compartida por las instancias de la clase.
 */
public class Dog {

    String raza; // instancia;
    int edad; // instancia;
    String color; // instancia;

    static int numeroPatas = 4; // de clase

    void ladrar() {
        int x = 9; // local
        // operaciones con x
        // destruccion de x antes de salir
    }

    void comer() {
        int x = 10; // local
    }

    void dormir() {
        int x = 11; // local
    }
}
