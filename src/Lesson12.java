import java.util.Scanner;

public class Lesson12 {
    /**
     * Программа запрашивает шестизначное число. После ввода определяет, будет ли являться «счастливым» билет с таким номером (сумма первых трех цифр совпадает с суммой
     * трех последних).
     * Пример входных данных:
     * 423027
     * 954832
     * Вывод:
     * Да
     * Нет
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int a = scanner.nextInt();
        luckyTicket(a);
    }

    public static void luckyTicket (int numberTicket) {
        String ticket = Integer.toString(numberTicket);
        int[] arrayNumberTicket = new int[ticket.length()];
        for (int i = 0; i < ticket.length(); i++) {
            arrayNumberTicket[i] = ticket.charAt(i) - '0';
        }
        if (arrayNumberTicket[0] + arrayNumberTicket[1] + arrayNumberTicket[2] == arrayNumberTicket[3] + arrayNumberTicket[4] + arrayNumberTicket[5]) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

    }
}
