package Day7;

public class Problem1 {
    private double balance;
    Problem1(double balance) {
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Problem1 acc = new Problem1(5000);

        acc.deposit(1000);
        acc.withdraw(2000);
        acc.displayBalance();
    }
}

