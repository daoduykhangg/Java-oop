package homework.lab_08_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatorSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        enterEmployees(scan, employeeList, 50000, 40000);

        Employee.totalSalary(employeeList);
    }

    private static void enterEmployees(Scanner scan, List<Employee> employeeList, int fulltimeSalary, int contractSalary) {
        boolean isContinuing = true;
        while (isContinuing) {
            printMenu();
            System.out.print("Please, enter number: ");
            int option = scan.nextInt();
            if (option == 1) {
                inputEmployee(employeeList, scan, fulltimeSalary, contractSalary);
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

    private static void inputEmployee(List<Employee> employeeList, Scanner scan, int fulltimeSalary, int contractSalary) {
        System.out.print("Please enter type of employee: ");
        String type = scan.next();
        if (type.equalsIgnoreCase("f")) {
            Employee fulltimeEmployee = new FulltimeEmployee(fulltimeSalary);
            employeeList.add(fulltimeEmployee);
        } else if (type.equalsIgnoreCase("c")) {
            Employee contractEmployee = new ContractEmployee(contractSalary);
            employeeList.add(contractEmployee);
        } else {
            System.out.println("Type of employee doesn't exist!");
        }

    }
}
