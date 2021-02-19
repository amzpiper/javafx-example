package base.form;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 * 路径
 */
public class lujing extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(new Group(),300,200);

        HBox root = new HBox();
        VBox vBox = new VBox();

        Path path = new Path();
        path.getElements().add(new MoveTo(0.0f, 50.0f));
        path.getElements().add(new LineTo(100.0f, 100.0f));

        vBox.getChildren().addAll(path);
        vBox.setSpacing(5);

        root.getChildren().add(vBox);
        root.setSpacing(40);
        root.setPadding(new Insets((20), 10, 10, 20));

        ((Group) scene.getRoot()).getChildren().add(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("路径");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
