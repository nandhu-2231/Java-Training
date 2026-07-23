package Day13;

import java.util.Scanner;

public class CubeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("Cube = " + (num * num * num));

        sc.close();
    }
}