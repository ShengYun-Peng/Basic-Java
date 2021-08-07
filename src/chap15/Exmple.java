package chap15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Exmple extends Application {
    @Override
    public void start(Stage primaryStage) {
        // create pane
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);

        // create buttons
        Button btOK = new Button("OK");
        Button btCancel = new Button("Cancel");

        // connect actions
        OKHandlerClass handler1 = new OKHandlerClass();
        btOK.setOnAction(handler1);
        CancelHandlerClass handler2 = new CancelHandlerClass();
        btCancel.setOnAction(handler2);

        // add buttons
        pane.getChildren().addAll(btOK, btCancel);

        // create scene
        Scene scene = new Scene(pane, 200, 150, Color.YELLOW);
        primaryStage.setTitle("Message");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

class OKHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        System.out.println("OK button clicked!");
    }
}

class CancelHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        System.out.println("Cancel button clicked!");
    }
}
