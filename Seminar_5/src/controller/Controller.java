package controller;

import data.Employee;
import service.DataService;
import service.EmployeeService;
import service.EmployeeTransfer;
import view.EmployeeView;
import view.PositionsView;

import java.util.Scanner;

public class Controller {
    static DataService employeeService;
    static EmployeeView employeeView;
    static PositionsView positionsView;
    static EmployeeTransfer employeeTransfer;

    public Controller() {
        this.employeeService = new EmployeeService();
        this.employeeView = new EmployeeView();
        this.positionsView = new PositionsView();
        this.employeeTransfer = new EmployeeService();
    }
    public static void init() {
        while(menu());
    }
    public static Boolean menu() {
        Scanner scan = new Scanner(System.in);
        employeeView.showMenu();

        int numberAction = scan.nextInt();
        switch (numberAction) {
            case 1:
                Employee user = employeeService.create();
                employeeView.showResultAdd(user);
                break;
            case 2,3:
                Employee employee = employeeService.getEmployee();
                employeeView.showResultEdit(employee);
                if(employee == null) {
                    break;
                }
                if (numberAction == 2) {
                    employeeService.edit(employee);
                } else {
                    Employee employeeNew = employeeTransfer.transfer(employee);
                    employeeView.showResultTransfer(employeeNew);
                    if(employeeNew == null) {
                        break;
                    }
                    employeeService.create(employeeNew);
                    employeeService.remove(employee);
                }
                break;
            case 4:
                positionsView.readPositions();
                break;
            case 5:
                employeeView.readListEmployee(employeeService.getEmployeeList());
                break;
            case 0:
                System.out.println("Всего доброго!");
                scan.close();
                return false;
            default:
                System.out.println("Ошибка! Введите цифру среди предложенных в меню!");
                break;
        }
        return true;
    }
}
