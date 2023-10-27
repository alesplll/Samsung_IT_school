package Java.lesson1;

import java.util.Scanner;

public class Ex12_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        boolean found = false;
        for (int num = a; num <= b; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("0");
        }
        scanner.close();
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
