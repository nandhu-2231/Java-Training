package Day8;

public class Problem13 {
    String brand;
    int price;

    Problem13() {
        this("Samsung", 20000);
        System.out.println("Default Constructor");
    }

    Problem13(String brand, int price) {
        this.brand = brand;
        this.price = price;
        System.out.println("Parameterized Constructor");
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Problem13 m = new Problem13();
        m.display();
    }
}
    

