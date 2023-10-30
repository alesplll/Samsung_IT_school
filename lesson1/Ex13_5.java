package gh.lesson1;

import java.util.*;

public class Ex13_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String inputStr = scanner.nextLine();
        if (inputStr.equals(new StringBuilder(inputStr).reverse().toString())) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        scanner.close();

    }
}
