package base.form;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * 线条
 */
public class OneLine extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox();
        Scene scene = new Scene(box, 300, 250);
        scene.setFill(null);

        Line line = new Line();
        line.setStartX(0.0f);
        line.setStartY(0.0f);
        line.setEndX(100.0f);
        line.setEndY(100.0f);
        box.getChildren().add(line);

        primaryStage.setScene(scene);
        primaryStage.setTitle("线条");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
