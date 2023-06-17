import java.util.Scanner;

/**
 * Задание 2
 * С клавиатуры вводится время (количество часов от 0 до
 * 24) – программа выводит приветствие, соответствующее
 * введенному времени (например, ввели 15 часов – выводится
 * приветствие «Добрый день»).
 */

public class Lesson2 {
    public static void main(String[] args) {
        time();
    }

    public static void time() {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        if (time < 6) {
            System.out.println("Доброй ночи");
        } else if (time < 12) {
            System.out.println("Доброе утро");
        } else if (time < 17) {
            System.out.println("Добрый день");
        } else if (time < 22) {
            System.out.println("Добрый вечер");
        } else {
            System.out.println("Доброй ночи");
        }
    }
}
