import java.util.Scanner;

public class Lesson9 {
    /**
     * Задание 9
     * Даны координаты начала и координаты конца отрезка.
     * Если считать отрезок обозначением горки, то в одном случае он обозначает спуск, в другом – подъем. Определить и
     * вывести на экран – спуск это или подъем, ровная дорога или
     * вообще отвесная.
     * @param args
     */
    public static void main(String[] args) {
        a();
    }

    public static void a () {
        int coordinate1X = 5;
        int coordinate1Y = 1;

        int coordinate2X = -150;
        int coordinate2Y = -2;


        if (coordinate1Y < coordinate2Y) {
            if (coordinate1X > coordinate2X & (coordinate2Y - coordinate1Y) < (coordinate1X - coordinate2X )) {
                System.out.println("Отвестный спуск");
            } else if (coordinate1X > coordinate2X) {
                System.out.println("Спуск");
            } else if (coordinate1X < coordinate2X & (coordinate2Y - coordinate1Y) > (coordinate1X - coordinate2X )) {
                System.out.println("Отвесный подъем");
            } else if (coordinate1X < coordinate2X) {
                System.out.println("Подъем");
            } else {
                System.out.println("Ровная дорога");
            }
        } else if (coordinate1Y > coordinate2Y) {
            if (coordinate1X > coordinate2X & (coordinate2Y - coordinate1Y) < (coordinate1X - coordinate2X )) {
                System.out.println("Отвестный подъем");
            } else if (coordinate1X > coordinate2X) {
                System.out.println("Подъем");
            } else if (coordinate1X < coordinate2X & (coordinate2Y - coordinate1Y) < (coordinate1X - coordinate2X )) {
                System.out.println("Отвестный спуск");
            } else if (coordinate1X < coordinate2X) {
                System.out.println("Cпуск");
            } else {
                System.out.println("Ровная дорога");
            }
        }
    }
}
