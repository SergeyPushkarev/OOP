package service;

import data.Analytic;
import data.Positions;
import data.Programmer;
import data.Employee;

import java.util.*;

public class EmployeeService implements DataService, EmployeeTransfer {
    List<Employee> employeeList = new ArrayList<>();
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
                employeeList.add(programmer);
                return programmer;
            }
            case 2 -> {
                Analytic analytic = new Analytic(name, serviceNumber, dateBirth, salary);
                employeeList.add(analytic);
                return analytic;
            }
        }
        return null;
    }
    @Override
    public void create(Employee employee) {
        employeeList.add(employee);
    }
    @Override
    public void remove(Employee employee) {
        employeeList.remove(employee);
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
    public Employee getEmployee() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите порядковый номер сотрудника: ");
        int numberEmployee = scan.nextInt() - 1; scan.nextLine();
        return employeeList.get(numberEmployee);
    }
    @Override
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public Employee transfer(Employee employee) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите порядковый номер новой должности: ");
        int numberPost = scan.nextInt() - 1; scan.nextLine();
        if (Objects.equals(Positions.values()[numberPost].toString(), employee.getClass().getSimpleName())) {
            System.out.println("Вы ввели номер той же самой должности, что и сейчас у сотрудника!");
            return null;
        }

        switch (numberPost) {
            case 0 -> {
                Programmer programmer = new Programmer(employee.getName(), employee.getServiceNumber(), employee.getDateBirth(), employee.getSalary());
                return programmer;
            }
            case 1 -> {
                Analytic analytic = new Analytic(employee.getName(), employee.getServiceNumber(), employee.getDateBirth(), employee.getSalary());
                return analytic;
            }
        }
        return null;
    }
}