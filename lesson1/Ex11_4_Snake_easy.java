package gh.lesson1;

import java.util.Scanner;

public class Ex11_4_Snake_easy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Количество строк
        int m = scanner.nextInt(); // Количество столбцов

        int[][] a = new int[n][m];
        int counter = 1; // Счетчик для заполнения массива
        int direction = 1; // Направление заполнения: 1 - вниз, -1 - вверх

        // Заполняем массив "змейкой"
        for (int i = 0; i < n; i++) {
            if (direction == 1) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = counter++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    a[i][j] = counter++;
                }
            }
            // Меняем направление после каждой строки
            direction *= -1;
        }

        // Выводим массив на экран
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d", a[i][j]); // Форматированный вывод с отступами
            }
            System.out.println(); // Переход на новую строку после каждой строки массива
        }
        scanner.close();
    }
}
