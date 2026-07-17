package Day10;
public class Problem11 {

    static int sum(int... numbers) {

        int total = 0;

        for (int n : numbers) {
            total += n;
        }

        return total;
    }

    public static void main(String[] args) {

        System.out.println("Sum = " + sum(10, 20, 30, 40, 50));
    }
}
