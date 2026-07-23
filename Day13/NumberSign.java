package Day13;

import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int num = Integer.parseInt(input);

        if (num > 0)
            System.out.println("Positive");
        else if (num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");

        sc.close();
    }
}