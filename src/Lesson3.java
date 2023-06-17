import java.util.Scanner;

public class Lesson3 {
    /**
     * Задание 3
     * Написать программу, которая предлагает пользователю
     * выбрать животное из списка (1 – кошка, 2 – собака и т.д.), и в
     * ответ показывает, какие звуки издает выбранное животное.
     * В списке должно быть не менее 10 животных.
     * @param args
     */
    public static void main(String[] args) {
        animal();
    }

    public static void animal() {
        System.out.println("Выберете животное:");
        System.out.println("1. Кошка");
        System.out.println("2. Собака");
        System.out.println("3. Корова");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1 -> System.out.println("Кошка говорит – Мяу");
            case 2 -> System.out.println("Собака говорит – Гав");
            case 3 -> System.out.println("Корова говорит – Мууу");
            default -> System.out.println("Неверно выбрано животное");
        }
    }
}
