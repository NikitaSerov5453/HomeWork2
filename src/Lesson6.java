import java.util.Scanner;

public class Lesson6 {
    /**
     * Задание 6
     * Определить количество дней в году, который вводит
     * пользователь, и вывести их в консоль. В високосном году –
     * 366 дней, тогда как в обычном – 365. Високосными годами
     * являются все годы, делящиеся нацело на 4, за исключением
     * столетий, которые не делятся нацело на 400.
     * @param args
     */
    public static void main(String[] args) {
        leapYear();
    }

    public static void leapYear () {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0) & (year % 100 !=0) || (year % 400 == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }

    }
}
