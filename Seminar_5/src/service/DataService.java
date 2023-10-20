package service;

import data.Employee;

import java.util.Map;

public interface DataService {
    Employee create();
    Employee getEmployee (Integer numberEmployee);
    Map<Integer, Employee> getEmployeeMap();

    void edit(Employee employee);
}
