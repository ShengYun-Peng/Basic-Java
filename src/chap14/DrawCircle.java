package chap14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DrawCircle extends Application {
    @Override
    public void start (Stage primaryStage) {
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.GREEN);

        Pane pane = new Pane();
        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 300, 350);
        primaryStage.setTitle("circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main (String[] args) {
        Application.launch();
    }
}
