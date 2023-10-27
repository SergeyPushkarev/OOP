package Model;

import java.util.ArrayList;

public interface Calculate {
    /** sum() - Функция суммирует (A + B) для целых/дробных чисел и (A + Bi) + (A2 + B2i) для комплексных чисел
     */
    String sum(ArrayList<Number> list);

    /** subtraction() - Функция вычитает (A - B) для целых/дробных чисел и (A + Bi) - (A2 + B2i) для комплексных чисел
     */
    String subtraction(ArrayList<Number> list);

    /** division() - Функция делит число (A / B) для целых/дробных чисел и (A + Bi) / (A2 + B2i) для комплексных чисел
     */
    String division(ArrayList<Number> list);

    /** multiplication() - Функции умножает число (A * B) для целых/дробных чисел и (A + Bi) * (A2 + B2i) для комплексных чисел
     */
    String multiplication(ArrayList<Number> list);
}