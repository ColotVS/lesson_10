public class lesson_10_27 {
    //Полезные примеры работы со строками

    //Как развернуть строку задом наперед?
    //
    //Для этой операции есть специальный метод — reverse(); Пример:
    public static void main(String[] args) {
        String str = "Привет";
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        String result = builder.toString();
        System.out.println(result);     //тевирП

    }
    //Класс StringBuffer

    //Есть еще один класс — StringBuffer — это аналог класса StringBuilder, только его методы имеют модификатор synchronized.
    //А это значит, что к объекту StringBuffer можно одновременно обращаться из нескольких потоков.
    //Зато он работает гораздо медленнее, чем StringBuilder.
}
