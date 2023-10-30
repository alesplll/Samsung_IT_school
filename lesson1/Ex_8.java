package gh.lesson1;

import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        int temp = N;
        while (temp > 1) {
            if (temp % 2 != 0) {
                System.out.println(temp);
                return;
            }
            temp /= 2;
        }
        if (temp == 1) {
            System.out.println(0);
        } else {
            System.out.println(N);
        }

    }

}
