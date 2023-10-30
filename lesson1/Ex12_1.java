package gh.lesson1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex12_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String number = Integer.toString(n);
        Set<Character> uniqueDigits = new HashSet<>();
        boolean hasDuplicate = false;

        for (char digit : number.toCharArray()) {
            if (!uniqueDigits.add(digit)) {
                hasDuplicate = true;
                break;
            }
        }

        if (hasDuplicate) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
