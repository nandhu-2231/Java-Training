package Day10;
public class Problem9 {
    public static void main(String[] args) {

        A obj = new A();

        System.out.println("Public: " + obj.a);
        System.out.println("Protected: " + obj.b);
        System.out.println("Default: " + obj.c);

        // obj.d; // Not accessible because it is private

        obj.display();
    }
}