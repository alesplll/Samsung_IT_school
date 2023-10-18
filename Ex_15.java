package Java.lesson1;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        int daysInMonth;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = 28;
                break;
            default:
                daysInMonth = 0;
                System.out.println(0);
        }

        if (daysInMonth != 0) {
            System.out.println(daysInMonth);
        }
        scanner.close();
    }
}