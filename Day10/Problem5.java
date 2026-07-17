package Day10;

public class Problem5 {

    static int largest(int... numbers) {

        int max = numbers[0];

        for (int num : numbers) {
            if (num > max)
                max = num;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("Largest = " + largest(10, 25, 15, 8, 50, 32));
    }
}
