public class lesson_10_18 {
    //Создание подстрок

    //Кроме сравнения строк и поиска подстрок, есть еще одно очень популярное действие — получение подстроки из строки.
    //В предыдущем примере вы как раз видели вызов метода substring(), который возвращал часть строки.
    //Вот список из 8 методов получения подстрок из текущей строки:

    //Методы	                                            Описание
    //String substring(int beginIndex, int endIndex)        Возвращает подстроку, заданную интервалом символов beginIndex..endIndex.
    //String repeat(int count)                              Повторяет текущую строку count раз
    //String replace(char oldChar, char newChar)            Возвращает новую строку: заменяет символ oldChar на символ newChar
    //String replaceFirst(String regex, String replacement) Заменяет в текущей строке подстроку, заданную регулярным выражением.
    //String replaceAll(String regex, String replacement)   Заменяет в текущей строке все подстроки, совпадающие с регулярным выражением.
    //String toLowerCase()                                  Преобразует строку к нижнему регистру
    //String toUpperCase()                                  Преобразует строку к верхнему регистру
    //String trim()                                         Удаляет все пробелы в начале и конце строки

    //Реализуй метод changePath(String, String) так, чтобы он заменял версию jdk в пути, полученном первым параметром метода,
    //на версию, полученную вторым параметром, и возвращал новый путь.
    //Версия jdk начинается со строки "jdk" и заканчивается на "/".
    //Пример:
    //путь — "/usr/java/jdk1.8/bin/"
    //версия jdk — "jdk-13"
    //Метод changePath(путь, версия jdk) должен вернуть путь — "/usr/java/jdk-13/bin/".

    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int indexBegin = path.indexOf("jdk");
        int indexEnd = path.indexOf("/", indexBegin+1);
        String first = path.substring(0,indexBegin);
        String two = path.substring(indexEnd);
        return first + jdk + two;
    }
}
