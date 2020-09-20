package ObjetosYClases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dannibrito
 */

// Constructores

/*
TODA CLASE TIENE AL MENOS UN CONSTRUCTOR. si nosotros no escribimos un constructor, 
el compilador de JAVA creará uno por defecto.

Cada vez que un objeto es creado, al menos un constructor es llamado.
Deben tener el mismo nombre de la clase, una clase puede tener más de un constructor
*/

public class Puppy {
    
    int puppyAge;

    public int getPuppyAge() {
        System.out.println("Puppy age is: " + puppyAge);
        return puppyAge;
    }

    public void setPuppyAge(int puppyAge) {
        this.puppyAge = puppyAge;
    }
    
    public Puppy(String name) {
        // este constructor tiene 1 parámetro, name(nombre)
        System.out.println(name);
    }
    
    
    
}
