public class lesson_10_09 {
    //Экранирование символов

    //Когда-то давно вы узнали, что, чтобы записать в коде строку символов,
    //нужно обернуть эти символы в двойные кавычки: получится строковой литерал.
    //А что делать, если нам нужно, чтобы кавычки были внутри строкового литерала? Строка, содержащая кавычки — что может быть проще.
    //String s = "Фильм "Друзья" номинирован на "Оскар"";
    //Этот вариант работать не будет!

    //После того как компилятор встретит двойные кавычки в коде,
    //он будет считать их началом строкового литерала. Следующие двойные кавычки — окончанием строкового литерала.

    //Способ есть, ему даже дали название — экранирование символов.
    //Вы просто пишете внутри строки текста кавычки, а перед кавычками добавляете символ \
    //(обратная косая черта или обратный слеш или бекслеш, от англ. backslash).
    //Вот как будет выглядеть правильно записанный строковой литерал:
    public static String s = "Фильм \"Друзья\" номинирован на \"Оскар\"";
    //Компилятор все поймет правильно и не будет считать кавычки, расположенные после обратной косой черты, обычными кавычками.
    //
    //Более того, если вывести данную строку на экран, кавычки с обратной косой чертой будут правильно обработаны,
    //и на экран будет выведена надпись без обратной косой черты: Фильм "Друзья" номинирован на "Оскар"

    //Кроме двойных кавычек, есть еще много символов, которые по-особому обрабатываются компилятором. Например, перенос строки.
    //Для этого тоже есть специальная комбинация:
    //  \n
    public static void main(String[] args) {
        System.out.println(s);
        System.out.println("С уважением,\nАноним");
        System.out.println("0\t1\t2\t3");
        System.out.println("0\t10\t20\t30");
        System.out.println("0\t100\t200\t300");
        System.out.println("Привет\b\b Мир");
        System.out.println("Привет\rМир!");
        System.out.println("c:\\projects\\my\\first");
    }
    //Всего таких специальных комбинаций 8: их еще называют escape-последовательностями, вот они:
    //  Код	    Описание
    //  \t	    Вставить символ табуляции
    //  \b	    Вставить символ возврата на один символ
    //  \n	    Вставить символ новой строки
    //  \r	    Вставить символ возврата каретки
    //  \f	    Вставить символ прогона страницы
    //  \'	    Вставить одинарную кавычку
    //  \"	    Вставить двойную кавычку
    //  \\	    Вставить обратный слеш

    //Символ табуляции – \t

    //Данный символ в тексте эквивалентен нажатию на клавиатуре клавиши Tab при наборе текста.
    //Он сдвигает следующий за ним текст с целью его выровнять.

    //Возврат на один символ назад – \b

    //Данный символ в тексте эквивалентен нажатию на клавиатуре клавиши Backspace при наборе текста.
    //Он удаляет последний выведенный символ перед ним:

    //Символ возврата каретки – \r

    //Этот символ переносит курсор в начало текущей строки, не меняя текста. Следующий выводимый текст будет перетирать существующий.

    //Символ прогона страницы – \f

    //Это символ дошел до нас из эпохи первых матричных принтеров.
    //Если подать такой символ на печать, это приводило к тому, что принтер просто прокручивал текущий лист,
    //не печатая текст, пока не начнется новый.
    //Сейчас бы мы назвали его разрыв страницы или новая страница.

    //Обратный слэш – \\

    //Ну а тут вообще все просто. Если мы используем обратную косую черту (обратный слэш) в тексте, чтобы экранировать символы,
    //то как тогда записать в текстовой строке сам символ косой черты?
    //Все просто: чтобы добавить в текст символ обратной косой черты, его нужно написать два раза подряд.


}