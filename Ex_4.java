package Java.lesson1;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + 2);
        } else {
            System.out.println(a + 1);
        }
        scanner.close();
    }
}
