package Java.lesson1;

import java.util.Scanner;

public class lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int a = scanner.nextInt();
            System.out.println(a % 10);

        }
        scanner.close();

    }

}
