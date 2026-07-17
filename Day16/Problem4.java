package Day16;

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("rahul", "anita", "vijay");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}