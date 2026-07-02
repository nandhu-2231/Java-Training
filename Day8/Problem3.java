package Day8;

public class Problem3 {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Bike extends Problem3 {
    void ride() {
        System.out.println("Bike is running...");
    }
}
 class Test {
    public static void main(String[] args) {

        Bike b = new Bike();

        b.start();
        b.ride();
    }
}

