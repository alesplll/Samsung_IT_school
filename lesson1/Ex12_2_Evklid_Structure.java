package gh.lesson1;

import java.util.Scanner;

public class Ex12_2_Evklid_Structure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Result result = euclideanAlgorithm(a, b);

        System.out.println(result.gcd + " " + result.steps);
        scanner.close();
    }

    private static Result euclideanAlgorithm(int a, int b) {
        int steps = 0;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
            steps++;
        }
        return new Result(a, steps + 1);
    }

    private static class Result {
        int gcd;
        int steps;

        Result(int gcd, int steps) {
            this.gcd = gcd;
            this.steps = steps;
        }
    }
}
