package Day15;

import java.util.ArrayList;

public class ListSearch {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");

        if (list.contains("Blue"))
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}