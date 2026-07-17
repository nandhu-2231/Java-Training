package Day21;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr = {50, 23, 9, 18, 61, 32};

        java.util.Arrays.sort(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}