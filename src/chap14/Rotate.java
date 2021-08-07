package chap14;

import com.sun.scenario.effect.impl.prism.PrImage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Rotate extends Application {
    @Override
    public void start(Stage primaryStage) {
        // create a pane
        StackPane pane = new StackPane();

        // create a button
        Button button = new Button("ok");
        button.setScaleX(2.5);
        button.setScaleY(3);
        button.setScaleZ(4);
        button.setStyle("-fx-border-color: blue;");

        // add button to the pane and rotate
        pane.getChildren().add(button);
        pane.setRotate(45);
        pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");

        // scene
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Title");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
