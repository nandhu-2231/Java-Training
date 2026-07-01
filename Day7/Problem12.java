package Day7;

public class Problem12 {
    int id;
    String name;
    double salary;

    Problem12(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {

        Problem12 e1 = new Problem12(1, "Rahul", 50000);
        Problem12 e2 = new Problem12(2, "Priya", 60000);
        Problem12 e3 = new Problem12(3, "Amit", 70000);

        e1.display();
        e2.display();
        e3.display();
    }
}
    

