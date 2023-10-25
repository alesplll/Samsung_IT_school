package Java.lesson1;

import java.util.Scanner;

//public abstract class Ex11_1 {
public class Ex11_1_Massive_rotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Число строк
        int m = scanner.nextInt(); // Число столбцов

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Поворачиваем матрицу на 90 градусов
        int[][] rotatedMatrix = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotatedMatrix[j][n - i - 1] = matrix[i][j];
            }
        }

        System.out.println(m + " " + n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
