package Day11;
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Demo implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.print();
        d.show();
    }
}
