package old.lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateASimpleMenu {
    public static void main(String[] args) {
        boolean isContinuing = true;
        List<Integer> arrList = new ArrayList<>();
        while (isContinuing) {
            printMenu();
            Scanner scan = new Scanner(System.in);
            System.out.print("Please choose a option: ");
            int optionChosed = scan.nextInt();
            switch (optionChosed) {
                case 1:
                    addNumberIntoArrayList(arrList, scan);
                    break;
                case 2:
                    printArrayList(arrList);
                    break;
                case 3:
                    findMaximumValue(arrList);
                    break;
                case 4:
                    findMinimumValue(arrList);
                    break;
                case 5:
                    findANumber(arrList, scan);
                    break;
                case 6:
                    isContinuing = false;
                    break;
                default:
                    System.out.println("Please choose valid option again!");
            }
        }
    }

    public static void printMenu() {
        System.out.println("***************Menu***************");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Find a number");
        System.out.println("6. Exit");
    }

    public static void addNumberIntoArrayList(List<Integer> arrList, Scanner scan) {
        System.out.print("Please, enter number = ");
        arrList.add(scan.nextInt());
    }

    public static void printArrayList(List<Integer> arrList) {
        System.out.println("ArrayList output");
        for (Integer element : arrList) {
            System.out.print(element + "\t");
        }
        System.out.println("\n");
    }

    public static void findMinimumValue(List<Integer> arrList) {
        int min = arrList.get(0);
        for (int i = 1; i < arrList.size(); i++) {
            if (arrList.get(i) < min) {
                min = arrList.get(i);
            }
        }
        System.out.println("Minimum = " + min);
    }

    public static void findMaximumValue(List<Integer> arrList) {
        int max = arrList.get(0);
        for (int i = 1; i < arrList.size(); i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        }
        System.out.println("Maximum = " + max);
    }

    public static void findANumber(List<Integer> arrList, Scanner scan) {
        boolean findNumber = false;
        System.out.print("please, enter number want to find: ");
        int number = scan.nextInt();
        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) == number) {
                System.out.println(number + " has in ArrayList with index = " + i);
                findNumber = true;
            }
        }
        if (!findNumber) {
            System.out.println(number + " does NOT exist in ArrayList");
        }
    }
}

