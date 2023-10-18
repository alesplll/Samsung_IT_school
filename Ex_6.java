package Java.lesson1;

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), i = scanner.nextInt();
        a = a >> i;
        a = a << i;
        System.out.println(a);
        scanner.close();
    }

}
