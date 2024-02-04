public class lesson_10_05 {
    //Кодировки

    //Восьмеричная кодировка

    //С кодировкой из 8 цифр проще всего: они просто отбросили цифры 8 и 9 и получили восьмеричную кодировку (восьмеричную систему счисления).
    //И вы можете, да-да, задавать числовые литералы в восьмеричной системе. Если, конечно, вам это очень нужно.
    //Это проще, чем кажется. Вам нужно просто перед числом написать цифру 0.
    //Другими словами, любой целочисленный литерал, начинающийся с 0, считается Java восьмеричным.

    //Код	            Примечания
    //int x = 015;      х равен 13: 1*8+5
    //int x = 025;      х равен 21: 2*8+5
    //int x = 0123;     х равен 83: 1*64+2*8+3 == 1*8^2+2*8^1+3*8^0
    //int x = 078;      Не скомпилируется: цифры 8 нет в восьмеричной кодировке.

    //Публичный статический метод toOctal(int) должен переводить целое число,
    //полученное в качестве входящего параметра, из десятичной системы счисления в восьмеричную.
    //А публичный статический метод toDecimal(int) наоборот — из восьмеричной в десятичную.
    //Методы работают только с положительными числами. Если входящий параметр меньше или равен 0, методы возвращают 0.
    //Твоя задача — реализовать эти методы.

    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int i = 0;
        int Octal = 0;
        while (decimalNumber>0){
            Octal = (int) (Octal+(decimalNumber%8)*Math.pow(10,i));
            decimalNumber = decimalNumber/8;
            i++;
        }
        return Octal;
    }

    public static int toDecimal(int octalNumber) {
        int i = 0;
        int Decimal = 0;
        while (octalNumber>0)
        {
            Decimal = (int)(Decimal + (octalNumber%10)*Math.pow(8,i));
            octalNumber = octalNumber/10;
            i++;
        }
        return Decimal;
    }
}
