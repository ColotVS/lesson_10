import java.util.Arrays;
import java.util.StringTokenizer;

public class lesson_10_20 {
    //Используя StringTokenizer раздели query на части по разделителю delimiter.

    //Пример:
    //getTokens("java.util.stream", "\\.")
    //возвращает массив строк
    //{"java", "util", "stream"}

    //Hint: решить задачу поможет метод countTokens().

    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query,delimiter);
        String[] result = new String[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            result[i++] = stringTokenizer.nextToken();
        }
        return result;

    }
}
