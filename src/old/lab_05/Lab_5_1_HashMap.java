package old.lab_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Lab_5_1_HashMap {
    public static void main(String[] args) {
        boolean isContinuing = true;
        Map<Integer, String> studentsInfo = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        while (isContinuing) {
            printMenu();
            System.out.print("Please choose a option: ");
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    inputStudentInfo(scan, studentsInfo);
                    break;
                case 2:
                    findStudentById(scan, studentsInfo);
                    break;
                case 0:
                    isContinuing = false;
                    break;
                default:
                    System.out.println("Please choose a valid option again!");
            }
        }
    }

    public static void printMenu() {
        System.out.println("***************Menu***************");
        System.out.println("1. Input student info");
        System.out.println("2. Find Student by ID");
        System.out.println("0. Exit!");
    }

    public static void inputStudentInfo(Scanner scan, Map<Integer, String> studentInfo) {
        System.out.print("Enter Student Id: ");
        int studentId = scan.nextInt();
        System.out.print("Enter Student Name: ");
        String studentName = scan.next();
        studentInfo.put(studentId, studentName);
    }

    public static void findStudentById(Scanner scan, Map<Integer, String> studentInfo) {
        int count = 0;
        System.out.print("Enter Student Id: ");
        int studentId = scan.nextInt();
        Set<Integer> studentIds = studentInfo.keySet();
        for (Integer id : studentIds) {
            if (id.equals(studentId)) {
                System.out.println("Student Name: " + studentInfo.get(studentId));
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Student does NOT existing!");
        }
    }
}
