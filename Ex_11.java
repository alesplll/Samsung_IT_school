package Java.lesson1;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean fnc = (num1 % 2 == 0 && num2 % 2 == 0) ||
                (num1 % 2 == 0 && num3 % 2 == 0) ||
                (num2 % 2 == 0 && num3 % 2 == 0);

        System.out.println(fnc);
        scanner.close();

    }
}
