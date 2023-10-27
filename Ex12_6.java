package Java.lesson1;

import java.util.Scanner;

public class Ex12_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxIncreasingLength = 1;
        int maxDecreasingLength = 1;
        int currentIncreasingLength = 1;
        int currentDecreasingLength = 1;

        int prevNum = scanner.nextInt();
        while (prevNum != 0) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }

            if (num > prevNum) {
                currentIncreasingLength++;
                currentDecreasingLength = 1;
            } else if (num < prevNum) {
                currentDecreasingLength++;
                currentIncreasingLength = 1;
            } else {
                currentIncreasingLength = 1;
                currentDecreasingLength = 1;
            }

            maxIncreasingLength = Math.max(maxIncreasingLength, currentIncreasingLength);
            maxDecreasingLength = Math.max(maxDecreasingLength, currentDecreasingLength);

            prevNum = num;
        }

        int maxLength = Math.max(maxIncreasingLength, maxDecreasingLength);
        System.out.println(maxLength);
        scanner.close();
    }
}
