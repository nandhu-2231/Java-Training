package Day16;
import java.util.*;

public class Problem6 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 50, 30, 90, 40);

        int min = numbers.stream()
                         .min(Integer::compare)
                         .get();

        System.out.println("Minimum = " + min);
    }
}
