package Day9;
class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Teacher: " + name);
    }
}

class Department {
    String deptName;
    Teacher teacher;

    Department(String deptName, Teacher teacher) {
        this.deptName = deptName;
        this.teacher = teacher;
    }

    void display() {
        System.out.println("Department: " + deptName);
        teacher.display();
    }
}

public class Problem4 {
    public static void main(String[] args) {

        Teacher t = new Teacher("Dr. Ravi");

        Department d = new Department("Computer Science", t);

        d.display();
    }
}
