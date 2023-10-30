package gh.lesson1;

import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        boolean belongsToSegment = !(((x >= -2) && (x <= 3)) || ((x >= 6) && (x <= 9)));
        System.out.println(belongsToSegment);
        scanner.close();
    }
}
