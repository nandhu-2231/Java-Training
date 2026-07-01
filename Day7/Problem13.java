package Day7;

public class Problem13 {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Bike extends Problem13 {
    @Override
    void start() {
        System.out.println("Bike starts with a self-start button.");
    }

    void ride() {
        System.out.println("Bike is riding.");
    }
}
class UpcastingExample {
    public static void main(String[] args) {
        Problem13 v = new Bike();
        v.start();

        
    }
}

