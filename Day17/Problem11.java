package Day17;

interface Vehicle {

    default void start() {
        System.out.println("Vehicle Started");
    }
}

class Bike implements Vehicle {
}

public class Problem11 {
    public static void main(String[] args) {

        Bike b = new Bike();
        b.start();
    }
}