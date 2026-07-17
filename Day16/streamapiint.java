package Day16;
import java.util.List;
public class streamapiint {
     public static void main(String[] args) {
        
     
    
    List <Integer> l = List.of(1,2,2,3,4,4,5);
    l.stream()
     .distinct()
     .forEach(System.out::println);
    }
}
