package Day16;
import java.util.*;

public class Problem5 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 50, 30, 90, 40);

        int max = numbers.stream()
                         .max(Integer::compare)
                         .get();

        System.out.println("Maximum = " + max);
    }
}
