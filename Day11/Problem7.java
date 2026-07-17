package Day11;

interface Printer {
    void print();
}

class InkjetPrinter implements Printer {
    public void print() {
        System.out.println("Printing using Inkjet Printer");
    }
}

public class Problem7 {
    public static void main(String[] args) {
        Printer p = new InkjetPrinter();
        p.print();
    }
}