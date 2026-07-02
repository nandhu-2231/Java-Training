package Day8;

public class Problem12 {
    String name = "Rahul";
    void showPerson() {
        System.out.println("Name: " + name);
    }
}

class Student extends Problem12 {

    int rollNo = 101;

    void showStudent() {
        System.out.println("Roll No: " + rollNo);
    }
}

class Teacher extends Problem12 {

    String subject = "Java";

    void showTeacher() {
        System.out.println("Subject: " + subject);
    }
}
class Test {

    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();

        System.out.println("Student Details");
        s.showPerson();
        s.showStudent();

        System.out.println();

        System.out.println("Teacher Details");
        t.showPerson();
        t.showTeacher();
    }
}

