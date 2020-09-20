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

// variables de clase (static)
/*
- son declaradas con la palabra reservada STATIC, dentro de la clase y fuera
de cualquier método, constructor o bloque
- solo habrá una variable de clase por clase, sin importar el número de
objetos creados de ella (variable compartida)
- son generalmente usadas para declarar constantes, las constantes
nunca cambian su valor inicial, y usan además la palabra final
- son creadas al momento de iniciar el PROGRAMA y se eliminan al terminar.
- los valores por defecto son los mismos que las variables de instancia
- pueden ser accedidas con el nombre de la CLASE en lugar del nombre del 
objeto (Employee.DEPARTMENT)
- Las constantes van con mayúsculas
*/



public class Employee {
    
    // esta variable de instancia es visible para cualquier clase hija
    public String name;
    
    // la variable salario es visible solo dentro de empleado
    // ahora es compartida por todos los objetos
    public static double salary;
    
    // DEPARTAMENTO es una constante
    public static final String DEPARTMENT = "Development";
    
    // la variable nombre es asignada en el constructor
    public Employee(String empName){
        name = empName;
    }
    
    // la variable salario se le asigna un valor
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    // este método imprime los detalles del empleado
    public void printEmp(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    
}
