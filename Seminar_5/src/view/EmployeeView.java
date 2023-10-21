package view;

import data.Employee;

import java.util.List;

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
    public void showResultTransfer(Employee employee) {
        if (employee != null) {
            System.out.println("Сотрудник успешно переведен на другую должность!");
        } else {
            System.out.println("Сотрудника не удалось перевести на другую должность!");
        }
    }
    public void showMenu() {
        System.out.println("\n[Информационная система сотрудников]  \n" +
                "Введите цифру для выбора действия или выхода: \n" +
                "1. Добавить сотрудника \n" +
                "2. Изменить сотрудника \n" +
                "3. Перевести сотрудника \n" +
                "4. Вывести список должностей \n" +
                "5. Вывести список сотрудников");
    }
    public void readListEmployee(List<Employee> employeeList) {
        if (employeeList.isEmpty()) {
            System.out.println("Список сотрудников пуст!");
            return;
        }
        int index = 0;
        System.out.println("\nСписок сотрудников: ");
        for (Employee employee : employeeList) {
            index++;
            System.out.println(index + ". " + employee.getName() + ". Должность: " + employee.getClass().getSimpleName() + ". Дата рождения: " + employee.getDateBirth() + ". Оклад: " + employee.getSalary());
        }
    }
}
