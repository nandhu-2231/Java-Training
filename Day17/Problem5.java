package Day17;

interface Create {
    Student get();
}

class Student {
    Student() {
        System.out.println("Student Object Created");
    }
}

public class Problem5 {
    public static void main(String[] args) {
        Create c = Student::new;
        c.get();
    }
}