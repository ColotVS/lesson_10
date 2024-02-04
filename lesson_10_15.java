public class lesson_10_15 {
    //В этой задаче тебе нужно выполнить проверку URL-адреса.

    //Простая схема URL-адреса выглядит так:
    //<сетевой протокол>://<название ресурса>.<домен>
    //Метод checkProtocol(String) проверяет, какой сетевой протокол (http или https) у URL-адреса,
    //полученного входящим параметром, и возвращает результат проверки — строку название сетевого протокола.
    //А метод checkDomain(String) проверяет, какой домен (com, net, org или ru) у URL-адреса, полученного входящим параметром,
    //и возвращает результат проверки — строку название домена.
    //Если URL-адрес начинается не с http или https, то результат будет — "неизвестный".
    //Если URL-адрес заканчивается не на com, net, org или ru, то результат будет — "неизвестный".
    //main не принимает участие в тестировании.

    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("https"))
        {
            String s = url.substring(0,5);
            return s;
        }
        else if (url.startsWith("http"))
        {
            String s = url.substring(0,4);
            return s;
        }
        else
            return "неизвестный";
    }

    public static String checkDomain(String url) {
        if (url.endsWith("com"))
        {
            String s = url.substring(url.length()-3,url.length());
            return s;
        }
        else if (url.endsWith("net"))
        {
            String s = url.substring(url.length()-3,url.length());
            return s;
        }
        else if (url.endsWith("org"))
        {
            String s = url.substring(url.length()-3,url.length());
            return s;
        }
        else if (url.endsWith("ru"))
        {
            String s = url.substring(url.length()-2,url.length());
            return s;
        }
        else
            return "неизвестный";
    }
}
