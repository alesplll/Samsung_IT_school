package gh.lesson1;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String ending;
        if (number % 10 == 1 && number % 100 != 11) {
            ending = " TORT";
        } else if ((number % 10 >= 2 && number % 10 <= 4) && !(number % 100 >= 12 && number % 100 <= 14)) {
            ending = " TORTA";
        } else {
            ending = " TORTOV";
        }

        System.out.println(number + ending);
        scanner.close();
    }
}
