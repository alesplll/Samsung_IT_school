package gh.lesson1;

import java.util.*;

public class Ex13_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int x = 0;
        int y = 0;
        String direction;
        String[] cords;
        while (scanner.hasNextLine()) {
            direction = scanner.nextLine();
            cords = direction.split(" ");
            switch (cords[0]) {
                case "North":
                    y += Integer.parseInt(cords[1]);
                    break;
                case "South":
                    y -= Integer.parseInt(cords[1]);
                    break;
                case "West":
                    x -= Integer.parseInt(cords[1]);
                    break;
                case "East":
                    x += Integer.parseInt(cords[1]);
                    break;
            }
        }
        scanner.close();
        System.out.printf("%d %d", x, y);
    }

}
