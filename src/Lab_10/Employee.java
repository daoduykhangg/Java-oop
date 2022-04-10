package Lab_10;

import java.util.List;

public abstract class Employee {
    protected int salary;

    public abstract int getSalary();

    public static void totalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        System.out.println("totalSalary = " + totalSalary);
    }
}
