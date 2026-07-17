package Day17;
interface Square {
    int find(int n);
}

class Demo {
    int square(int n) {
        return n * n;
    }
}

public class Problem8 {
    public static void main(String[] args) {

        Demo d = new Demo();

        Square s = n -> d.square(n);

        System.out.println(s.find(5));
    }
}
