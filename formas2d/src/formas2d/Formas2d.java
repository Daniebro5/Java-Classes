/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas2d;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author dannibrito
 */
public class Formas2d extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Line(Xo, Yo, X, Y);
        Line line = new Line(50, 50, 100, 100);
        Line line2 = new Line(50, 50, 150, 50);
        Line line3 = new Line(100, 100, 150, 50);
        Group root = new Group(line);
        ObservableList list = root.getChildren();
        list.add(line2);
        list.add(line3);
        Scene scene = new Scene(root, 600, 300);
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
