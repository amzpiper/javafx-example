package base.form;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 * 曲线
 */
public class quxian extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.WHITE);

        Path path = new Path();

        MoveTo moveTo = new MoveTo();
        moveTo.setX(0.0f);
        moveTo.setY(50.0f);

        QuadCurveTo quadCurve = new QuadCurveTo();
        quadCurve.setControlX(250.0f);
        quadCurve.setControlY(0.0f);
        quadCurve.setX(250.0f);
        quadCurve.setY(250.0f);

        CubicCurveTo cubicCurve = new CubicCurveTo();
        cubicCurve.setControlX1(0.0f);
        cubicCurve.setControlY1(0.0f);
        cubicCurve.setControlX2(100.0f);
        cubicCurve.setControlY2(100.0f);
        cubicCurve.setX(100.0f);
        cubicCurve.setY(50.0f);

        path.getElements().add(moveTo);
        path.getElements().add(quadCurve);
        path.getElements().add(cubicCurve);
        path.getElements().add(new MoveTo(200.0f, 10.0f));
        path.getElements().add(new VLineTo(300.0f));

        //减去2个形状创建路径
        Ellipse bigCircle = new Ellipse(100, 100, 50, 35.5);
        bigCircle.setStrokeWidth(3);
        bigCircle.setStroke(Color.BLACK);
        bigCircle.setFill(Color.WHITE);

        Ellipse smallCircle = new Ellipse(100, 100, (35.0f/2), (25.0f/2));
        smallCircle.setStrokeWidth(3);
        smallCircle.setStroke(Color.BLACK);
        smallCircle.setFill(Color.WHITE);

        Shape shape = Path.subtract(bigCircle, smallCircle);
        shape.setStrokeWidth(1);
        shape.setStroke(Color.BLACK);
        shape.setFill(Color.rgb(255, 200, 0));

        root.getChildren().add(path);
        root.getChildren().add(shape);
        scene.setRoot(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("矩形");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
