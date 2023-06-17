public class Lesson10 {
    /**
     * Определить номер подъезда девятиэтажного дома, по
     * указанному номеру квартиры N. Считать, что на каждом
     * этаже находится M квартир. Вывести в консоль номер подъезда.
     * @param args
     */
    public static void main(String[] args) {
        entrance(1500, 9);
    }
    public static void entrance(int flat, int flatOnFlor) {
        int floorInHome = 9;
        int floor = (int) Math.ceil((double) flat / flatOnFlor);
        int entrance = (int) Math.ceil((double) floor / floorInHome);
        System.out.println(entrance);
    }
}
