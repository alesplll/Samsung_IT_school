package gh.lesson1;

import java.util.*;

public class Ex13_9_Ceaser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String inputStr = scanner.nextLine();
        int k = scanner.nextInt();
        String answer = "";
        for (int i = 0; i < inputStr.length(); i++) {
            if ((int) inputStr.charAt(i) - k >= 65) {
                answer += (char) ((int) inputStr.charAt(i) - k);
            } else {
                answer += (char) (91 - (65 - ((int) inputStr.charAt(i) - k)));
            }
        }
        scanner.close();
        System.out.println(answer);
    }
}
