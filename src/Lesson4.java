public class Lesson4 {
    /**
     * Задание 4
     * Дана точка на плоскости заданная координатами x и y,
     * определить и вывести в консоль, в какой четверти находится точка, в прямоугольной (декартовой) системе координат.
     * Четверти обозначены римскими цифрами.
     * @param args
     */
    public static void main(String[] args) {
        int x = 1;
        int y = -2;
        xAndY(x, y);
    }

    public static void xAndY(int x, int y) {
        if (x < 0 & y < 0) {
            System.out.println("Точка находится в 3 чатверти");
        } else if (x > 0 & y < 0) {
            System.out.println("Точка находится в 4 чатверти");
        } else if (x < 0 & y > 0) {
            System.out.println("Точка находится в 2 чатверти");
        } else if (x > 0 & y > 0) {
            System.out.println("Точка находится в 1 чатверти");
        } else {
            System.out.println("Точка находится в 0");
        }
    }
}
