package Java.lesson1;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (A): ");
        int A = scanner.nextInt();

        System.out.print("Enter the second number (B): ");
        int B = scanner.nextInt();

        int sum = A + B;

        System.out.println("The sum of " + A + " and " + B + " is: " + sum);

        scanner.close();
    }
}
