package gh.lesson1;

import java.util.Scanner;

public class Ex8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Размер массива
        int[] sequence = new int[N];

        // Заполнение массива числами последовательности
        for (int i = 0, num = 4; i < N; i++, num += 3) {
            sequence[i] = num;
        }

        // Вывод массива на экран
        for (int i = 0; i < N; i++) {
            System.out.print(sequence[i] + " ");
        }
        scanner.close();
    }
}
