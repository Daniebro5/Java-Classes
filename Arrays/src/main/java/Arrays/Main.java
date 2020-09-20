/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author dannibrito
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    /*
    Java provee una estrutura de datos, ARRAY, que almacena una colección de tamaño
    definido y secuencial de elementos del MISMO TIPO.
    
    n1, n2, n3, n4, n5... -> numbers[100]
    */
    
    public static void main(String[] args) {
        //Declaracion
        /*
        manera tradicional
            - dataType arrayName[];
        manera preferida
            - dataType[] arrayName;
        */
        double[] miArray;
        
        // Creacion 
        /*
        arrayName = new dataType[size];
        */
        miArray = new double[10000];
        
        // Declaracion y creacion
        int[] segundoArray = new int[5];
        
        // los indices van desde 0 ..< size()
        
        // Asignación
        int[] soloUnos = {1,1,1,1,1};
        
        TestArray ta = new TestArray();
        
        ta.imprimirArray();
        ta.imprimirSumaArray();
        ta.imprimirNumeroMasGrande();
        
    }
    
}
