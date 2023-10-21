package service;

import data.Employee;

import java.util.List;

/**
 * Принцип открытости/закрытости (Open Closed Principle)
 * Принцип инверсии зависимостей (Dependency Inversion Principle)
 */
public interface DataService {
    Employee create();
    void create(Employee employee);
    void remove(Employee employee);
    Employee getEmployee();
    List<Employee> getEmployeeList();
    void edit(Employee employee);
}
