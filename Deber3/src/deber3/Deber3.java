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

        ChoiceBox typechoiceBox = new ChoiceBox();
        typechoiceBox.getItems().addAll("All Meats", "BBQ", "Hawaiiana", "Chocolate", "Pollo Teriyaki");

        CheckBox quesoCheckBox = new CheckBox("Queso");
        quesoCheckBox.setIndeterminate(false);

        CheckBox pepperoniCheckBox = new CheckBox("Pepperoni");
        pepperoniCheckBox.setIndeterminate(false);

        CheckBox jamonCheckBox = new CheckBox("Jamón");
        jamonCheckBox.setIndeterminate(false);

        CheckBox panCheckBox = new CheckBox("Pan de Ajo");
        panCheckBox.setIndeterminate(false);

        Button btn = new Button();
        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });

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
