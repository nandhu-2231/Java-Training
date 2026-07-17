package Day9;

// AggregationDemo.java

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Professor: " + name);
    }
}

class College {
    String collegeName;
    Professor professor;

    College(String collegeName, Professor professor) {
        this.collegeName = collegeName;
        this.professor = professor;
    }

    void display() {
        System.out.println("College: " + collegeName);
        professor.display();
    }
}

public class AggregationDemo {
    public static void main(String[] args) {

        Professor p = new Professor("Dr. Kumar");

        College c = new College("ABC Engineering College", p);

        c.display();
    }
}