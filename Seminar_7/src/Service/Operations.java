package Service;

import Model.Calculate;
import Model.Logger;

import View.Text;
import View.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Operations {

    public View print;
    public Calculate functions;
    public Logger logger;

    public Operations(View print, Calculate functions,  Logger logger) {
        this.print = print;
        this.functions = functions;
        this.logger = logger;
    }

    /** subMenuComplex() - Функция предоставляет выбрать операцию с комплексными числами
     * (сложение, вычитание, умножение, деление)
     */
    public void subMenuComplex() {
        Scanner cs = new Scanner(System.in);
        Text.chooseComplexOperation();
        Text.allOperations();

        int oper = cs.nextInt();
        int numA;
        int numB;
        int numA2;
        int numB2;
        switch (oper) {
            case 1 -> {
                Text.complexSumAB();
                Text.inputNumberA();
                numA = cs.nextInt();
                Text.inputNumberB();
                numB = cs.nextInt();
                Text.inputNumberA2();
                numA2 = cs.nextInt();
                Text.inputNumberB2();
                numB2 = cs.nextInt();
                logger.writeHistory(logger.dateTime() +
                        functions.sum(new ArrayList<>(Arrays.asList(numA, numB, numA2, numB2))));
                print.printResult(functions.sum(new ArrayList<>(Arrays.asList(numA, numB, numA2, numB2))));
                Text.loadedToHistory();
            }
            case 2 -> {
                Text.complexSubtractionAB();
                Text.inputNumberA();
                numA = cs.nextInt();
                Text.inputNumberB();
                numB = cs.nextInt();
                Text.inputNumberA2();
                numA2 = cs.nextInt();
                Text.inputNumberB2();
                numB2 = cs.nextInt();
                logger.writeHistory(logger.dateTime() +
                        functions.subtraction(new ArrayList<>(Arrays.asList(numA, numB, numA2, numB2))));
                print.printResult(functions.subtraction(new ArrayList<>(Arrays.asList(numA, numB, numA2, numB2))));
                Text.loadedToHistory();
            }
            case 3 -> {
                Text.complexMultiplicationAB();
                Text.inputNumberA();
                numA = cs.nextInt();
                Text.inputNumberB();
                numB = cs.nextInt();
                Text.inputNumberA2();
                numA2 = cs.nextInt();
                Text.inputNumberB2();
                numB2 = cs.nextInt();
                logger.writeHistory(logger.dateTime() +
                        functions.multiplication(new ArrayList<>(Arrays.asList(numA, numB, numA2, numB2))));
                print.printResult(functions.multiplication(new ArrayList<>(Arrays.asList(numA, numB, numA2, numB2))));
                Text.loadedToHistory();
            }
            case 4 -> {
                Text.complexDivisionAB();
                Text.inputNumberA();
                numA = cs.nextInt();
                Text.inputNumberB();
                numB = cs.nextInt();
                Text.inputNumberA2();
                numA2 = cs.nextInt();
                Text.inputNumberB2();
                numB2 = cs.nextInt();
                logger.writeHistory(logger.dateTime() +
                        functions.division(new ArrayList<>(Arrays.asList(numA, numB, numA2, numB2))));
                print.printResult(functions.division(new ArrayList<>(Arrays.asList(numA, numB, numA2, numB2))));
                Text.loadedToHistory();
            }
            default -> Text.noThatNumber();
        }
    }
}