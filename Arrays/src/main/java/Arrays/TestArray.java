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
public class TestArray {
    
    double[] myList = {1.9, 2.9, 3.4, 3.5};
    
    void imprimirArray(){
        for(int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
    }
    
    void imprimirSumaArray() {
        double suma = 0;
//        for(int i = 0; i < myList.length; i++) {
//            suma += myList[i];
//        }
        for(double num: myList) {
            suma += num;
        }
        System.out.print("La suma es: " + suma);
    }
    
    void imprimirNumeroMasGrande() {
        double mayor = myList[0];
//        for(int i = 1; i < myList.length; i++) {
//            if(myList[i] > mayor) {
//                mayor = myList[i];
//            }
//        }
        for(double num: myList){
            if(num > mayor) {
                mayor = num;
            }
        }
        System.out.print("El numero mayor es: " + mayor);
    }
    
    void imprimirMedianteForEach() {
        // ForEach es otra manera de hacer un FOR
        // siempre que no necesitemos índices, utilizar un ForEach
        for(double numero: myList) {
            System.out.println(numero);
        }
    }
    
}
