package Day16;

import java.util.*;

public class Problem9 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(50, 20, 80, 10, 40);

        numbers.stream()
               .sorted()
               .forEach(System.out::println);
    }
}