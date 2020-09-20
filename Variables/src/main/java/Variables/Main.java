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
public class Main {
    
    /**
     * @param args the command line arguments
     */
    
    /*
    Una variable nos provee un almacenamiento con nombre que 
    nuestros programas pueden manipular. Cada variable en Java tiene
    un tipo específico, el cual determina el tamaño y la posición 
    de la variable en memoria; también determina el rango de posibles
    valores que puede tener y operaciones que puedo realizar sobre ellos
    */
    
    /*
    Variables locales:
        - son declaradas en métodos, constructores o bloques
        - se crea al ingresar, y se destruye al salir
        - modificadores de acceso no se pueden usar en ellas
        - Solo son visibles dentro del método, constructor o bloque
        - Son implementadas en el STACK de memoria
        - No hay valor por defecto para estas variables,
        por lo cual hay q inicializarlas
        
        null - [] - 0 ""
    
    */
    
    
    
    public static void main(String[] args) {
        System.out.println("Clase sobre Variables");
        
        int a, b, c; // declaro 3 enteros a, b, c
        int x = 10, y = 20; // ejemplo de inicialización
        byte B = 22; // inicializo una variable B de tipo Byte
        double pi = 3.141592; // declaro y asigno el valor de PI
        char p = 'p'; // inicializando un caracter
        
        Test test = new Test();
        test.pupAge();
        
        Employee emp1 = new Employee("Danni");
        
        
        emp1.setSalary(1000.50);
        emp1.printEmp();
        
        System.out.println(Employee.DEPARTMENT + " Promedio de salario " + Employee.salary);
        
    }
    
}
