package Day8;

public class Problem8 {
    String name;
    double balance;

    Problem8() {
        this("Rahul", 0);
    }

    Problem8(String name) {
        this(name, 0);
    }

    Problem8(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: ₹" + balance);
    }

    public static void main(String[] args) {

        Problem8 a1 = new Problem8();
        Problem8 a2 = new Problem8("Amit");
        Problem8 a3 = new Problem8("Priya", 10000);

        a1.display();
        a2.display();
        a3.display();
    }
}

