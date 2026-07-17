package Day10;
interface Printer {
    void print();
}

class InkjetPrinter implements Printer {
    public void print() {
        System.out.println("Printing using Inkjet Printer.");
    }
}

class LaserPrinter implements Printer {
    public void print() {
        System.out.println("Printing using Laser Printer.");
    }
}

class Computer {
    Printer printer;

    Computer(Printer printer) {
        this.printer = printer;
    }

    void startPrinting() {
        printer.print();
    }
}

public class Problem12 {
    public static void main(String[] args) {

        Printer p1 = new InkjetPrinter();
        Computer c1 = new Computer(p1);
        c1.startPrinting();

        Printer p2 = new LaserPrinter();
        Computer c2 = new Computer(p2);
        c2.startPrinting();
    }
}