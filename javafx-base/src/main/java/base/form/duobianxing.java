package base.form;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.QuadCurve;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 多边形
 */
public class duobianxing extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 480);

        //
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
                0.0, 0.0,
                20.0, 10.0,
                0.0, 20.0
        });

        //
        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(30.0, 0.0, 40.0, 10.0, 30.0, 20.0);

        CubicCurve cubicCurve = new CubicCurve();
        cubicCurve.setStartX(0.0f);
        cubicCurve.setStartY(50.0f);
        cubicCurve.setControlX1(25.0f);
        cubicCurve.setControlY1(0.0f);
        cubicCurve.setControlX2(75.0f);
        cubicCurve.setControlY2(120.0f);
        cubicCurve.setEndX(100.0f);
        cubicCurve.setEndY(50.0f);

        QuadCurve quad = new QuadCurve();
        quad.setStartX(250.0f);
        quad.setStartY(300.0f);
        quad.setEndX(300.0f);
        quad.setEndY(300.0f);
        quad.setControlX(275.0f);
        quad.setControlY(100.0f);

        Text text = new Text(100, 100, "JavaFX 2.0\nJavaFX 2.0");
        text.setFill(Color.rgb(30,40,50,0.99));
        text.setRotate(45);
        text.setFont(Font.font(java.awt.Font.SERIF, FontWeight.BOLD, 32));
        text.setEffect(new DropShadow(13.0, Color.BLACK));
        //映射
        Reflection reflection = new Reflection();
        reflection.setFraction(0.7);
        text.setEffect(reflection);
        //换行宽度
        text.setWrappingWidth(100);

        root.getChildren().add(polygon);
        root.getChildren().add(polyline);
        root.getChildren().add(cubicCurve);
        root.getChildren().add(quad);
        root.getChildren().add(text);
        scene.setRoot(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("矩形");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
