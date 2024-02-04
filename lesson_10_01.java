public class lesson_10_01 {
    //Литералы в Java

    //Данные, вписанные прямо в код программы, называют литералами.
    //В данном случае речь идет не о любых данных, а о значениях примитивных типов и типе String.
    //
    //Например, у вас есть код:
    //int a = 5;
    //int b = a + 10;
    //String s = "Sum=" + (a + b);
    //Литералы в этом коде — это число 5, число 10 и строка Sum=.

    //В языке Java тип есть у всего, включая литералы.
    //Все целочисленные литералы (целые числа) в коде имеют тип int. Тип int является стандартным типом целых чисел в Java.

    //При этом, если вы в своем коде решите присвоить целочисленный литерал переменной типа byte или short, проблем не возникнет.
    //Надо лишь чтобы значение литерала лежало внутри диапазона доступных значений типа переменной.

    //Компилятор в Java достаточно умный, чтобы понять, что переменной типа byte можно присвоить целочисленный литерал 100,
    //и проблем не возникнет.

    //Код	            Описание
    //int a = 300;      Скомпилируется отлично.
    //byte a = 100;     Скомпилируется отлично.
    //byte a = 300;     Будет ошибка компиляции: максимальное значение типа byte равно 127.

    //В коде также можно писать литералы типа long. Для этого в конце целого числа нужно написать латинскую букву L или l.

    //Код	                    Описание
    //long a = 3000000000L;     Скомпилируется отлично.
    //long a = 3000000000;      Ошибка компиляции: 3 миллиарда слишком большое число для литерала типа int.
    //int a = 3000000000L;      Ошибка компиляции: у литерала тип long, а у переменной тип int.
    //К тому же, 3 миллиарда больше, чем максимальное число типа int.

    //Чтобы упростить читаемость кода (а это важно!),
    //в Java разрешили вставлять в числовые литералы символы подчеркивания (на значение числа они не влияют).

    //Пример выше можно переписать с использованием символов подчеркивания, и он станет немного понятнее:
    //Код	                        Описание
    //long a = 3_000_000_000L;      Скомпилируется отлично.
    //long a = 3_000_000_000;       Ошибка компиляции: 3 миллиарда слишком большое число для литерала типа int.
    //int a = 3_000_000_000L;       Ошибка компиляции: у литерала тип long, а у переменной тип int.
    //К тому же 3, миллиарда больше, чем максимальное число типа int.

    //В классе Solution объявлены четыре публичных поля, которые соответствуют четырем целочисленным типам.
    //При объявлении эти поля инициализируются разными значениями — целочисленными литералами.
    //Но программа не компилируется, и нужно это исправить. Для этого внеси минимальные изменения в значения полей так,
    //чтобы тип переменной соответствовал типу целочисленного литерала.
    //Можно изменять только знак и тип литерала, не изменяя цифры и их порядок.

    public byte b = -128;
    public short s = -32768;
    public int i = 1_234_567_890;
    public long l = 2_345_678_900L;
}