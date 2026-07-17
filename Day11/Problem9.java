package Day11;

interface Bank {
    void interestRate();
}

class SBI implements Bank {
    public void interestRate() {
        System.out.println("Interest Rate: 6.5%");
    }
}

public class Problem9 {
    public static void main(String[] args) {
        Bank b = new SBI();
        b.interestRate();
    }
}