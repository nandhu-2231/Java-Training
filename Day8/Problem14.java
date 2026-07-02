package Day8;

public class Problem14 {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Mammal extends Problem14 {

    void walk() {
        System.out.println("Mammal walks.");
    }
}

class Dog extends Mammal {

    void bark() {
        System.out.println("Dog barks.");
    }
}

class Test {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.walk();
        d.bark();
    }
}
    

