/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandling;

import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.event.EventHandler;
 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.input.MouseEvent; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 

import javafx.scene.text.Font; 
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text; 
import javafx.stage.Stage; 

/**
 *
 * @author dannibrito
 */
public class Eventhandling extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // tipos de eventos 
        
        // foreground -> interaccion con el usuario
        
        // background -> no requiere interaccion con el usuario
        
        // foreground events for user
        // Mouse - Key - Drag - Window(Cerrar y abrir la ventana)
        
        // event handling -> decidir q hacer ante un evento
        // estructura de eventos:
            // objetivo -> nodo en el cual ocurrio el evento
            // fuente -> mouse/teclado
            // tipo -> click/arrastrar/presion de tecla
            
        // Ejemplo
        
        // Dibujamos un círculo
        Circle circle = new Circle();
        
        // Lo posicionamos
        circle.setCenterX(300);
        circle.setCenterY(135);
        
        // le damos un radio
        circle.setRadius(25);
        
        // le damos un color
        circle.setFill(Color.BROWN);
        
        // le damos un ancho de linea
        circle.setStrokeWidth(20);
        
        // setting the text
        Text text = new Text("Haz clic en el circulo para cambiar su color");
        
        // le damos una fuente al texto
        text.setFont(Font.font(null, FontWeight.BOLD, 15));
        
        // le damos color
        text.setFill(Color.CRIMSON);
        
        //le damos una posicion
        text.setX(150);
        text.setY(50);
        
        EventHandler<MouseEvent> eventHandler;
        eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Hola mundo");
                circle.setFill(Color.DARKSLATEBLUE);
            }
        };
        
        // Registrat el evento
        circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        
        Group root = new Group(circle, text);
        
        Scene scene = new Scene(root, 600, 300);
        
        scene.setFill(Color.LAVENDER);
        
        primaryStage.setTitle("Ejemplo de eventos");
        
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
