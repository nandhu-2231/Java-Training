package Day6;

public class Problem15 {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Problem15 obj = new Problem15();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
    }
}

