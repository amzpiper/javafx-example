package base.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
//        纯代码编写
//        BorderPane root = new BorderPane();
//        Scene scene = new Scene(root, 400, 400);
//        scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("Hello World");
//        primaryStage.show();

//        FXML编写
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
