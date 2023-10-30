package gh.lesson1;

import java.util.Scanner;

public class Ex_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b > 0) {
                System.out.println("any x");
            } else {
                System.out.println("no such x");
            }
        } else {
            if (a > 0) {
                if (b > 0) {
                    System.out.println("any x");
                } else {
                    System.out.printf("x<%.1f or x>%.1f", -Math.abs(b / a), Math.abs(b / a));
                }
            } else {
                if (b < 0) {
                    System.out.println("no such x");
                } else {
                    System.out.printf("%.1f<x<%.1f", -Math.abs(b / a), Math.abs(b / a));
                }
            }
        }
        scanner.close();
    }
}