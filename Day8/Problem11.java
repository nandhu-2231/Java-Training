package Day8;

public class Problem11 {
    String brand;

    Problem11(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Car Brand: " + brand);
    }

    public static void main(String[] args) {

        Problem11 c1 = new Problem11("Honda");
        Problem11 c2 = new Problem11("Hyundai");
        Problem11 c3 = new Problem11("Toyota");

        c1.display();
        c2.display();
        c3.display();
    }
}

