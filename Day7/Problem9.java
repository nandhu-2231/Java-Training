package Day7;

public class Problem9 {
    String title;
    String author;

    Problem9(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book Title : " + title);
        System.out.println("Author : " + author);
    }

    public static void main(String[] args) {
       Problem9 b = new Problem9("Java Programming", "James Gosling");
        b.display();
    }
}

