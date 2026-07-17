package Day18;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 10, 15, 20);

        list.stream()
            .forEach(System.out::println);
    }
}