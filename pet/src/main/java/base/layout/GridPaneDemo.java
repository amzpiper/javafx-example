package base.layout;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 通常用于布局：第一列上的只读标签的输入表单和第二列上的输入字段。
 */
public class GridPaneDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 380, 200, Color.WHITE);

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(25));
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(5);

//        ColumnConstraints constraints1 = new ColumnConstraints(50,80,100);
//        ColumnConstraints constraints2 = new ColumnConstraints(50, 150, 300);
//        ColumnConstraints constraints3 = new ColumnConstraints(50, 150, 300);
//        constraints2.setHgrow(Priority.ALWAYS);
//        gridPane.getColumnConstraints().addAll(constraints1, constraints2,constraints3);

        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        gridPane.add(scenetitle, 0, 0, 2, 1);

        Label firstNameLabel = new Label("First Name");
        TextField firstNameField = new TextField();
        Label lastNameLabel = new Label("Last Name");
        TextField lastNameField = new TextField();
        Button submit = new Button("submit");

        GridPane.setHalignment(firstNameLabel, HPos.RIGHT);
        gridPane.add(firstNameLabel, 0, 1);
        GridPane.setHalignment(lastNameLabel, HPos.RIGHT);
        gridPane.add(lastNameLabel, 0, 2);
        GridPane.setHalignment(firstNameField, HPos.RIGHT);
        gridPane.add(firstNameField, 1, 1);
        GridPane.setHalignment(lastNameField, HPos.RIGHT);
        gridPane.add(lastNameField, 1, 2);
        GridPane.setHalignment(submit, HPos.RIGHT);
        gridPane.add(submit, 1, 3);

        borderPane.setCenter(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
