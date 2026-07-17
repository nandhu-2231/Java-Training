package Day11;

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class Card implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(1000);

        p = new Card();
        p.pay(2000);
    }
}