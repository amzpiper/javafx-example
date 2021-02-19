package attribute;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        ObservableList<String> observableList = FXCollections.observableList(list);

        observableList.addListener(new ListChangeListener<String>() {
            @Override
            public void onChanged(Change<? extends String> c) {
                System.out.println("有更改");
            }
        });

        //有更改通知
        observableList.add("item one");
        System.out.println(observableList.size());

        //没有更改通知
        list.add("item two");
        System.out.println(list.size());
    }
}
