public class lesson_10_04 {
    //Литералы символов

    //В коде можно задавать не только строковые литералы, но и литералы из отдельных символов.
    //В данном случае речь идет не о строке, состоящей из одного символа, а о литералах типа char.
    //Символьный литерал обрамляется одинарными кавычками, в отличие от строки.
    //Внутри одинарных кавычек обязательно должен быть символ и только один. Не может быть пустых одинарных кавычек.

    //Код	    Пояснение
    //'A'       Литерал типа char. Содержит латинскую букву A.
    //'@'       Литерал типа char. Содержит символ @
    //'本'       Литерал типа char. Содержит иероглиф японского алфавита. Да, так тоже можно.
    //'u1f3a'  Литерал типа char. Содержит символ кодировки Unicode, заданный его номером.

    //В последнем примере задается символ из кодировки Unicode с помощью специальной записи:
    //сначала идет префикс u, затем 4 шестнадцатеричных символа. Детальнее об этом в ближайших лекциях.

    //В классе объявлены четыре публичных символьных поля. Им присвоены некоторые значения.
    //Но программа не компилируется. Нужно это исправить, не меняя значения символов.
    //Все поля статические (static) — это нужно, чтобы в методе main() получить к ним доступ.
    //На результат можно посмотреть, запустив метод main(). Он не принимает участие в тестировании.
    public static char first = '\u004A';
    public static char second = 'a';
    public static char third = '\u0076';
    public static char fourth = 'a';

    public static void main(String[] args) {
        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
    }
}
