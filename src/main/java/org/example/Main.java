package org.example;

import java.util.Scanner;

class Answer {
    public float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        float result = 0.0f;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Введите дробное число: ");
                result = Float.parseFloat(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите дробное число.");
            }
        }

        return result;
    }
}

// Пример использования метода
public class Main {
    public static void main(String[] args) {
        Answer ans = new Answer();
        float input = ans.inputFloat();
        System.out.println("Вы ввели: " + input);
    }
}
