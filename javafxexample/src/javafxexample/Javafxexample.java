/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxexample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// Clases de JavaFX Importantes
/*
.animation
    contiene especificaciones para añadir transiciones llenar, desaparecer, girar...etc
.application
    controla el ciclo de vida de la app
.css
    controla los estilos
.event
    controla los eventos y los pasa al código
.geometry  
    permite gestionar elementos en 2D
.stage
    controla los escenarios
.scene 
    controla las escenas
.
*/


/**
 *
 * @author dannibrito
 */
public class Javafxexample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        /*
        Cóigo de nuestra aplicacion JavaFX
        (Stage, scene, scene graph)
        
        1. preparamos el grapho con los nodos requeridos
        2. Preparamos una escena con las dimensiones requeridas
            y añadimos el grafo
        3. Preparamos un escenario y añadimos la escena
        
        */
        
        // 1 (Group, Region, WebView)
        Group root = new Group();
        
        // traemos nuestra lista de objetos
        ObservableList list = root.getChildren();
        
        Button btn = new Button();        
        // anadimos un nodo a la lista
        list.add(btn);
        
        // Region Accordion, ButtonBar, ComboBozBase, HTML Editor...etc
        
        // creamos un StackPane
        StackPane pane = new StackPane();
        
        // anadimos elementos al stackpane
        ObservableList list2 = pane.getChildren();
        list2.add(btn);
        list.add(pane);
        
        // 2
        Scene scene = new Scene(root);
        // segundo constructor q indica las dimensiones
        // Scene scene = new Scene(root, 600, 300);
        
        // 3
        
        // le damos un titulo
        primaryStage.setTitle("Ejemplo Fx");
        
        // ponemos la escena dentro
        primaryStage.setScene(scene);
        
        // Mostramos el escenario
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
