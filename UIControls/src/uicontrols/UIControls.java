/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uicontrols;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
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
        //Scene scene = new Scene(grid);
        
        
        // ejemplo 2
        //Label for name 
        Text nameLabel = new Text("Namexxx");

        //Text field for name 
        TextField nameText = new TextField();

        //Label for date of birth 
        Text dobLabel = new Text("Date of birth");

        //date picker to choose date 
        DatePicker datePicker = new DatePicker();

        //Label for gender
        Text genderLabel = new Text("gender");

        //Toggle group of radio buttons       
        ToggleGroup groupGender = new ToggleGroup();
        RadioButton maleRadio = new RadioButton("male");
        maleRadio.setToggleGroup(groupGender);
        RadioButton femaleRadio = new RadioButton("female");
        femaleRadio.setToggleGroup(groupGender);

        //Label for reservation 
        Text reservationLabel = new Text("Reservation");

        //Toggle button for reservation 
        ToggleButton yes = new ToggleButton("Yes");
        ToggleButton no = new ToggleButton("No");
        ToggleGroup groupReservation = new ToggleGroup();
        yes.setToggleGroup(groupReservation);
        no.setToggleGroup(groupReservation);

        //Label for technologies known 
        Text technologiesLabel = new Text("Technologies Known");

        //check box for education 
        CheckBox javaCheckBox = new CheckBox("Java");
        javaCheckBox.setIndeterminate(false);

        //check box for education 
        CheckBox dotnetCheckBox = new CheckBox("DotNet");
        javaCheckBox.setIndeterminate(false);

        //Label for education 
        Text educationLabel = new Text("Educational qualification");

        //list View for educational qualification 
        ObservableList<String> names = FXCollections.observableArrayList(
                "Engineering", "MCA", "MBA", "Graduation", "MTECH", "Mphil", "Phd");
        ListView<String> educationListView = new ListView<String>(names);

        //Label for location 
        Text locationLabel = new Text("location");

        //Choice box for location 
        ChoiceBox locationchoiceBox = new ChoiceBox();
        locationchoiceBox.getItems().addAll("Hyderabad", "Chennai", "Delhi", "Mumbai", "Vishakhapatnam");

        //Label for register 
        Button buttonRegister = new Button("Register");

        //Creating a Grid Pane 
        GridPane gridPane = new GridPane();

        //Setting size for the pane 
        gridPane.setMinSize(500, 500);

        //Setting the padding    
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns 
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the Grid alignment 
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid 
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameText, 1, 0);

        gridPane.add(dobLabel, 0, 1);
        gridPane.add(datePicker, 1, 1);
        
        gridPane.add(genderLabel, 0, 2);
        gridPane.add(maleRadio, 1, 2);
        gridPane.add(femaleRadio, 2, 2);
        gridPane.add(reservationLabel, 0, 3);
        gridPane.add(yes, 1, 3);
        gridPane.add(no, 2, 3);

        gridPane.add(technologiesLabel, 0, 4);
        gridPane.add(javaCheckBox, 1, 4);
        gridPane.add(dotnetCheckBox, 2, 4);

        gridPane.add(educationLabel, 0, 5);
        gridPane.add(educationListView, 1, 5);

        gridPane.add(locationLabel, 0, 6);
        gridPane.add(locationchoiceBox, 1, 6);

        gridPane.add(buttonRegister, 2, 8);

        //Styling nodes   
        buttonRegister.setStyle(
                "-fx-background-color: darkslateblue; -fx-textfill: white;");

        nameLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        dobLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        genderLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        reservationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        technologiesLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        educationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        locationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");

        //Setting the back ground color 
        gridPane.setStyle("-fx-background-color: BEIGE;");

        //Creating a scene object 
        Scene scene = new Scene(gridPane);

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
