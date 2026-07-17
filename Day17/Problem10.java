package Day17;

interface Multiply {
    int product(int a, int b);
}

class Demo {
    static int multiply(int a, int b) {
        return a * b;
    }
}

public class Problem10 {
    public static void main(String[] args) {

        Multiply m = Demo::multiply;

        System.out.println("Product = " + m.product(10, 5));
    }
}