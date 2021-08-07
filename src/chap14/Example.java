package chap14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Example extends Application {
    @Override
    public void start (Stage primaryStage) {
        StackPane pane = new StackPane();
        Button btOK = new Button("OK");
        pane.getChildren().add(btOK);
//        pane.getChildren().add(new Button("not OK"));
        Scene scene = new Scene(pane, 200, 300);
        primaryStage.setTitle("JavaFX example");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage = new Stage();
        stage.setScene(new Scene(new Button("fine"), 200, 300));
        stage.setTitle("second screen");
        stage.setResizable(false);
        stage.show();
    }

    public static void main (String[] args) {
        Application.launch();
    }
}
