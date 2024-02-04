import java.util.StringTokenizer;

public class lesson_10_19 {
    //Вспомогательные классы для работы со строками в Java

    //Класс StringTokenizer

    //И еще несколько самых частых сценариев работы со строками. Как разбить строку на несколько частей? Для этого есть несколько способов.

    //Метод split()

    //Первый способ разбить строку на несколько частей — использовать метод split().
    //В него в качестве параметра нужно передать регулярное выражение: специальный шаблон строки-разделителя.

    //String str = "Good news everyone!";
    //String[] strings = str.split("ne");
    //System.out.println(Arrays.toString(strings));

    //Результатом будет массив из трех строк:
    //["Good ", "ws everyo", "!"]

    //Класс StringTokenizer

    //В Java есть специальный класс, вся работа которого — разделять строку на подстроки.

    //Этот класс не использует регулярные выражения: вместо этого в него просто передается строка,
    //состоящая из символов-разделителей. Преимущества этого подхода в том, что он не разбивает сразу всю строку на кусочки,
    //а потихоньку идет от начала к концу.
    //Класс состоит из конструктора и двух основных методов.
    //В конструктор нужно передать строку, которую мы разбиваем на части, и строку — набор символов, используемых для разделения.

    //Методы	                Описание
    //String nextToken()        Возвращает следующую подстроку
    //boolean hasMoreTokens()   Проверяет, есть ли еще подстроки.

    //Этот класс чем-то напоминает класс Scanner, у которого тоже были методы nextLine() и hasNextLine().

    //Создать объект StringTokenizer можно командой:

    //StringTokenizer имя = new StringTokenizer(строка, разделители);
    //Где строка — это строка, которую будем делить на части.
    //А разделители — это строка, каждый символ которой считается символом-разделителем. Пример:
    public static void main(String[] args) {
        String str = "Good news everyone!";

        StringTokenizer tokenizer = new StringTokenizer(str,"ne");
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }

    //Обратите внимание, что разделителем считается каждый символ строки, переданный второй строкой в конструктор StringTokenizer
}
