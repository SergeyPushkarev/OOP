package service;

import data.Analytic;
import data.Programmer;
import data.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeService implements DataService {
    Map<Integer, Employee> employeeMap = new HashMap<>();

    @Override
    public Employee create() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите порядковый номер должности сотрудника: ");
        int numberPost = scan.nextInt(); scan.nextLine();
        System.out.println("Введите имя: ");
        String name = scan.nextLine();
        System.out.println("Введите табельный номер: ");
        String serviceNumber = scan.nextLine();
        System.out.println("Введите дату рождения: ");
        String dateBirth = scan.nextLine();
        System.out.println("Введите оклад: ");
        int salary = scan.nextInt(); scan.nextLine();

        switch (numberPost) {
            case 1 -> {
                Programmer programmer = new Programmer(name, serviceNumber, dateBirth, salary);
                employeeMap.put(employeeMap.size() + 1, programmer);
                return programmer;
            }
            case 2 -> {
                Analytic analytic = new Analytic(name, serviceNumber, dateBirth, salary);
                employeeMap.put(employeeMap.size() + 1, analytic);
                return analytic;
            }
        }
        return null;
    }

    public void edit(Employee employee) {
        Scanner scan = new Scanner(System.in);
        String newValue = "";

        System.out.println("Для редактирования полей сотрудников введите новое значение, либо оставьте пустым, чтобы оставить неизменным.");

        System.out.println("[ИМЯ] " + employee.getName() + ": ");
        newValue = scan.nextLine();
        if(!newValue.isEmpty()) {
            employee.setName(newValue);
        }

        System.out.println("[ТАБЕЛЬНЫЙ НОМЕР] " + employee.getServiceNumber() + ": ");
        newValue = scan.nextLine();
        if(!newValue.isEmpty()) {
            employee.setServiceNumber(newValue);
        }

        System.out.println("[ДАТА РОЖДЕНИЯ] " + employee.getDateBirth() + ": ");
        newValue = scan.nextLine();
        if(!newValue.isEmpty()) {
            employee.setDateBirth(newValue);
        }

        System.out.println("[ОКЛАД] " + employee.getSalary() + ": ");
        newValue = scan.nextLine();
        if(!newValue.isEmpty()) {
            employee.setSalary(Integer.parseInt(newValue));
        }
    }

    @Override
    public Employee getEmployee(Integer numberEmployee) {
        return employeeMap.get(numberEmployee);
    }

    @Override
    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }
}
