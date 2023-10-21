package data;

public class Analytic extends Employee {
    /**
     * Принцип единственной ответственности (Single Responsibility Principle)
     */
    public Analytic(String name, String serviceNumber, String dateBirth, Integer salary) {
        super(name, serviceNumber, dateBirth, salary);
    }
    public Analytic() {
        super();
    }
}