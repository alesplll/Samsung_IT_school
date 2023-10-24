package Java.lesson1;

import java.util.HashMap;
import java.util.Scanner;

public class Ex8_8_HasMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Считываем последовательность
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Используем HashMap для подсчета вхождений элементов
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int mostFrequentElement = array[0];
        int maxFrequency = 1;

        for (int num : array) {
            if (frequencyMap.containsKey(num)) {
                int frequency = frequencyMap.get(num) + 1;
                frequencyMap.put(num, frequency);
                if (frequency > maxFrequency
                        || (frequency == maxFrequency && indexOf(num, array) < indexOf(mostFrequentElement, array))) {
                    mostFrequentElement = num;
                    maxFrequency = frequency;
                }
            } else {
                frequencyMap.put(num, 1);
            }
        }

        System.out.println(mostFrequentElement);
    }

    // Метод для нахождения индекса элемента в массиве
    private static int indexOf(int element, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
