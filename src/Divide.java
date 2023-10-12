public class Divide {
    public static String divide(String a, String b){
        int c;
        String d = "";
        a = a.substring(1, a.length() - 1);
        if(a.length() > 10){
            throw new RuntimeException("Длина строки может быть до 10 символов включительно.");
        }
        if(StrCalc.isParsable(b)){
            c = Integer.parseInt(b);
        }
        else {
            throw new RuntimeException("Можно делить только на положительные целые числа.");
        }
        if(c > 10){
            throw new RuntimeException("Число подаваемое на вход может быть от 1 до 10 включительно.");
        }
        if(c < 0){
            throw new RuntimeException("Можно делить только на положительные целые числа.");
        }
        try {
            d = a.substring(0, a.length() / c);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Нельзя делить на ноль. Даже строки.");
        }
        return ("\"" + d + "\"");
    }
}
