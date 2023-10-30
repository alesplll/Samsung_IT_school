package gh.exam;

import java.util.Scanner;

public class temp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();

                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
