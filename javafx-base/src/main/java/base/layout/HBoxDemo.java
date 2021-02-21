package base.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * HBox布局类将JavaFX子节点放在水平行中。 新的子节点附加到右侧的末尾
 */
public class HBoxDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        //间隔
        HBox hBox = new HBox(8);
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(20));

        /*
        TextField textField = new TextField();
        hBox.getChildren().add(textField);
        //将TextField控件设置为在调整父HBox的宽度时水平增长
        HBox.setHgrow(textField, Priority.ALWAYS);
         */

        /*
        Rectangle r1 = new Rectangle(10, 10);
        Rectangle r2 = new Rectangle(20, 100);
        Rectangle r3 = new Rectangle(50, 20);
        Rectangle r4 = new Rectangle(20, 50);
        HBox.setMargin(r1,new Insets(5,5,5,5));
        hBox.setBackground(Background.EMPTY);
        hBox.getChildren().addAll(r1, r2, r3, r4);
         */

        Button button1 = new Button("Add   ");
        Button button2 = new Button("Remove");
        Button button3 = new Button("Add   ");
        Button button4 = new Button("Remove");
        HBox.setHgrow(button1, Priority.ALWAYS);
        HBox.setHgrow(button2, Priority.ALWAYS);
        HBox.setHgrow(button3, Priority.ALWAYS);
        HBox.setHgrow(button4, Priority.ALWAYS);
        button1.setMaxWidth(Double.MAX_VALUE);
        button2.setMaxWidth(Double.MAX_VALUE);
        button3.setMaxWidth(Double.MAX_VALUE);
        button4.setMaxWidth(Double.MAX_VALUE);
        hBox.getChildren().addAll(button1, button2,button3,button4);
        hBox.setPrefHeight(400);

        root.getChildren().add(hBox);
        Scene scene = new Scene(root, 400, 250, Color.GRAY);
        primaryStage.setScene(scene);
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(400);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
