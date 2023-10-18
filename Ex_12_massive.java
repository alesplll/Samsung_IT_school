package Java.lesson1;

import java.util.Scanner;

public class Ex_12_massive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i] + " ");
        }
        scanner.close();
    }

}
