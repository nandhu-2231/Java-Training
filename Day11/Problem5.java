package Day11;
interface Vehicle {
    void start();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike Started");
    }
}

public class Problem5 {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
    }
}