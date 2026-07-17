package Day10;

class Employee {
    private int id;
    private String name;
    private double salary;

    public void setId(int id) {
        if (id > 0)
            this.id = id;
        else
            System.out.println("Invalid ID");
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty())
            this.name = name;
        else
            System.out.println("Invalid Name");
    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
        else
            System.out.println("Invalid Salary");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setId(101);
        emp.setName("Rahul");
        emp.setSalary(50000);

        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}