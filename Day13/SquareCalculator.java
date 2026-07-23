package Day13;

import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("Square = " + (num * num));

        sc.close();
    }
}