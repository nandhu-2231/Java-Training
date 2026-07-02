package Day8;

public class Problem7 {
    String title;
    double price;

    Problem7(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Problem7 b = new Problem7("Java Programming", 550);

        b.display();
    }
}
    

