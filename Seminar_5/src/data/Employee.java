package data;

/**
 * Принцип подстановки Барбары Лисков (Liskov’s Substitution Principle)
 */
public abstract class Employee {
    String name;
    String dateBirth;
    String serviceNumber;
    Integer salary;

    public Employee(String name, String serviceNumber, String dateBirth, Integer salary) {
        this.name = name;
        this.serviceNumber = serviceNumber;
        this.dateBirth = dateBirth;
        this.salary = salary;
    }
    public Employee() {
    }
    @Override
    public String toString() {
        return "(" + this.serviceNumber + ") " + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
