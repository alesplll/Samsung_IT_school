package Java.lesson1;

import java.util.Scanner;

public class Ex11_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Число n

        // Заполняем матрицу
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        boolean fl = true;
        // Выводим матрицу
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    fl = false;
                }
            }
        }
        if (fl) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        scanner.close();
    }
}
