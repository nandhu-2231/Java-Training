package Day6;

public class Problem8 {
    boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Problem8 obj = new Problem8();
        System.out.println(obj.isPrime(13));
    }
}

