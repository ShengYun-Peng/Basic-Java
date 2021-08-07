package chap15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class EnlargeShrinkCircle extends Application {
    private CirclePane circlePane = new CirclePane();

    @Override
    public void start(Stage primaryStage) {
        // create pane
        BorderPane borderPane = new BorderPane();
        StackPane pane = new StackPane();
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);

        // create circle and buttons
        Button btEnlarge = new Button("Enlarge");
        EnlargeHandler enlargeHandler = new EnlargeHandler();
        btEnlarge.setOnAction(enlargeHandler);
        Button btShrink = new Button("Shrink");
//        ShrinkHandler shrinkHandler = new ShrinkHandler();
//        btShrink.setOnAction(shrinkHandler);
        btShrink.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                circlePane.shrink();
            }
        });
        hBox.getChildren().addAll(btEnlarge, btShrink);

        // create scene
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        Scene scene = new Scene(borderPane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class EnlargeHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            circlePane.enlarge();
        }
    }

    class ShrinkHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            circlePane.shrink();
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

class CirclePane extends StackPane {
    Circle circle = new Circle(50);

    public CirclePane() {
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.GREEN);
    }

    public void enlarge() {
        circle.setRadius(circle.getRadius() + 2);
    }

    public void shrink() {
        circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2 : circle.getRadius());
    }
}
