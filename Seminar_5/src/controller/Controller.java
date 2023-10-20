package controller;

import data.Employee;
import service.DataService;
import service.EmployeeService;
import view.EmployeeView;
import view.PositionsView;

import java.util.Scanner;

public class Controller {
    static DataService dataService;
    static EmployeeView employeeView;
    static PositionsView positionsView;

    public Controller() {
        this.dataService = new EmployeeService();
        this.employeeView = new EmployeeView();
        this.positionsView = new PositionsView();
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
                Employee user = dataService.create();
                employeeView.showResultAdd(user);
                break;
            case 2:
                System.out.println("Введите порядковый номер сотрудника: ");
                int numberEmployee = scan.nextInt(); scan.nextLine();
                Employee employee = dataService.getEmployee(numberEmployee);
                employeeView.showResultEdit(employee);
                if(employee == null) {
                    break;
                }
                dataService.edit(employee);
            case 3:
                positionsView.readPositions();
                break;
            case 4:
                employeeView.readMapEmployee(dataService.getEmployeeMap());
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
