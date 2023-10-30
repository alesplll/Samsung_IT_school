// Михаил Витальевич - преподаватель
package gh.lesson1;

import java.util.Scanner;

public class lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int sum = A + B;

        System.out.println(sum);

        scanner.close();
    }

}
