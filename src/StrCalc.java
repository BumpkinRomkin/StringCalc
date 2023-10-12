import java.util.Scanner;

public class StrCalc {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        String vvodUsera = vvod.nextLine();
        String[] mas;
        if (vvodUsera.contains(" + ")) {
            mas = vvodUsera.split(" \\+ ");
            System.out.println(Plus.plus(mas[0], mas[1]));
        } else if (vvodUsera.contains(" - ")) {
            mas = vvodUsera.split(" - ");
            System.out.println(Minus.minus(mas[0], mas[1]));
        } else if (vvodUsera.contains(" / ")) {
            mas = vvodUsera.split(" / ");
            System.out.println(Divide.divide(mas[0], mas[1]));
        } else if (vvodUsera.contains(" * ")) {
            mas = vvodUsera.split(" \\* ");
            System.out.println(Multiple.multiple(mas[0], mas[1]));
        } else {
            throw new RuntimeException("Неподдерживаемый арифметический знак.");
        }
        if (!mas[0].startsWith("\"") && !mas[0].endsWith("\"")) {
            throw new RuntimeException("Разрешено принимать на вход два аргумента выделенные двойными кавычками.");
        }
    }
    public static boolean isParsable(String a){
        try {
            Integer.parseInt(a);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}