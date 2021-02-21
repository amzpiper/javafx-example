package base.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * BorderPane布局顶部，底部，左，右或中心区域中的子节点。
 * 放置在顶部，底部，左侧，右侧和中心区域中的节点的默认对齐方式如下：
 * 顶部: Pos.TOP_LEFT
 * 底部: Pos.BOTTOM_LEFT
 * 左侧: Pos.TOP_LEFT
 * 右侧: Pos.TOP_RIGHT
 * 中心: Pos.CENTER
 */
public class BorderPaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("BorderPane Test");
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(10, 20, 10, 20));

        Button btnTop = new Button("Top");
        bp.setTop(btnTop);

        Button btnLeft = new Button("Left");
        bp.setLeft(btnLeft);

        Button btnCenter = new Button("Center");
        bp.setCenter(btnCenter);

        Button btnRight = new Button("Right");
        bp.setRight(btnRight);

        Button btnBottom = new Button("Bottom");
        bp.setBottom(btnBottom);

        Scene scene = new Scene(bp, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
