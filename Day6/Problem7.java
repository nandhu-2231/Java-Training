package Day6;

public class Problem7 {
    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Problem7 obj = new Problem7();
        System.out.println(obj.factorial(5));
    }
} 
