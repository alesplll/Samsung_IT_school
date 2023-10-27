package Java.lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex12_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int N = scanner.nextInt();

        ArrayList<int[]> solutions = new ArrayList<>();

        for (int ka = 0; ka <= N / a; ka++) {
            for (int kb = 0; kb <= N / b; kb++) {
                int remaining = N - ka * a - kb * b;
                if (remaining >= 0 && remaining % c == 0) {
                    int kc = remaining / c;
                    solutions.add(new int[] { ka, kb, kc });
                }
            }
        }

        Collections.sort(solutions, (x, y) -> {
            if (x[0] != y[0])
                return x[0] - y[0];
            if (x[1] != y[1])
                return x[1] - y[1];
            return x[2] - y[2];
        });

        System.out.println(solutions.size());
        for (int[] solution : solutions) {
            System.out.println(solution[0] + " " + solution[1] + " " + solution[2]);
        }
        scanner.close();
    }
}
