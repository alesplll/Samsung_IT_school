package gh.lesson1;

import java.util.Scanner;

public class Ex_8_9_left_right {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];

        // Считываем массив
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        // Разделение массива на отрицательные и неотрицательные элементы
        int left = 0;
        int right = N - 1;

        while (left <= right) {
            // Найти первый неотрицательный элемент с начала массива
            while (left <= right && array[left] < 0) {
                left++;
            }

            // Найти первый отрицательный элемент с конца массива
            while (left <= right && array[right] >= 0) {
                right--;
            }

            // Если найдены оба элемента, поменять их местами
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        // Вывести массив
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

/*
 * import java.util.ArrayList;
 * import java.util.Scanner;
 * 
 * public class Main {
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * int N = scanner.nextInt();
 * int[] array = new int[N];
 * ArrayList<Integer> negativeNumbers = new ArrayList<>();
 * ArrayList<Integer> nonNegativeNumbers = new ArrayList<>();
 * 
 * // Считываем массив
 * for (int i = 0; i < N; i++) {
 * array[i] = scanner.nextInt();
 * if (array[i] < 0) {
 * negativeNumbers.add(array[i]);
 * } else {
 * nonNegativeNumbers.add(array[i]);
 * }
 * }
 * 
 * // Слияние списков с отрицательными и неотрицательными числами
 * ArrayList<Integer> result = new ArrayList<>();
 * result.addAll(negativeNumbers);
 * result.addAll(nonNegativeNumbers);
 * 
 * // Вывести массив
 * for (int i = 0; i < N; i++) {
 * System.out.print(result.get(i) + " ");
 * }
 * }
 * }
 * 
 */