package gh.lesson1;

import java.util.*;

public class Ex13_10_Remove_spaces {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String inputStr = scanner.nextLine();
        StringBuilder answer = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) == ' ') {
                if (!flag) {
                    answer.append(" ");
                    flag = true;
                }
            } else {
                answer.append(inputStr.charAt(i));
                flag = false;
            }
        }
        scanner.close();
        System.out.println(answer);
    }
}
