package Day7;

public class Problem8 {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Problem8 c = new Problem8();

        System.out.println("Addition = " + c.add(20, 10));
        System.out.println("Subtraction = " + c.subtract(20, 10));

        System.out.println("Multiplication = " + Problem8.multiply(20, 10));
        System.out.println("Division = " + Problem8.divide(20, 10));
    }
}

