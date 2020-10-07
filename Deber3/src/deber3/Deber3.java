/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber3;

import java.util.Vector;
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
import javax.swing.JOptionPane;

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

        grid.add(tamanioLabel, 0, 4);
        grid.add(pequeniaRadio, 0, 5);
        grid.add(medianaRadio, 1, 5);
        grid.add(familiarRadio, 2, 5);
        grid.add(fiestaRadio, 3, 5);

        grid.add(typeLabel, 0, 6);
        grid.add(typechoiceBox, 1, 6);

        grid.add(adicionalLabel, 0, 7);
        grid.add(quesoCheckBox, 0, 8);
        grid.add(pepperoniCheckBox, 1, 8);
        grid.add(jamonCheckBox, 2, 8);
        grid.add(panCheckBox, 3, 8);

        Button btn = new Button();
        btn.setText("Pasar a comprar");


        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                // validamos la cedula y el correo
                Validador validador = new Validador();

                if (validador.verificarCedula(cedulaField.getText())
                        && validador.verificarCorreo(correoField.getText())) {
                    // (int) bebidasLabel.getText() < 11;
                    Orden orden = new Orden();

                    // obtenemos el tamaño
                    RadioButton selected = (RadioButton) groupSize.getSelectedToggle();
                    orden.tamanio = selected.getText();
                    
                    // obtenemos el tipo
                    orden.tipo = typechoiceBox.getSelectionModel().getSelectedItem().toString();
                    
                    // Ingredientes adicionales
                    orden.ingredientesAdicionales = new Vector();
                    if(quesoCheckBox.isSelected()) {
                        orden.ingredientesAdicionales.add("Queso");
                    }
                    if(pepperoniCheckBox.isSelected()) {
                        orden.ingredientesAdicionales.add("Pepperoni");
                    }
                    if(jamonCheckBox.isSelected()) {
                        orden.ingredientesAdicionales.add("Jamón");
                    }
                    if(panCheckBox.isSelected()) {
                        orden.ingredientesAdicionales.add("Pan de Ajo");
                    }
                    
                    // falta las bebidas y el número de bebidas
                    
                    Text tipoOrden = new Text("1 pizza " + orden.tamanio + " de " + orden.tipo);
                    Text valorTipo = new Text("$" + orden.precioPizza());
                    
                    Text numBebidasOrden = new Text(orden.numeroBebidas + " gaseosas");
                    Text numBebidasValor = new Text("$" + orden.precioBebidas());
                    
                    Text iva = new Text("IVA (12%)");
                    Text ivaValor = new Text("$" + orden.costeTotal() * 0.12);
                    
                    Text total = new Text("Total");
                    Text totalValor = new Text("$" + orden.costeTotal() * 1.12);
                    
                    GridPane grid2 = new GridPane();
                    grid2.setPadding(new Insets(10, 10, 10, 10));
                    grid2.setVgap(4);
                    grid2.setHgap(4);
                    grid2.setAlignment(Pos.CENTER);
                    grid2.setMinSize(333, 333);
                    grid2.add(tipoOrden, 0, 0);
                    grid2.add(valorTipo, 1, 0);
                    grid2.add(numBebidasOrden, 0, 1);
                    grid2.add(numBebidasValor, 1, 1);
                    grid2.add(iva, 0, 2);
                    grid2.add(ivaValor, 1, 2);
                    grid2.add(total, 0, 3);
                    grid2.add(totalValor, 1, 3);
                    Scene scene2 = new Scene(grid2);
                    primaryStage.setScene(scene2);
                    
                } else {
                    
                }
            }
        });

        grid.add(btn, 4, 4);

        Scene scene = new Scene(grid);

        primaryStage.setTitle("Pizzeria");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
