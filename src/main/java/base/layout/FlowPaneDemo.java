package base.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane root = new FlowPane();
        root.setHgap(10);
        root.setVgap(20);

        Button button = new Button("button");
        button.setPrefSize(150,100);
        root.getChildren().add(button);

        TextField textField = new TextField("test");
        root.getChildren().add(textField);

        CheckBox checkBox = new CheckBox("Check Box");
        root.getChildren().add(checkBox);

        Scene scene = new Scene(root, 550, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FlowPane");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
