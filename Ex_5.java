package Java.lesson1;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a / 60 % 60 < 10 && a % 60 < 10) {
            System.out.printf("%d:0%d:0%d", a / 60 / 60 % 24, a / 60 % 60, a % 60);
        } else if (a / 60 % 60 < 10) {
            System.out.printf("%d:0%d:%d", a / 60 / 60 % 24, a / 60 % 60, a % 60);
        } else if (a % 60 < 10) {
            System.out.printf("%d:%d:0%d", a / 60 / 60 % 24, a / 60 % 60, a % 60);
        } else {
            System.out.printf("%d:%d:%d", a / 60 / 60 % 24, a / 60 % 60, a % 60);
        }
        sc.close();
    }
}
