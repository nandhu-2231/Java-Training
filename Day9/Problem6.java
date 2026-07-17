package Day9;
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }

    void display() {
        super.display();
        System.out.println("Roll Number: " + rollNo);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}

public class Problem6 {
    public static void main(String[] args) {

        Student s = new Student("Rahul", 101);
        Teacher t = new Teacher("Meena", "Java");

        System.out.println("Student Details:");
        s.display();

        System.out.println();

        System.out.println("Teacher Details:");
        t.display();
    }
}
