public class Lesson8 {
    /**
     *Задание 8
     * Даны два числа x и y. Программа должна вывести в консоль YES, – если оба числа четные, либо оба числа нечетные;
     * иначе программа ничего не выводит.
     */
    public static void main(String[] args) {
        evenNumbers();
    }
    static int x = 3;
    static int y = 1;
    public static void evenNumbers () {
        if ((x + y) % 2 == 0) {
            System.out.println("YES");
        }
    }
}
