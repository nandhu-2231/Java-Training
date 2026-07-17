package Day17;
import java.util.*;

public class Problem7 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("java", "python", "c++");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}