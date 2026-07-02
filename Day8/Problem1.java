package Day8;

public class Problem1 {
    

    String brand;
    int ram;

    Problem1(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
    }

    public static void main(String[] args) {
        Problem1 l = new Problem1("Dell", 16);
        l.display();
    }

}
