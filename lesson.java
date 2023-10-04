// Михаил Витальевич - преподаватель
package Java.lesson1;

import java.util.Scanner;

public class lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int a = scanner.nextInt();
            System.out.println(a % 10);
            for (int i = 0; i < 4; i++) {
                System.out.println(i);
                if (i % 2 == 0) {
                    System.out.println("Test: " + i * i + " ");
                }

            }

        }
        scanner.close();
    }

}
