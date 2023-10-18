package Java.lesson1;

public class Ex11_5 {
    public static void main(String[] args) {
        int n = 2;
        int[][] array = new int[2 * n + 1][2 * n + 1];

        int num = (2 * n + 1) * (2 * n + 1) - 1;
        int rowStart = 0, rowEnd = 2 * n, colStart = 2 * n, colEnd = 0;

        while (rowStart <= rowEnd && colStart >= colEnd) {
            for (int i = colStart; i >= colEnd; i--) {
                array[rowStart][i] = num--;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                array[i][colEnd] = num--;
            }
            colEnd++;

            for (int i = colEnd; i <= colStart; i++) {
                array[rowEnd][i] = num--;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                array[i][colStart] = num--;
            }
            colStart--;
        }

        for (int i = 0; i < 2 * n + 1; i++) {
            for (int j = 0; j < 2 * n + 1; j++) {
                System.out.printf("%3d ", array[2 * n - j][2 * n - i]);
            }
            System.out.println();
        }
    }
}
