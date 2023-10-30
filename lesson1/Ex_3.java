package gh.lesson1;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a % 10 + a / 10 % 10 + a / 100 % 10);
        scanner.close();
    }
}
