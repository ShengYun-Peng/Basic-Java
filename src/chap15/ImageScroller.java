package chap15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImageScroller extends Application {
    private int idx;
    private final int count = 5;

    public void start(Stage primaryStage) {
        String[] weaponList = {"fork", "slingshot", "grenade", "gun", "rocket launcher"};
        Image[] imageList = { new Image("./chap15/images/fork.jpeg"),
                new Image("./chap15/images/slingshot.jpeg"),
                new Image("./chap15/images/grenade.jpeg"),
                new Image("./chap15/images/gun.png"),
                new Image("./chap15/images/rocket-launcher.jpeg")
        };

        // create pane
        StackPane stackPane = new StackPane();

        idx = 0;

        ImageView imageView = new ImageView(imageList[idx]);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);
        stackPane.getChildren().add(imageView);

        imageView.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN: {
                    idx = (++idx) >= count ? idx % count : idx;
                    imageView.setImage(imageList[idx]);
                } break;
                case UP: {
                    idx = (--idx) < 0 ? idx + count : idx;
                    imageView.setImage(imageList[idx]);
                } break;
            }
        });

        // create scene
        Scene scene = new Scene(stackPane, 650, 650);
        primaryStage.setScene(scene);
        primaryStage.show();


        imageView.requestFocus();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
