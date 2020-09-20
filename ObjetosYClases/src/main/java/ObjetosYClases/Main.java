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
public class Main {

    /**
     * @param args the command line arguments
     */
    
    // Java es un lenguaje orientado a objetos
    // Polimorfismo, herencia, encapsulacion, abstraccion
    // Clases, objetos, instancias, metodos, atributos
    
    /*
    Objetos: tienen estados y comportamiento. Ejemplo:
    un perro tiene un estado - color, nombre, raza;
    Comportamiento - mover la cola, ladrar, comer
    Objeto es la instancia de una clase
    
    Clase: puede ser definida como un molde o un plano
    que describe el estado y comportamiento que los objetos
    de ese tipo pueden tener.
    
    En desarrollo de software, en JAVA, la comunicacion 
    entre objetos y la manipulacion del estado de un objeto
    se lo hace mediante los metodos.
    */
            
    

    public Main() {
    }
    
    public static void main(String[] args) {
        // palabra reservada 'new' para crear objetos
        // pasos para crear(instanciar) un nuevo objeto
        
        // declaracion: una variable es declarada con el
        // nombre y el tipo de objeto
        
        // instanciacion: la palabra 'new' es usada
        // para crear el objeto
        
        // inicializacion: la palabra 'new' ejecuta 
        // el constructor y esta llamada inicializa el objeto
        
        Puppy cachorro1;
        cachorro1 = new Puppy("tommy");
        
        Puppy cachorro2 = new Puppy("Popoy");
        
        /*
        Las variables de instancia se acceden mediante objetos creados,
        para acceder a una variable de instancia se sigue el siguiente procedimiento
        
        Primero creamos el objeto
            ObjectReference = new Constructor();
        
        Llamamos a la variable
            ObjectReference.variableName;
        
        LLamamos al metodo
            ObjectReference.MethodName();
        */
        
        // creacion de objeto
        Puppy myPuppy = new Puppy("Daddy");
        
        // llamamos al método para poner la edad
        myPuppy.setPuppyAge(2);
        
        // llamamos al método para imprimir la edad
        myPuppy.getPuppyAge();
        
        // podríamos acceder a la variable de instancia de la siguiente manera
        // esto no se debería
        System.out.println("Variable value: " + myPuppy.puppyAge);
        
        House casa1;
        casa1 = new House();
        casa1.setPeople(3);
        casa1.setAddress("Miami");
        casa1.setConstructionMeters(15.2);
        
        House casa2 = new House(5,"La Florida", 250.75);
        
        System.out.println(casa1.toString());
        System.out.println(casa2.toString());
        
    }
    
}
