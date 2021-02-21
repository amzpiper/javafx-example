package base.layout;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TitledPaneDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group(), 350, 250);
        HBox hbox = new HBox(10);
        hbox.setPadding(new Insets(20, 0, 0, 20));

        //标题窗口
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(10, 20, 10, 20));
        CheckBox checkBox = new CheckBox("OK");
        bp.setTop(checkBox);
        Button ok = new Button("ok");
        Button cancel = new Button("cancel");
        bp.setLeft(ok);
        bp.setRight(cancel);
        TitledPane titledPane = new TitledPane("标题窗口", bp);
        //关闭标题窗口合拢按钮和动画
        titledPane.setCollapsible(false);
        titledPane.setAnimated(false);

        //手风琴菜单分组
        TitledPane t1 = new TitledPane("T1", new Button("B1"));
        TitledPane t2 = new TitledPane("T2", new Button("B2"));
        TitledPane t3 = new TitledPane("T3", new Button("B3"));
        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(t1, t2, t3);
        accordion.expandedPaneProperty()
                .addListener((ObservableValue<? extends TitledPane> observableValue, TitledPane old_val, TitledPane new_val) -> {
                    if (new_val != null) {
                        System.out.println(accordion.getExpandedPane().getText());
                    }
                });



        hbox.getChildren().setAll(titledPane,accordion);
        Group root = (Group) scene.getRoot();
        root.getChildren().add(hbox);
        stage.setScene(scene);
        stage.show();
    }
}
