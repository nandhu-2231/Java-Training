package Day9;

class CPU {
    String brand;

    CPU(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("CPU Brand: " + brand);
    }
}

class Computer {
    String model;
    CPU cpu;

    Computer(String model, String cpuBrand) {
        this.model = model;
        cpu = new CPU(cpuBrand);
    }

    void display() {
        System.out.println("Computer Model: " + model);
        cpu.display();
    }
}

public class Problem3 {
    public static void main(String[] args) {

        Computer c = new Computer("Dell", "Intel i7");
        c.display();
    }
}