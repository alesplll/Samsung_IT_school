package gh.lesson1;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean ist = x > 100 && x < 1000 && x % 5 == 0;
        System.out.println(ist);
        scanner.close();
    }
}
