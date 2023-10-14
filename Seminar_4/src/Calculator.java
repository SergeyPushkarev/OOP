import java.util.List;

public class Calculator {
    public double sum(List<? extends Number> list) {
        double result = 0;
        for (Number number : list) {
            result += number.doubleValue();
        }
        return result;
    }
    public double div (List<? extends Number> list) {
        double result = list.get(0).doubleValue();
        list.remove(0);
        for (Number number : list) {
            if (number.equals(0)) {
                System.out.println("В списке есть 0. Деление на ноль невозможно!");
                return 0.0;
            }
            result /= number.doubleValue();
        }
        return result;
    }
    public double multi(List<? extends Number> list) {
        double result = list.get(0).doubleValue();
        list.remove(0);
        for (Number number : list) {
            result *= number.doubleValue();
        }
        return result;
    }
    public String binaryTranslate(GenBox<?> value) {
        String result = "";

        if (value.isTypeAString() || value.isTypeImplementANumber()) {
            result = value.transferToBinaryNotation();
        }
        else System.out.println("Передано не строка и не число! Перевод невозможен.");

        return result.toString();
    }
}
