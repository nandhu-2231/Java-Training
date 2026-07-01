package Day7;

public class Problem7 {
    int id;
    String name;
    double marks;
    Problem7(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        Problem7 s1 = new Problem7(101, "Rahul", 85.5);
        Problem7 s2 = new Problem7(102, "Priya", 91.0);
        Problem7 s3 = new Problem7(103, "Amit", 78.5);

        s1.display();
        s2.display();
        s3.display();
    }
}

