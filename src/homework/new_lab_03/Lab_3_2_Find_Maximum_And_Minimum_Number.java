package homework.new_lab_03;

import java.util.Scanner;

public class Lab_3_2_Find_Maximum_And_Minimum_Number {
    public static void main(String[] args) {
        int[] intArr = new int[5];
        addValueToArray(intArr);
        printArray(intArr);
        findMaxNumber(intArr);
        findMinNumber(intArr);
    }

    private static void addValueToArray(int[] intArr) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < intArr.length; i++) {
            System.out.print("intArr[" + i + "]= ");
            intArr[i] = scan.nextInt();
        }
    }

    private static void printArray(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + "\t");
        }
        System.out.println("\n");
    }

    private static void findMinNumber(int[] intArr){
        int minNumber = intArr[0];

        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] < minNumber){
                minNumber = intArr[i];
            }
        }
        System.out.println("minNumber = " + minNumber);
    }

    private static void findMaxNumber(int[] intArr){
        int maxNumber = intArr[0];

        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] > maxNumber){
                maxNumber = intArr[i];
            }
        }
        System.out.println("maxNumber = " + maxNumber);
    }
}
