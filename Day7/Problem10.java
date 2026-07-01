package Day7;
public class Problem10 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Problem10 {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    void eat() {
        System.out.println("Dog eats food");
    }
}
 class UpcastingDemo {
    public static void main(String[] args) {
       Problem10 a = new Dog();  
        a.sound();
    }
} 

