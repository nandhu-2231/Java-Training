package Day17;

interface Message {
    void display();
}

public class Problem1 {
    public static void main(String[] args) {
        Message m = () -> System.out.println("Hello using Lambda");
        m.display();
    }
}