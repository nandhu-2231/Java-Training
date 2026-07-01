package Day6;

public class Problem11 {
    int sumArray(int arr[]) {
        int sum = 0;
        for (int num : arr)
            sum += num;
        return sum;
    }

    public static void main(String[] args) {
        Problem11 obj = new Problem11();
        int a[] = {1, 2, 3, 4, 5};
        System.out.println(obj.sumArray(a));
    }
}
