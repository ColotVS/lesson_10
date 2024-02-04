public class lesson_10_22 {
    //Сделай так, чтобы метод format(String name, int salary) возвращал строку в таком виде:
    //Меня зовут <name>. Я буду зарабатывать $<salary> в месяц.

    //Для этого используй метод String.format().

    public static void main(String[] args) {
        System.out.println(format("Влад", 5000));
    }

    public static String format(String name, int salary) {
        return String.format("Меня зовут %s. Я буду зарабатывать %d$ в месяц.",name,salary);
    }
}
