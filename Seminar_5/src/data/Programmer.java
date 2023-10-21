package data;

public class Programmer extends Employee {
    /**
     * Принцип единственной ответственности (Single Responsibility Principle)
     */
    public Programmer(String name, String serviceNumber, String dateBirth, Integer salary) {
        super(name, serviceNumber, dateBirth, salary);
    }
    public Programmer() {
        super();
    }
}