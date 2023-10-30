package gh;

import java.util.Scanner;

public class isDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char number = scanner.next().charAt(0);
        if (IsDigit(number)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        scanner.close();

    }

    public static boolean IsDigit(char c) {
        return 48 <= (int) c && (int) c <= 57;
    }
}