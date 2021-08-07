package chap15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class ControlCircle extends Application {
    @Override
    public void start(Stage primaryStage) {
        // create pane
        StackPane pane = new StackPane();
        HBox hbox = new HBox(10);
        BorderPane borderPane = new BorderPane();

        // create circle and button
        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.GREEN);
        pane.getChildren().add(circle);

        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hbox.getChildren().addAll(btEnlarge, btShrink);
        hbox.setAlignment(Pos.CENTER);

        borderPane.setCenter(pane);
        borderPane.setBottom(hbox);
        BorderPane.setAlignment(hbox, Pos.CENTER);

        // create scene
        Scene scene = new Scene(borderPane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
