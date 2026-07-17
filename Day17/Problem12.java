package Day17;
interface Animal {

    default void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class Problem12 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}