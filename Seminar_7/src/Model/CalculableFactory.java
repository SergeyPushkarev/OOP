package Model;

import View.CalculationView;

public class CalculableFactory {
    public Calculate createCalculate() {
        return new FunctionsComplex();
    }
    public CalculationView createCalculateView() {
        return new CalculationView();
    }
    public Logger createLogger() {
        return new Outter();
    }
}
