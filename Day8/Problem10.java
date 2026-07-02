package Day8;

public class Problem10 {
    int empId = 101;                  
    static String company = "ABC Ltd"; 

    void display() {

        int salary = 50000;           

        System.out.println("Employee ID: " + empId);
        System.out.println("Company: " + company);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Problem10 e = new Problem10();

        e.display();
    }
}

