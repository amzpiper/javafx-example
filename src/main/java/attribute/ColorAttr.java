package attribute;

import javafx.application.Application;
import javafx.beans.property.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 多边形
 */
public class ColorAttr extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 480);
        scene.setFill(null);

        //线性梯度
        //设置渐变颜色指定的每个阶段的颜色列表
        Stop[] stops = new Stop[]{new Stop(0, Color.rgb(25, 200, 0, .1)), new Stop(0.5, Color.GRAY), new Stop(1, Color.RED)};
        //坐标,坐标是否与形状成比例,渐变的循环方法,颜色列表
        LinearGradient linearGradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);

        Rectangle rectangle = new Rectangle(0, 0, 100, 100);
        rectangle.setFill(linearGradient);

        //径向渐变
        Circle ball = new Circle(120, 50, 20);
        RadialGradient radialGradient = new RadialGradient(0,0.1, 120, 50, 20, false, CycleMethod.NO_CYCLE, new Stop(0, Color.RED), new Stop(1, Color.BLACK));
        ball.setFill(radialGradient);

        //读/可写属性
        StringProperty password = new SimpleStringProperty("yiibai");
        password.set("example");

        //只读属性
        ReadOnlyStringWrapper username = new ReadOnlyStringWrapper("yiibai");
        ReadOnlyStringProperty readOnlyUserName = username.getReadOnlyProperty();


        root.getChildren().add(rectangle);
        root.getChildren().add(ball);

        scene.setRoot(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("颜色和属性");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
