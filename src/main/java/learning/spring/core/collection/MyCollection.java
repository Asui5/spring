package learning.spring.core.collection;

import java.util.*;

public class MyCollection {

    public void array() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(i);
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public void set(){
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            set.add(String.valueOf(i));
            set.add(String.valueOf(i));
        }

        for (String value : set) {
            System.out.println(value);
        }
    }

    public void map(){
        Map<String, String> map = new HashMap<>();
        map.put("Масив", "Array");
        map.put("Мова", "Language");
        map.put("Черга", "Queue");
        map.put("Список", "List");

        String queue = map.get("Черга");
        System.out.println(queue);
    }

    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        myCollection.array();
        myCollection.set();
        myCollection.map();
    }
}
