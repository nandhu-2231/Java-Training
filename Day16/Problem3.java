package Day16;
import java.util.*;

public class Problem3 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);

        numbers.stream()
               .map(n -> n * n)
               .forEach(System.out::println);
    }
}
