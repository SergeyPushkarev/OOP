import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("120 + 55.55 = " + calculator.sum(new ArrayList<>(Arrays.asList(120, 55.55))));
        System.out.println("120 / 6 / 5 = " + calculator.div(new ArrayList<>(Arrays.asList(120,6,5))));
        System.out.println("5 * 8 * 4 = " + calculator.multi(new ArrayList<>(Arrays.asList(5,8,4))));

        System.out.println();
        System.out.println("Бинарный перевод из шестнадцатиричного кода '8E' = " + calculator.binaryTranslate(new GenBox<>("8E")));
        System.out.println("Бинарный перевод из шестнадцатиричного кода '4F5B' = " + calculator.binaryTranslate(new GenBox<>("4F5B")));
        System.out.println("Бинарный перевод из десятичного кода '756' = " + calculator.binaryTranslate(new GenBox<>(756)));
        System.out.println("Бинарный перевод из десятичного кода '89.375' = " + calculator.binaryTranslate(new GenBox<>(89.375)));
        System.out.println("Бинарный перевод из десятичного кода '10.0' = " + calculator.binaryTranslate(new GenBox<>(10.0)));
    }
}