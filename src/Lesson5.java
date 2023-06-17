import java.util.Scanner;

public class Lesson5 {

    /**
     * Организовать ввод с клавиатуры даты рождения человека. Программа должна вывести знак зодиака и название
     * года по китайскому календарю.
     * Пример входных данных:
     * 5 12 1974
     * Вывод:
     * Знак: Стрелец
     * Год: Тигра
     *
     * @param args
     */
    public static void main(String[] args) {
        printDate();
    }

    public static void printDate() {
        System.out.println("Введите дату рождения:");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] dateArray = date.split(" ");
        int day = Integer.parseInt(dateArray[0]);
        int month = Integer.parseInt(dateArray[1]);
        int year = Integer.parseInt(dateArray[2]);
        System.out.print("Год: ");
        switch (year % 12) {
            case 0 -> System.out.println("Обезьяны");
            case 1 -> System.out.println("Петуха");
            case 2 -> System.out.println("Собаки");
            case 3 -> System.out.println("Свиньи");
            case 4 -> System.out.println("Крысы");
            case 5 -> System.out.println("Быка");
            case 6 -> System.out.println("Тигра");
            case 7 -> System.out.println("Кролика");
            case 8 -> System.out.println("Дракона");
            case 9 -> System.out.println("Змеи");
            case 10 -> System.out.println("Лошади");
            case 11 -> System.out.println("Овцы");
            default -> System.out.println("Ошибка");
        }

        System.out.print("Знак зодиака: ");
        if (month == 1) {
            if (day < 20) {
                System.out.println("Кзерог");
            } else {
                System.out.println("Водолей");
            }
        } else if (month == 2) {
            if (day < 19) {
                System.out.println("Водолей");
            } else {
                System.out.println("Рыбы");
            }
        } else if (month == 3) {
            if (day < 21) {
                System.out.println("Рыбы");
            } else {
                System.out.println("Овен");
            }
        } else if (month == 4) {
            if (day < 20) {
                System.out.println("Овен");
            } else {
                System.out.println("Телец");
            }
        } else if (month == 5) {
            if (day < 21) {
                System.out.println("Телец");
            } else {
                System.out.println("Близнецы");
            }
        } else if (month == 6) {
            if (day < 21) {
                System.out.println("Близнецы");
            } else {
                System.out.println("Рак");
            }
        } else if (month == 7) {
            if (day < 23) {
                System.out.println("Рак");
            } else {
                System.out.println("Лев");
            }
        } else if (month == 8) {
            if (day < 23) {
                System.out.println("Лев");
            } else {
                System.out.println("Дева");
            }
        } else if (month == 9) {
            if (day < 23) {
                System.out.println("Дева");
            } else {
                System.out.println("Весы");
            }
        } else if (month == 10) {
            if (day < 23) {
                System.out.println("Весы");
            } else {
                System.out.println("Скорпион");
            }
        } else if (month == 11) {
            if (day < 22) {
                System.out.println("Скорпион");
            } else {
                System.out.println("Стрелец");
            }
        } else if (month == 12) {
            if (day < 22) {
                System.out.println("Стрелец");
            } else {
                System.out.println("Козерог");
            }
        }

    }

}
