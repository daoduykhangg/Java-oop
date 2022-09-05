package old.Lab_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatorSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        enterEmployees(scan, employeeList);

        Employee.totalSalary(employeeList);
    }

    private static void enterEmployees(Scanner scan, List<Employee> employeeList) {
        boolean isContinuing = true;
        while (isContinuing) {
            printMenu();
            System.out.print("Please, enter number: ");
            int option = scan.nextInt();
            if (option == 1) {
                inputEmployee(employeeList, scan);
            } else if (option == 0) {
                isContinuing = false;
            } else {
                System.out.println("Please choose valid option!");
            }
        }
    }

    private static void printMenu() {
        System.out.println("**************MENU***************");
        System.out.println("1. Input Employee");
        System.out.println("0. Exist!");
    }

    private static void inputEmployee(List<Employee> employeeList, Scanner scan) {
        System.out.print("Please enter type of employee: ");
        String type = scan.next();
        if (type.equalsIgnoreCase("f")) {
            Employee fulltimeEmployee = new FulltimeEmployee();
            employeeList.add(fulltimeEmployee);
        } else if (type.equalsIgnoreCase("c")) {
            Employee contractEmployee = new ContractEmployee();
            employeeList.add(contractEmployee);
        } else {
            System.out.println("Type of employee doesn't exist!");
        }

    }
}
