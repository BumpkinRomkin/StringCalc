public class Multiple {
    public static String multiple(String a, String b){
        int c;
        StringBuilder d = new StringBuilder();
        a = a.substring(1, a.length() - 1);
        if(a.length() > 10){
            throw new RuntimeException("Длина строки может быть до 10 символов включительно.");
        }
        if(StrCalc.isParsable(b)){
            c = Integer.parseInt(b);
        }
        else {
            throw new RuntimeException("Можно умножать только на положительные целые числа.");
        }
        if(c > 10){
            throw new RuntimeException("Число подаваемое на вход может быть от 1 до 10 включительно.");
        }
        if(c < 1){
            throw new RuntimeException("Можно умножать только на положительные целые числа.");
        }
        for (int i = 0; i < c; i++) {
            d.append(a);
        }
        if(d.length() > 40){
            return ("\"" + d.substring(0, 40) + "..." + "\"");
        } else return ("\"" + d + "\"");
    }
}
