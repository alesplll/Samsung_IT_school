package gh.lesson1;

import java.util.*;

public class Ex13_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String inputStr = scanner.nextLine().toLowerCase(Locale.ROOT).replaceAll("\\s+", "");
        String output = new StringBuilder(inputStr).reverse().toString();
        if (inputStr.equals(output)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        scanner.close();
    }
}
