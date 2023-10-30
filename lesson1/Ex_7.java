package gh.lesson1;

import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(1 << n);
        scanner.close();
    }
}
