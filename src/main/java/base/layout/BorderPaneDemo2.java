package base.layout;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
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
public class BorderPaneDemo2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("BorderPane Test");
        Group group = new Group();
        Scene scene = new Scene(group, 300, 200);

        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Direction");
        EventHandler<ActionEvent> action = changeTabPlacement();
        MenuItem left = new MenuItem("Left");
        left.setOnAction(action);
        menu.getItems().add(left);
        MenuItem right = new MenuItem("Right");
        right.setOnAction(action);
        menu.getItems().add(right);
        MenuItem top = new MenuItem("Top");
        top.setOnAction(action);
        menu.getItems().add(top);
        MenuItem bottom = new MenuItem("Bottom");
        bottom.setOnAction(action);
        menu.getItems().add(bottom);
        menuBar.getMenus().add(menu);

        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(0, 0, 10, 0));
        //绑定宽高域scene一样
        borderPane.prefHeightProperty().bind(scene.heightProperty());
        borderPane.prefWidthProperty().bind(scene.widthProperty());
        borderPane.setTop(menuBar);

        group.getChildren().add(borderPane);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private EventHandler<ActionEvent> changeTabPlacement() {
        return new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                MenuItem mItem = (MenuItem) event.getSource();
                String side = mItem.getText();
                if ("left".equalsIgnoreCase(side)) {
                    System.out.println("left");
                } else if ("right".equalsIgnoreCase(side)) {
                    System.out.println("right");
                } else if ("top".equalsIgnoreCase(side)) {
                    System.out.println("top");
                } else if ("bottom".equalsIgnoreCase(side)) {
                    System.out.println("bottom");
                }
            }
        };
    }

}
