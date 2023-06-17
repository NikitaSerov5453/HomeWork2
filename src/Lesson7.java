import java.util.Scanner;

public class Lesson7 {
    /**
     * Задание 7
     * Пользователь вводит с клавиатуры букву. Программа
     * должна определить, в какой раскладке введена буква – в латинской или кирилице. Вывести в консоль: «латиница», если
     * буква введена латиницей или «кирилица», если буква относится к кирилическому алфавиту. Если введена цифра, а не
     * буква, вывести «цифра». Если символ не относится ни к буквам, ни к цифрам, вывести «невозможно определить».
     *
     * @param args
     */
    public static void main(String[] args) {
        lainOrCyrillic();
    }

    public static void lainOrCyrillic() {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        char[] cyrillic = new char[]
                {'A', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У',
                        'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я',
                        'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
                        'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        char[] numbers = new char[]
                {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] lain = new char[]
                {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                        'Y', 'U', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
                'y', 'w', 'x', 'y', 'z'};
        for (char c : cyrillic) {
            if (a == c) {
                System.out.println("Кириллица");
                break;
            }
        }
        for (char number : numbers) {
            if (a == number) {
                System.out.println("Число");
                break;
            }
        }
        for (char v : lain) {
            if (a == v) {
                System.out.println("Латиница");
                break;
            }
        }
    }
}
