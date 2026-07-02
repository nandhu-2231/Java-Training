package Day8;

public class Problem5 {
    int number;

    Problem5(int number) {
        this.number = number;
    }

    void display() {
        System.out.println("Number = " + this.number);
    }

    public static void main(String[] args) {
        Problem5 obj = new Problem5(50);
        obj.display();
    }
}

