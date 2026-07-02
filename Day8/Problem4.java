package Day8;

public class Problem4 {

    Problem4() {
        this(100);
        System.out.println("Default Constructor");
    }

    Problem4(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        new Problem4();
    }
}

