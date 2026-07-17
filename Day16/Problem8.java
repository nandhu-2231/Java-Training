package Day16;
import java.util.*;

public class Problem8 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 25, 30, 15, 50);

        long count = numbers.stream()
                            .filter(n -> n > 20)
                            .count();

        System.out.println("Count = " + count);
    }
}
