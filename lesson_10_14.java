import java.util.Scanner;

public class lesson_10_14 {
    //Сравнение строк

    //Сравнение — одна из самых частых вещей, которая делается со строками.
    //У класса String более десяти различных методов, которые используются для сравнения строк со строками. Ниже мы рассмотрим семь основных.

    //Методы	                            Описание
    //boolean equals(String str)            Строки считаются равными, если все их символы совпадают.
    //boolean equalsIgnoreCase(String str)  Сравнивает строки, игнорируя регистр (размер) букв
    //int compareTo(String str)             Сравнивает строки лексикографически. Возвращает 0, если строки равны.
                                            //Число меньше нуля, если текущая строка меньше строки-параметра.
                                            //Число больше нуля, если текущая строка больше строки-параметра
    //int compareToIgnoreCase(String str)   Сравнивает строки лексикографически, игнорирует регистр.
                                            //Возвращает 0, если строки равны. Число меньше нуля, если текущая строка меньше строки-параметра.
                                            //Число больше нуля, если текущая строка больше строки-параметра
    //boolean regionMatches(int toffset, String str, int offset, int len) Сравнивает части строк
    //boolean startsWith(String prefix)     Проверяет, что текущая строка начинается со строки prefix
    //boolean endsWith(String suffix)       Проверяет, что текущая строка заканчивается на строку suffix

    //Программа, которая просит пользователя ввести путь к файлу и проверяет, что это за файл по его расширению
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        if (path.endsWith(".jpg") || path.endsWith(".jpeg"))
        {
            System.out.println("Это Jpeg!");
        }
        else if (path.endsWith(".htm") || path.endsWith(".html"))
        {
            System.out.println("Это HTML-страница");
        }
        else if (path.endsWith(".doc") || path.endsWith(".docx"))
        {
            System.out.println("Это документ Word");
        }
        else
        {
            System.out.println("Неизвестный формат");
        }
    }
}
