package Day16;
import java.util.List;
public class print {
    public static void main(String[] args) {
        
        List<String> name = List.of("hi","hello");
        name.stream()
        .forEach(System.out::println);
    }
    
    
}
