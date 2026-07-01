package Day6;

public class Problem5 {
    int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static void main(String[] args) {
        Problem5 obj = new Problem5();
        System.out.println(obj.min(8, 3));
    }

}
