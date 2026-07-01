package Day6;

public class Problem9 {
    int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
       Problem9 obj = new Problem9();
        System.out.println(obj.reverse(1234));
    }
}
    

