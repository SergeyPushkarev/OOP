package service;

import data.Employee;

/**
 * Принцип разделения интерфейса (Interface Segregation Principle)
 * Создал этот интерфейс, чтобы показать этот принцип. Этот интерфейс позволяет перевести сотрудника с одной должности на другую.
 * Таким образом, если появится дополнительный класс, например "физическое лицо", то функции этого интерфейса будут не нужны для физ. лиц
 */
public interface EmployeeTransfer {
    Employee transfer(Employee employee);
}