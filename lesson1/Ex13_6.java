package gh.lesson1;

import java.util.*;

public class Ex13_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String inputStr = scanner.nextLine();
        HashMap<String, Integer> letters = new HashMap<>();
        for (int i = 0; i < inputStr.length(); i++) {
            letters.merge(String.valueOf(inputStr.charAt(i)), 1, Integer::sum);
            if (letters.get(String.valueOf(inputStr.charAt(i))) == 2) {
                System.out.println(inputStr.charAt(i));
                break;
            }
        }
        scanner.close();

    }
}