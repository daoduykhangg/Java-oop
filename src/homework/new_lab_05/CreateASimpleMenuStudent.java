package homework.new_lab_05;

import java.util.*;

import static java.util.Map.*;

public class CreateASimpleMenuStudent {
    public static void main(String[] args) {
        boolean isContinuing = true;
        Scanner scan = new Scanner(System.in);
        Map<Integer, String> students = new HashMap<>();
        while (isContinuing) {
            printMenu();
            System.out.print("Please enter option: ");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    inputStudentInfo(students, scan);
                    break;
                case 2:
                    findStudentByID(students, scan);
                    break;
                case 3:
                    removeStudent(students, scan);
                    break;
                case 0:
                    isContinuing = false;
                    break;
                default:
                    System.out.println("Please enter right option!");
            }
        }
    }

    private static void removeStudent(Map<Integer, String> map, Scanner scan) {
        if (map.isEmpty()) {
            System.out.println("Student list is empty!");
        } else {
            boolean rmStu = false;
            System.out.print("Enter student name: ");
            String studentName = scan.next();
            Iterator<Entry<Integer, String>> studentsIterator = map.entrySet().iterator();
            while (studentsIterator.hasNext()) {
                Entry<Integer, String> entry = studentsIterator.next();
                String entryValue = entry.getValue();
                if (entryValue.equals(studentName)) {
                    studentsIterator.remove();
                    System.out.println("Remove student name: " + studentName + " successfully!");
                    rmStu = true;
                    break;
                }
            }
            if (!rmStu) {
                System.out.println("DON'T have student name: " + studentName + " in list");
            }
        }
    }

    private static void findStudentByID(Map<Integer, String> map, Scanner scan) {
        if (map.isEmpty()) {
            System.out.println("Student list is empty!");
        } else {
            System.out.print("Enter student ID: ");
            int studentID = scan.nextInt();
            Set<Integer> keys = map.keySet();
            boolean findStudent = false;
            for (Integer key : keys) {
                if (studentID == key) {
                    System.out.println("Student ID: " + key + ", student name: " + map.get(key));
                    findStudent = true;
                    break;
                }
            }
            if (!findStudent) {
                System.out.println("DON'T have student ID: " + studentID + " in list");
            }
        }
    }

    private static void inputStudentInfo(Map<Integer, String> map, Scanner scan) {
        System.out.print("Student ID: ");
        int studentID = scan.nextInt();
        System.out.print("Student name: ");
        String studentName = scan.next();
        map.put(studentID, studentName);
    }

    private static void printMenu() {
        System.out.println("==========Menu==========");
        System.out.println("1. Input student info");
        System.out.println("2. Find student by ID");
        System.out.println("3. Remove student");
        System.out.println("0. Exit!");
    }
}
