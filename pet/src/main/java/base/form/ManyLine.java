package base.form;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.stage.Stage;

/**
 * 多个自定义线条
 */
public class ManyLine extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group box = new Group();
        Scene scene = new Scene(box, 300, 250, Color.GRAY);

        Line redLine = new Line(10,10,200,10);
        //线条颜色
        redLine.setStroke(Color.RED);
        //线条宽
        redLine.setStrokeWidth(10);
        //线条端点样式
        redLine.setStrokeLineCap(StrokeLineCap.BUTT);
        //线条
        redLine.getStrokeDashArray().addAll(1d,5d,10d,15d,20d);
        //redLine.getStrokeDashArray().addAll(15d, 5d, 15d, 15d, 20d);
        //线条
        redLine.setStrokeDashOffset(1);

        box.getChildren().add(redLine);

        primaryStage.setScene(scene);
        primaryStage.setTitle("线条");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
