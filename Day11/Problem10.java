package Day11;

interface Calculator {
    int add(int a, int b);
}

class SimpleCalculator implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class Problem10 {
    public static void main(String[] args) {
        Calculator c = new SimpleCalculator();
        System.out.println("Sum = " + c.add(10, 20));
    }
}