package util;

import java.util.Scanner;

public class InputHelper {
    public static int getInt(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
