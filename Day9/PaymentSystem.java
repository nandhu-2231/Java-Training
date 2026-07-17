package Day9;
// PaymentSystem.java

abstract class Payment {
    abstract void pay(double amount);
}

class UPI extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

class Card extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card.");
    }
}

class Cash extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment p;

        p = new UPI();
        p.pay(1000);

        p = new Card();
        p.pay(2000);

        p = new Cash();
        p.pay(500);
    }
}



