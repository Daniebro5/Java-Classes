/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uicontrols;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author dannibrito
 */
public class UIControls extends Application {
    
    // Consideraciones cuando hablamos UI
    
    // UI elements: elementos visuales (HTML)
    // Layout: Como está organizado y como se ve (CSS)
    // Comportamiento: que se hace cuando interaccion(eventos) (JavaScript)
    
    @Override
    public void start(Stage primaryStage) {
        // Elementos de UI
        
        // Label -> no editable
        // Button
        // ColorPicker
        // CheckBox
        // RadioButton
        // ListView
        // TextField -> Editable
        // PasswordField
        // ScrollBar
        // FileChooser
        // ProgressBar
        // Slider
        
        UIObjects persona = new UIObjects();
        persona.nombre = "Danni";
        persona.edad = 25;
        
        // creating label email
        Text emailLabel = new Text(persona.nombre);
        
        // creating label password
        Text passwordLabel = new Text("" + persona.edad);
        
        // create textfield for email
        TextField emailTextField = new TextField();
        
        // create text field for password
        PasswordField passwordField = new PasswordField();
        
        // creating buttons
        Button submitButton = new Button("Submit");
        Button clearButton = new Button("Clear");
        
        // Creating a grid pane
        GridPane grid = new GridPane();
        
        // le damos un tamaño
        grid.setMinSize(400, 200);
        
        // setting the padding (distancia entre elementos)
        grid.setPadding(new Insets(10, 10, 10, 10));
        
        // set V-H gaps
        grid.setVgap(5);
        grid.setHgap(5);
        
        // setting the grid alignment
        grid.setAlignment(Pos.CENTER);
        
        // ponemos los elementos en la grilla
        grid.add(emailLabel, 0, 0);
        grid.add(emailTextField, 1, 0);
        grid.add(passwordLabel, 0, 1);
        grid.add(passwordField, 1, 1);
        grid.add(submitButton, 0, 2);
        grid.add(clearButton, 1, 2);
        
        // creating a scene object
        Scene scene = new Scene(grid);
        primaryStage.setTitle("Ejemplo UI");
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
