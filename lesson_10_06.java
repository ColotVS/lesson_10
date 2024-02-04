public class lesson_10_06 {
    //Двоичная кодировка

    //В принципе в Java она используется не так уж часто: Java считается языком высокого уровня, полностью абстрагированным от железа, на котором выполняется. Действительно: не все ли вам равно, в каком виде хранятся и обрабатываются данные внутри компьютера?
    //И в Java, как в случае с восьмеричной кодировкой, есть способ задать литералы в двоичной кодировке.
    //Т.е. состоящие только из символов 0 и 1. Чтобы Java-компилятор понял, что в коде записан числовой литерал в двоичной кодировке,
    //а не просто десятичное число, состоящее из нулей и единиц, все двоичные литералы, предвещаются префиксом 0b (b от слова binary).

    //Код	                Примечания
    //int x = 0b100;        х равен 4: 1*4+0*2+0
    //int x = 0b1111;       х равен 15: 1*8+1*4+1*2+1
    //int x = 0b1111000111; х равен 967: 1*29+1*28+1*27+1*26+0*25+0*24+0*23+1*22+1*2+1;
    //int x = 0b12000;      Не скомпилируется: цифры 2 нет в двоичной кодировке.

    //Публичный статический метод toBinary(int) должен переводить целое число,
    //полученное в качестве входящего параметра, из десятичной системы счисления в двоичную и возвращать его строковое представление.
    //А публичный статический метод toDecimal(String) наоборот — из строкового представления двоичного числа в десятичное число.
    //Методы работают только с положительными числами и не пустыми строками. Если входящий параметр меньше или равен 0,
    //метод toBinary(int) возвращает пустую строку. Если входящий параметр — пустая строка или null,
    //то метод toDecimal(String) возвращает 0.
    //Твоя задача — реализовать эти методы.
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binaryNumber = "";
        if (decimalNumber <= 0) {
            return binaryNumber;
        }

        while (decimalNumber != 0) {
            binaryNumber = decimalNumber % 2 + binaryNumber;
            decimalNumber = decimalNumber / 2;
        }
        return binaryNumber;
    }

    public static int toDecimal(String binaryNumber) {
        int decimalNumber = 0;
        if (binaryNumber == null) {
            return decimalNumber;
        }

        for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - 1 - i;
            int value = Character.getNumericValue(binaryNumber.charAt(index));
            decimalNumber += (int) (value * Math.pow(2, i));
        }
        return decimalNumber;
    }
}
