package Day11;

interface Employee {
    void work();
}

class Developer implements Employee {
    public void work() {
        System.out.println("Developer writes code");
    }
}

class Tester implements Employee {
    public void work() {
        System.out.println("Tester tests software");
    }
}

public class Problem12 {
    public static void main(String[] args) {
        Employee e = new Developer();
        e.work();

        e = new Tester();
        e.work();
    }
}