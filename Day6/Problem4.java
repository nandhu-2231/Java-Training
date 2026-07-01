package Day6;

public class Problem4 {
    int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Problem4 obj = new Problem4();
        System.out.println(obj.max(15, 30));
    }
}
    

