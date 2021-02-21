package base.form;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 矩形
 */
public class Juxing extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group box = new Group();
        Scene scene = new Scene(box, 500, 500, Color.GRAY);

        Rectangle r = new Rectangle(20,20,200,200);
        r.setX(200d);
        r.setY(200d);
        r.setWidth(200);
        r.setHeight(100);
        //圆角矩形
        r.setArcWidth(15);
        r.setArcHeight(15);
        box.getChildren().add(r);

        //椭圆
        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(50.0f);
        ellipse.setCenterY(50.0f);
        ellipse.setRadiusX(50.0f);
        ellipse.setRadiusY(25.0f);
        box.getChildren().add(ellipse);

        primaryStage.setScene(scene);
        primaryStage.setTitle("矩形");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
