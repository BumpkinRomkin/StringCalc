public class Plus {
    public static String plus(String a, String b){
        if(StrCalc.isParsable(a))   {
            throw new RuntimeException("Первый аргумент на вход должна быть строка.");
        }
        if(!b.startsWith("\"") | !b.endsWith("\"")){
            throw new RuntimeException("Разрешено принимать на вход два аргумента выделенные двойными кавычками.");
        }
        a = a.substring(1, a.length() - 1);
        b = b.substring(1, b.length() - 1);
        if(a.length() > 10 || b.length() > 10){
            throw new RuntimeException("Длина строки может быть до 10 символов включительно.");
        }
        return ("\"" + a + b + "\"");
    }
}
