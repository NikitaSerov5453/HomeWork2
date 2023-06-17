import java.util.Scanner;

public class Lesson11 {
    /**
     * Задание 11
     * Найти корни квадратного уравнения и вывести их на экран, если они есть.
     * Если корней нет, то вывести сообщение об этом.
     * Конкретное квадратное уравнение определяется коэффициентами a, b, c, которые вводит пользователь с клавиатуры
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sqrt(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    public static void sqrt(int a, int b, int c) {
        double D = (b * b) - (4 * a * c);
        if (D < 0) {
            System.out.println("Корней нет");
        } else if (D == 0) {
            System.out.println("Есть один корень");
            double x = (double) (-b) / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
