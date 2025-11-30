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

    public static String getString(Scanner scanner, String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("\nInput tidak boleh kosong. Silakan coba lagi.");
            }
        } while (input.isEmpty());

        return input;
    }
}
