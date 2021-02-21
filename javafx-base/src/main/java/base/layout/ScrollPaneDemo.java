package base.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * 滚动窗口提供UI元素的可滚动视图。
 */
public class ScrollPaneDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setWidth(500);
        stage.setHeight(500);
        VBox root = new VBox();

        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setPannable(true);
        scrollPane.setPrefSize(120, 120);
        //水平
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        //垂直
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane.setContent(browser);

        webEngine.loadContent("<b>yes? this is default content load.</b>");
        root.getChildren().addAll(scrollPane);

        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
