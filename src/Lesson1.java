import java.util.Scanner;

/**
 * Задание 1
 * Написать программу, которая предлагает пользователю
 * ввести c клавиатуры номер дня недели, и в ответ показывает название этого дня (например, 6 – это суббота). Решить с
 * использованием switch.
 */

public class Lesson1 {
    public static void main(String[] args) {
        sayOfWeek();
    }
    public static void sayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Неверно введен день недели");
        }
    }
}
