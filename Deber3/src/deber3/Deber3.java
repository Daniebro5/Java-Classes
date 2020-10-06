/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author dannibrito
 */
public class Deber3 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Text nombreLabel = new Text("Nombre");
        Text direccionLabel = new Text("Dirección");
        Text correoLabel = new Text("Correo");
        Text cedulaLabel = new Text("Cédula");

        TextField nombreField = new TextField();
        TextField direccionField = new TextField();
        TextField correoField = new TextField();
        TextField cedulaField = new TextField();

        Text tamanioLabel = new Text("Escoge el tamaño");

        //Toggle group of radio buttons       
        ToggleGroup groupSize = new ToggleGroup();
        RadioButton pequeniaRadio = new RadioButton("Pequeña");
        pequeniaRadio.setToggleGroup(groupSize);
        RadioButton medianaRadio = new RadioButton("Mediana");
        medianaRadio.setToggleGroup(groupSize);
        RadioButton familiarRadio = new RadioButton("Familiar");
        familiarRadio.setToggleGroup(groupSize);
        RadioButton fiestaRadio = new RadioButton("Fiesta");
        fiestaRadio.setToggleGroup(groupSize);

        
        Text typeLabel = new Text("Escoge tu pizza");
        
        ChoiceBox typechoiceBox = new ChoiceBox();
        typechoiceBox.getItems().addAll("All Meats", "BBQ", "Hawaiiana", "Chocolate", "Pollo Teriyaki");

        
        Text adicionalLabel = new Text("Deseas Ingredientes Adicionales?");
        
        CheckBox quesoCheckBox = new CheckBox("Queso");
        quesoCheckBox.setIndeterminate(false);

        CheckBox pepperoniCheckBox = new CheckBox("Pepperoni");
        pepperoniCheckBox.setIndeterminate(false);

        CheckBox jamonCheckBox = new CheckBox("Jamón");
        jamonCheckBox.setIndeterminate(false);

        CheckBox panCheckBox = new CheckBox("Pan de Ajo");
        panCheckBox.setIndeterminate(false);

        

        GridPane grid = new GridPane();
        grid.setMinSize(300, 300);
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(5);
        grid.setHgap(5);

        grid.add(nombreLabel, 0, 0);
        grid.add(nombreField, 1, 0);
        grid.add(direccionLabel, 0, 1);
        grid.add(direccionField, 1, 1);
        grid.add(correoLabel, 0, 2);
        grid.add(correoField, 1, 2);
        grid.add(cedulaLabel, 0, 3);
        grid.add(cedulaField, 1, 3);
        
        grid.add(tamanioLabel, 0, 5);
        grid.add(pequeniaRadio, 0, 6);
        grid.add(medianaRadio, 1, 6);
        grid.add(familiarRadio, 2, 6);
        grid.add(fiestaRadio, 3, 6);
        
        grid.add(typeLabel, 0, 8);
        grid.add(typechoiceBox, 1, 8);
        
        
        grid.add(adicionalLabel, 0, 9);
        grid.add(quesoCheckBox, 0, 10);
        grid.add(pepperoniCheckBox, 1, 10);
        grid.add(jamonCheckBox, 2, 10);
        grid.add(panCheckBox, 3, 10);
        

        
        Button btn = new Button();
        btn.setText("Pasar a comprar");
        
        
//        GridPane grid2 = new GridPane();
//        grid2.setMinSize(333, 333);
//        grid2.add(direccionLabel, 0, 0);
        
//        Scene scene2 = new Scene(grid2);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                Validador validador = new Validador();
                if(validador.verificarCedula(cedulaField.getText())
                    &&
                    validador.verificarCorreo(correoField.getText())
                ) {
                    System.out.println("son correctos");
                    // set de la nueva scena y crear la nueva grilla
                } else {
                    System.out.println("no son correctos");
                }
                
                
            }
        });
        
        grid.add(btn, 4, 4);
        
        Scene scene = new Scene(grid);
        
        primaryStage.setTitle("Pizzeria");
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
