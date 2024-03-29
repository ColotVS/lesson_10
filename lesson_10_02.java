public class lesson_10_02 {
    //Литералы вещественных чисел

    //В коде можно задавать не только целочисленные, но и литералы с плавающей точкой (вещественные числа).
    //Собственно, правило очень простое: если в коде есть число и в его записи есть точка, это число — литерал с плавающей точкой.
    //И не просто литерал, а литерал с типом double.
    //Можно создать и литерал типа float, но для этого к числу в конце нужно приписать букву F (или f).

    //Код	                Описание
    //double a = 100.0;     Скомпилируется отлично.
    //double a = 100.;      Скомпилируется отлично.
    //double a = .0;        Скомпилируется отлично.
    //float a = 100.0f;     Скомпилируется отлично.
    //float a = 100.0;      Будет ошибка компиляции: переменная типа float, литерал типа double.

    //Можно явно превратить целочисленный литерал в литерал типа float или double,
    //просто приписав к нему суффикс F (для float) или D (для double).

    //Код	                Описание
    //double a = 100D;      Скомпилируется отлично.
    //float a = 100F;       Скомпилируется отлично.
    //int a = 300D;         Будет ошибка компиляции: переменная типа int, литерал типа double.

    //В классе Solution объявлены и проинициализированы семь публичных полей.
    //Они инициализируются разными значениями — литералами с плавающей точкой. Но программа не компилируется, и нужно это исправить.
    //Для этого измени типы полей, чтобы они соответствовали значениям. Имена и значения полей не изменяй.

    public double a = 0.;
    public double b = .0;
    public double c = 100D;
    public double d = 100.0;
    public double e = 1.11E5;
    public float f = 200F;
    public float g = 0.F;
}

