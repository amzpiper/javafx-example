package base.form;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 * 圆弧,单点
 */
public class yuanhu extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.web("0x0000FF",1.0));

        Arc arc = new Arc();
        arc.setCenterX(50);
        arc.setCenterY(50);
        arc.setRadiusX(25);
        arc.setRadiusY(25);
        arc.setStartAngle(45.0f);
        arc.setLength(270.0f);
        arc.setType(ArcType.ROUND);

        Circle circle = new Circle();
        circle.setCenterX(150);
        circle.setCenterY(150);
        circle.setRadius(50.0f);

        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetY(4.0f);

        Circle circle1 = new Circle(250, 250, 50);
        circle1.setEffect(dropShadow);

        root.getChildren().add(arc);
        root.getChildren().add(circle);
        root.getChildren().add(circle1);

        primaryStage.setScene(scene);
        primaryStage.setTitle("矩形");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
