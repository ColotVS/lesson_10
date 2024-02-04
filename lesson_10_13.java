public class lesson_10_13 {
    //Устройство класса String

    //Класс String — самый популярный класс в Java после типа int. Он используется абсолютно везде.
    //У него есть куча полезных методов, которые лучше знать, чем не знать.

    //Класс String — единственный класс, кроме примитивных типов, литералы которого можно использовать в switch;
    //компилятор по-особому обрабатывает сложение строк и объектов;
    //объекты String по-особому хранятся в памяти. В общем, класс String — это очень специфический класс.

    //Также у класса String есть куча классов-сателлитов, цель которых — еще больше упростить работу со строками в Java.
    //Когда вы изучите все это, вам действительно станет значительно проще делать многие вещи.
    //Ну а начнем мы с самого сердца этой экосистемы — с устройства класса String.

    //Массив символов
    //
    //А устроен класс String на самом деле очень просто: внутри него находится массив символов (char), который хранит все символы строки.
    //На самом деле все немного не так. Т.к. класс String очень важен, в нем используется очень много оптимизаций,
    //и данные хранятся внутри не в виде массива символов, а просто в виде массива байтов.

    //Методы класса String
    //У класса String очень много методов: одних только конструкторов у него 18 штук! Поэтому ниже мы приведем только самые основные из них:

    //Методы	                                        Описание
    //int length()                                      Возвращает количество символов в строке
    //boolean isEmpty()                                 Проверяет, что строка == пустая строка
    //boolean isBlank()                                 Проверяет, что в строке — только whitespace-символы: пробел, tab, enter и т.п.
    //char charAt(int index)                            Возвращает символ, который стоит на index-позиции в строке.
    //char[] toCharArray()                              Возвращает массив символов (копию), из которых состоит строка
    //byte[] getBytes()                                 Преобразует строку в набор байт и возвращает массив байт.
    //String[] split(String regex)                      Разделяет строку на несколько подстрок.
    //String join(CharSequence delimiter, elements)     Склеивает вместе несколько подстрок
    //String intern()                                   Помещает строку в пул StringPool.


}
