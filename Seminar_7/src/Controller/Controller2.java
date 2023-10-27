package Controller;

import Model.CalculableFactory;
import Service.Operations;
import Model.FunctionsComplex;
import Model.Logger;
import Model.Outter;
import View.CalculationView;
import View.Text;

import java.util.Scanner;

public class Controller2 {

    /** menu() - Функция запускает меню с выбором
     * вариантов вычислений с комплексными числами
     */
    public void menu() {
        CalculableFactory calculableFactory = new CalculableFactory();

        Scanner cs = new Scanner(System.in);
        Operations operations;
        Logger logger = calculableFactory.createLogger();

        boolean flag = true;
        while (flag) {
            Text.welcome();

            int num = cs.nextInt();

            switch (num) {
                case 1 -> {
                    operations = new Operations(calculableFactory.createCalculateView(), calculableFactory.createCalculate(), logger);
                    operations.subMenuComplex();
                }
                case 2 -> logger.readHistory();
                case 3 -> flag = false;
                default -> Text.noThatNumber();
            }

        }

    }
}