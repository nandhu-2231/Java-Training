package Day11;
interface Remote {
    void on();
    void off();
}

class TV implements Remote {
    public void on() {
        System.out.println("TV ON");
    }

    public void off() {
        System.out.println("TV OFF");
    }
}

public class Problem8 {
    public static void main(String[] args) {
        Remote r = new TV();
        r.on();
        r.off();
    }
}
