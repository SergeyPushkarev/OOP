package view;

import data.Employee;

import java.util.Map;

public class EmployeeView {

    public void showResultAdd(Employee employee) {
        if(employee != null) {
            System.out.println("Сотрудник был добавлен: " + employee);
        } else {
            System.out.println("Введен неверный номер должности!");
        }
    }
    public void showResultEdit(Employee employee) {
        if(employee != null) {
            System.out.println("Найден сотрудник: " + employee);
        } else {
            System.out.println("Сотрудник по этому номеру не был найден!");
        }
    }
    public void showMenu() {
        System.out.println("\n[Информационная система сотрудников]  \n" +
                "Введите цифру для выбора действия или выхода: \n" +
                "1. Добавить сотрудника \n" +
                "2. Изменить сотрудника \n" +
                "3. Вывести список должностей \n" +
                "4. Вывести список сотрудников");
    }
    public void readMapEmployee(Map<Integer, Employee> employeeMap) {
        if (employeeMap.isEmpty()) {
            System.out.println("Список сотрудников пуст!");
            return;
        }
        System.out.println("\nСписок сотрудников: ");
        for (Map.Entry entry : employeeMap.entrySet()) {
            Employee currentEmployee = (Employee) entry.getValue();
            System.out.println(entry.getKey() + ". " + currentEmployee.getName() + ". Дата рождения: " + currentEmployee.getDateBirth() + ". Оклад: " + currentEmployee.getSalary());
        }
    }
}
