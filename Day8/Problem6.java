package Day8;

public class Problem6 {
    String name = "Rahul";

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Problem6 {

    int empId = 101;

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
    }
}

class Test {
    public static void main(String[] args) {

        Employee e = new Employee();

        e.displayPerson();
        e.displayEmployee();
    }
}

