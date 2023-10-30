package gh.lesson1;

import java.util.Scanner;

public class Ex9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(sumOfDigits(n));
    }

    public static int sumOfDigits(int n) {
        int res = 0;
        while (true) {
            if (n >= 10) {
                res += n % 10;
            } else {
                res += n;
                return res;
            }
            n /= 10;
        }

    }
}
