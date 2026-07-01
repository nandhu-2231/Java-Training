package Day7;

public class Problem6 {

    void start() {
        System.out.println("Car Started");
    }
    public static void main(String[] args) {
        Problem6 p1;
        Problem6 p2 = null;
        System.out.println(p2);
        Problem6 p3 = new Problem6();
        p3.start();
    }
}

