package Day16;
import java.util.List;
public class storeeven {
    public static void main(String[] args) {
        List <Integer> l = List.of(1,8,6,9,4,5,3);
         l.stream()
                 .filter(n->n%2==0)
                 .forEach(System.out::println);
                 
    }
}
