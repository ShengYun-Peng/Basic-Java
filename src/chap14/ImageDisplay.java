package chap14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ImageDisplay extends Application {
    @Override
    public void start(Stage primaryStage) {
        // create new pane
        Pane pane = new HBox(10);

        // load image
        Image image = new Image("./chap14/1.gif");
        // create imageview
        ImageView imageView1 = new ImageView(image);
        ImageView imageView2 = new ImageView(image);
        ImageView imageView3 = new ImageView(image);

        pane.getChildren().add(imageView1);

        imageView2.setFitHeight(50);
        imageView2.setFitWidth(50);
        pane.getChildren().add(imageView2);

        imageView3.setRotate(90);
        imageView3.setFitHeight(50);
        imageView3.setFitWidth(50);
        pane.getChildren().add(imageView3);

        Scene scene = new Scene(pane, 1000, 700);
        primaryStage.setScene(scene);
        primaryStage.setTitle("new title");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
