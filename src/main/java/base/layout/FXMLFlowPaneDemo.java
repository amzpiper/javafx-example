package base.layout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXMLFlowPaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/FlowDemo.fxml"));
        System.out.println("/:"+this.getClass().getResource("/").getPath());
        System.out.println(" :"+this.getClass().getResource("").getPath());
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("FlowDemo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
