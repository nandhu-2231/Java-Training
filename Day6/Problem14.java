package Day6;

public class Problem14 {
    void table(int n) {
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }

    public static void main(String[] args) {
        Problem14 obj = new Problem14();
        obj.table(7);
    }
}

