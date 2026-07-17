package Day18;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        list.stream()
            .filter(n -> n > 20)
            .forEach(System.out::println);
    }
}