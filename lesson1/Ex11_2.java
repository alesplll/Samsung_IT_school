package gh.lesson1;

import java.util.Scanner;

public class Ex11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Число n

        int[][] matrix = new int[n][n];

        // Заполняем матрицу
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrix[i][j] = 1; // Элементы на главной диагонали равны 1
                } else if (i < j) {
                    matrix[i][j] = 0; // Элементы выше главной диагонали равны 0
                } else {
                    matrix[i][j] = 2; // Элементы ниже главной диагонали равны 2
                }
            }
        }

        // Выводим матрицу
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][n - j - 1] + " ");
            }
            System.out.println(); // Переход на новую строку после каждой строки матрицы
        }
        scanner.close();
    }
}
