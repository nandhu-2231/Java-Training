package Day6;

public class Problem10 {
    void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        Problem10 obj = new Problem10();
        obj.swap(10, 20);
    }

}
