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
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
        
        // Ejemplo 1
        
        // creamos un objeto group/ root
        Group root = new Group();
        //creamos una escena y le pasamos el objeto group
        //ademas ponemos las dimensiones
        Scene scene = new Scene(root, 1200, 300);
        //ponemos un color a la escena
        scene.setFill(Color.BLUEVIOLET);
        // le damos un titulo al escenario
        primaryStage.setTitle("Ejemplo");
        //añadimos la escena al escenario
        primaryStage.setScene(scene);
        // mostramos el escenario
        primaryStage.show();
        
        
        
        // ejemplo 2
        
        //creamos un objeto Line
        Line line = new Line();
        
        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(500.0);
        line.setEndY(150.0);
        
        Group root = new Group(line);
        
        Scene scene = new Scene(root, 600, 300);
        
        primaryStage.setTitle("Linea recta");
        
        primaryStage.setScene(scene);
        
        primaryStage.show();
        */
        
        // Creamos un objeto Text
        Text text = new Text();
        
        // le ponemos un tamaño
        text.setFont(new Font(45));
        
        // ponemos la posición del texto
        text.setX(50);
        text.setY(150);
        text.setFill(Color.SLATEGRAY);
        
        text.setText("Clases de JavaFX");
        
        Group root = new Group(text);
        Scene scene = new Scene(root, 600, 300);
        
        primaryStage.setTitle("Texto plano");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
