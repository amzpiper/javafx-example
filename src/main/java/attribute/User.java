package attribute;

import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class User {
    private final static String USERNAME_PROP_NAME = "username";
    private final ReadOnlyStringWrapper username;
    private final static String PASSWORD_PROP_NAME = "password";
    private StringProperty password;

    public User() {
        username = new ReadOnlyStringWrapper(this, USERNAME_PROP_NAME, "fake user");
        password = new SimpleStringProperty(this, PASSWORD_PROP_NAME, "");
    }

    public final String getUsername() {
        return username.get();
    }

    public ReadOnlyStringProperty userNameProperty() {
        return username.getReadOnlyProperty();
    }

    public final String getPassword() {
       return password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public StringProperty passwordProperty() {
        return password;
    }
}
