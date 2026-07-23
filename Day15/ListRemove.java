package Day15;

import java.util.ArrayList;

public class ListRemove {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        list.remove("Python");

        System.out.println(list);
    }
}