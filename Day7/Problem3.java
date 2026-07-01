package Day7;

public class Problem3 {
    String brand;
    int ram;

    Problem3(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
    }

    public static void main(String[] args) {
        Problem3 l1 = new Problem3("Dell", 16);
        l1.display();
    }
}
    

