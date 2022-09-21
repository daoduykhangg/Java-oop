package homework.new_lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateASimpleMenu {
    public static void main(String[] args) {
        boolean isCouniting = true;
        List<Integer> numList = new ArrayList<>();
        while (isCouniting) {
            printMenu();
            Scanner scan = new Scanner(System.in);
            System.out.print("Choose option: ");
            int num = scan.nextInt();
            switch (num) {
                case 0:
                    isCouniting = false;
                    break;
                case 1:
                    addNumberIntoArrayList(scan, numList);
                    break;
                case 2:
                    printArrayList(numList);
                    break;
                case 3:
                    findMaxNumberInArrList(numList);
                    break;
                case 4:
                    findMinNumberInArrList(numList);
                    break;
                case 5:
                    findIndexOfANumberInArrList(numList, scan);
                    break;
                default:
                    System.out.println("Please enter a valid option!");
            }
        }
    }

    private static void printMenu() {
        System.out.println("==========Menu==========");
        System.out.println("1. Add number into arrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. find index of a number");
        System.out.println("0. exit");
    }

    private static void addNumberIntoArrayList(Scanner scan, List<Integer> arrList) {
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        arrList.add(number);
    }

    private static void printArrayList(List<Integer> arrList) {
        if (arrList.isEmpty()) {
            System.out.println("Array List is empty!");
        } else {
            System.out.println(arrList);
        }
    }

    private static void findMinNumberInArrList(List<Integer> arrList) {
        int min = arrList.get(0);
        for (int i = 1; i < arrList.size(); i++) {
            if (arrList.get(i) < min) {
                min = arrList.get(i);
            }
        }
        System.out.println("min = " + min);
    }

    private static void findMaxNumberInArrList(List<Integer> arrList) {
        int max = arrList.get(0);
        for (int i = 1; i < arrList.size(); i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        }
        System.out.println("max = " + max);
    }

    private static void findIndexOfANumberInArrList(List<Integer> arrList, Scanner scan) {
        System.out.print("Please enter a number: ");
        boolean isFinded = false;
        int findedNum = scan.nextInt();
        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) == findedNum) {
                System.out.println(findedNum + " has in Array List with index " + i);
                isFinded = true;
                break;
            }
        }
        if (!isFinded) {
            System.out.println(findedNum + " does NOT have in Array List");
        }
    }
}
