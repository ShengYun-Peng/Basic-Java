package chap14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCenterCircle extends Application {
    @Override
    public void start(Stage primaryStage) {
        // create a pane
        Pane pane = new Pane();

        // create a circle
        Circle circle = new Circle();
        circle.setRadius(50);
        // use CSS style
        circle.setStyle("-fx-stroke: black; -fx-fill: green");
//        circle.setStroke(Color.BLACK);
//        circle.setFill(Color.GREEN);

        // bind circle center
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        // put circle in pane
        pane.getChildren().add(circle);
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("demo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
