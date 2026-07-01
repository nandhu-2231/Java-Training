package Day7;

public class Problem4 {
    void display() {
        System.out.println("I am a Person");
    }
}

class Student extends Problem4 {

    @Override
    void display() {
        System.out.println("I am a Student");
    }

    void study() {
        System.out.println("Student is studying");
    }
}
class UpcastingDemo {
    public static void main(String[] args) {

        Problem4 p = new Student();   
        p.display();   
    }
}

