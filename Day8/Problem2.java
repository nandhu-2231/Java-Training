package Day8;

public class Problem2 {
    

    int id;
    String name;

    Problem2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Problem2 s = new Problem2(101, "Rahul");
        s.display();
    }
}

