package base.attribute;


import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class UserMain{

    public static void main(String[] args) {
        SimpleIntegerProperty xProperty = new SimpleIntegerProperty();

        //创建ChangeListener来注册到属性,当属性的值发生改变时，将调用change()方法.
        xProperty.addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("old value:"+oldValue);
                System.out.println("new value:"+newValue);
            }
        });

        xProperty.addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
            System.out.println("old value:" + oldValue);
            System.out.println("new value:" + newValue);
        });

        //创建一个invalidationListener以向属性注册,随着属性的值改变，将调用invalidated()方法.
        xProperty.addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println(observable.toString());
            }
        });
        xProperty.addListener((Observable observable) -> {
            System.out.println(observable.toString());
        });
    }
}
