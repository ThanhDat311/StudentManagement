package util;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Lớp tiện ích để xử lý các phương thức nhập liệu.
 */

public class InputHelper {

    // Static way to get a mark and check if it is okay (0-10)
    public static double inputSingleMark(Scanner sc, String prompt) {
        double mark;
        while (true) {
            try {
                System.out.print(prompt);
                mark = sc.nextDouble();
                sc.nextLine(); // tiêu thụ newline
                if (mark >= 0 && mark <= 10) {
                    return mark;
                } else {
                    System.out.println("Mark must be between 0 and 10.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // take bad input
            }
        }
    }
    
    // (Tuỳ chọn) Thêm hàm nhập số nguyên trong khoảng nếu cần
    public static int inputIntInRange(Scanner sc, String prompt, int min, int max) {
        int value;
        while (true) {
            try {
                System.out.print(prompt);
                value = sc.nextInt();
                sc.nextLine();
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.printf("❌ Number must be between %d and %d.%n", min, max);
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Please enter an integer.");
                sc.nextLine();
            }
        }
    }
    
    // (Tuỳ chọn) Nhập chuỗi không rỗng
    public static String inputNonEmptyString(Scanner sc, String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.out.println("❌ Input cannot be empty.");
            }
        }
    }
}

