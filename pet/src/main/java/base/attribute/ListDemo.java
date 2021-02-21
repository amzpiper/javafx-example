package base.attribute;

import javafx.collections.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListDemo {
    public static void main(String[] args) {
        //List
        List<String> list = new ArrayList<String>();
        ObservableList<String> observableList = FXCollections.observableList(list);
        observableList.addListener(new ListChangeListener<String>() {
            @Override
            public void onChanged(Change<? extends String> change) {
                System.out.println("有更改");
                while (change.next()) {
                    System.out.println("Was added? " + change.wasAdded());
                    System.out.println("Was removed? " + change.wasRemoved());
                    System.out.println("Was replaced? " + change.wasReplaced());
                    System.out.println("Was permutated? " + change.wasPermutated());
                }
            }
        });
        //有更改通知
        observableList.add("item one");
        System.out.println(observableList.size());
        //没有更改通知
        list.add("item two");
        System.out.println(list.size());

        //Map
        Map<String, String> map = new HashMap<String, String>();
        ObservableMap<String, String> observableMap = FXCollections.observableMap(map);
        observableMap.addListener((MapChangeListener) change -> System.out.println("change!"));
        observableMap.put("1", "1");

    }
}
