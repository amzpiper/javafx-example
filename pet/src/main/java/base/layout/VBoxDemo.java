package base.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * VBox布局将子节点堆叠在垂直列中。新添加的子节点被放置在上一个子节点的下面。
 */
public class VBoxDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("");

        TextArea myTextArea = new TextArea();
        VBox vBox = new VBox();
        vBox.getChildren().add(myTextArea);
        //将TextArea控件设置为在调整父VBox的高度时垂直增长
        VBox.setVgrow(myTextArea, Priority.ALWAYS);

        Scene scene = new Scene(vBox, 320, 112, Color.rgb(0, 0, 0, 0));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
