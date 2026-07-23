package Day12;

import java.util.Scanner;

public class WrapperCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char op = sc.next().charAt(0);

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b != 0)
                    System.out.println(a / b);
                else
                    System.out.println("Division by zero");
                break;
            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}