package Day21;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] arr = {15, 10, 5, 20, 25};
        java.util.Arrays.sort(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}