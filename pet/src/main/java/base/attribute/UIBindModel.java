package base.attribute;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * UI控件和域模型之间的绑定
 */
public class UIBindModel extends Application {

    private final static String MY_PASS = "123";// 初始密码
    private final static BooleanProperty accessGranted = new SimpleBooleanProperty(false);


    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 300);

        User user = new User();
        Text userName = new Text();
        userName.textProperty().bind(user.userNameProperty());//username双向绑定

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("password");
        user.passwordProperty().bind(passwordField.textProperty());//password双向绑定

        //password回车事件
        passwordField.setOnAction(actionEvent -> {
            if (accessGranted.get()){
                System.out.println("username:" + user.getUsername());
                System.out.println("password:" + user.getPassword());
                //退出
                Platform.exit();
            }else{
                System.out.println("no access");
            }
        });

        //添加属性监听器
        passwordField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                boolean granted = passwordField.getText().equals(MY_PASS);
                accessGranted.set(granted);
                if (granted) {
                    primaryStage.setTitle("success");
                }
            }
        });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(userName, passwordField);
        vBox.setLayoutX(12);
        vBox.setLayoutY(12);

        root.getChildren().add(vBox);
        scene.setRoot(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("双向绑定");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
