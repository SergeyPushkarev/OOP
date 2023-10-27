package View;

public class Text {
    /**
     * Выводит в терминал меню с предложением произвести вычисления с целыми/дробными или комплексными числами
     */
    public static void welcome() {
        System.out.println("Меню калькулятора. Выберите действие: \n" +
                "1. Операции над комплексными числами \n" +
                "2. Просмотреть историю вычислений \n" +
                "3. Выход из калькулятора");
    }

    /**
     * Выводит в терминал меню с возможными операциями
     */
    public static void allOperations() {
        System.out.println("Доступные операции\n" +
                "1. Сложение \n" +
                "2. Вычитание \n" +
                "3. Умножение \n" +
                "4. Деление");
    }

    /**
     * Выводит в терминал: "Введите число А"
     */
    public static void inputNumberA() {
        System.out.println("Введите число А");
    }
    /**
     * Выводит в терминал: "Введите число В"
     */
    public static void inputNumberB() {
        System.out.println("Введите число B");
    }
    /**
     * Выводит в терминал: "Введите число А2"
     */
    public static void inputNumberA2() {
        System.out.println("Введите число А2");
    }
    /**
     * Выводит в терминал: "Введите число В2"
     */
    public static void inputNumberB2() {
        System.out.println("Введите число B2");
    }
    /**
     * Выводит в терминал: "Выберите операцию с числами типа (А + Вi) и (А2 + В2i)"
     */
    public static void chooseComplexOperation() {
        System.out.println("Выберите операцию с комплексными числами типа (А + Вi) и (А2 + В2i)");
    }
    public static void complexSubtractionAB(){
        System.out.println("Вычитание (А + Вi) - (A2 + B2i)");
    }
    /**
     * Выводит в терминал: "Сложение (A + Bi) + (A2 + B2i)"
     */
    public static void complexSumAB(){
        System.out.println("Сложение (А + Вi) + (A2 + B2i)");
    }
    /**
     * Выводит в терминал: "Умножение (A + Bi) * (A2 + B2i)
     */
    public static void complexMultiplicationAB(){
        System.out.println("Умножение (А + Вi) * (A2 + B2i)");
    }
    /**
     * Выводит в терминал: "Деление (A + Bi) / (A2 + B2i)"
     */
    public static void complexDivisionAB(){
        System.out.println("Деление (А + Вi) / (A2 + B2i)");
    }

    /**
     * Выводит в терминал: "Результат вычислений записан в историю"
     */
    public static void loadedToHistory(){
        System.out.println("Результат вычислений записан в историю");
    }

    /**
     * Выводит в терминал сообщение, что записей нет
     */
    public static void noCalculations(){
        System.out.println("Вы еще не произвели никаких вычислений, поэтому записей нет");
    }

    /**
     * Выводит в терминал: "Такого числа нет в списке, выберите число из предложенного в меню"
     */
    public static void noThatNumber() {
        System.out.println("Такого числа нет в списке, выберите число из предложенного в меню");
    }
}