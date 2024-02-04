public class lesson_10_07 {
    //Шестнадцатеричная кодировка

    //Одной шестнадцатеричной цифре соответствует ровно 4 бита.
    //Грубо говоря, каждые 4 бита теперь можно записать одной шестнадцатеричной цифрой.
    //У шестнадцатеричной кодировки тоже есть свой уникальный префикс — 0x.

    //Десятичное число	    Двоичная запись	    Шестнадцатеричная запись
    //17	                0b00010001	        0x11
    //41	                0b00101001	        0x29
    //85	                0b01010101	        0x55
    //256	                0b100000000	        0x100

    //В качестве 6 недостающих цифр взяли 6 первых букв английского алфавита: A (10), B (11), C (12), D (13), E (14), F (15).

    //Шестнадцатеричная запись	    Двоичная запись	    Десятичное число
    //0x1	                        0b00000001	        1
    //0x9	                        0b00001001	        9
    //0xA	                        0b00001010	        10
    //0xB	                        0b00001011	        11
    //0xC	                        0b00001100	        12
    //0xD	                        0b00001101	        13
    //0xE	                        0b00001110	        14
    //0xF	                        0b00001111	        15
    //0x1F	                        0b00011111	        31
    //0xAF	                        0b10101111	        175
    //0xFF	                        0b11111111	        255
    //0xFFF	                        0b111111111111	    4095

    //Публичный статический метод toHex(int) должен переводить целое число, полученное в качестве входящего параметра,
    //из десятичной системы счисления в шестнадцатеричную и возвращать его строковое представление.
    //А публичный статический метод toDecimal(String) наоборот — из строкового представления шестнадцатеричного числа в десятичное число.
    //Методы работают только с положительными числами и не пустыми строками.
    //Если входящий параметр меньше или равен 0, метод toHex(int) возвращает пустую строку.
    //Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
    //Твоя задача реализовать эти методы.
    //Также в классе есть константа HEX, которая содержит в себе все символы, используемые в шестнадцатеричной системе.

    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hexNumber = "";
        if (decimalNumber <= 0) {
            return hexNumber;
        }

        while (decimalNumber != 0) {
            hexNumber = HEX.charAt(decimalNumber % 16) + hexNumber;
            decimalNumber = decimalNumber / 16;
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        int decimalNumber = 0;
        if (hexNumber == null) {
            return decimalNumber;
        }

        for (int i = 0; i < hexNumber.length(); i++) {
            decimalNumber = 16 * decimalNumber + HEX.indexOf(hexNumber.charAt(i));
        }
        return decimalNumber;
    }
}
