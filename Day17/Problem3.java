package Day17;

interface Print {
    void show();
}

class Demo {
    static void message() {
        System.out.println("Static Method Called");
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Print p = Demo::message;
        p.show();
    }
}