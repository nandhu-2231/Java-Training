package Day17;

interface Print {
    void show();
}

class Demo {
    void message() {
        System.out.println("Instance Method Called");
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Demo d = new Demo();
        Print p = d::message;
        p.show();
    }
}