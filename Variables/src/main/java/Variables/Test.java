/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variables;

/**
 *
 * @author dannibrito
 */
public class Test {
    
    int age;
    // Variables de instancia
    /*
    - son declaradas en una clase, pero fuera de cualquier metodo, constructor
    o bloque
    - estas variables se crean en el HEAP.
    - son creadas al momento de ejecutar la palabra reservada new. y eliminadas
    al ser eliminado el objeto.
    - tiene valores que solo deben ser referenciados por el código
    dentro de la misma clase
    - estas son visibles en toda la clase
    - estas si tienen un valor por defecto, 0 para enteros, 0.0 para 
    flotantes y doubles, "" para strings, false para booleas y null para
    objetos
    - si pueden tener modificadores de acceso
    - estas variables son heredadas
    */
    
    
    public void pupAge(){
        age = 0;
        age = age + 7;
        System.out.println("La edad del cachorro es: " + age);
    }
    
}
