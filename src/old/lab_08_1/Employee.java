package old.lab_08_1;

import java.util.List;

public class Employee {
    protected int salary;

    public int getSalary() {
        return salary;
    }

    public static void totalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        System.out.println("totalSalary = " + totalSalary);
    }
}
