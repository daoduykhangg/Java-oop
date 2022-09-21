package homework.new_lab_03;

import java.util.Scanner;

public class Lab_3_3_Sort_Array_Min_To_Max {
    public static void main(String[] args) {
        int[] intArr = new int[5];
        addValueToArray(intArr);
        printArray(intArr);
//        sortMinToMax(intArr);
        bubbleSortMinToMax(intArr);
        System.out.println("After sort: ");
        printArray(intArr);
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

    private static void sortMinToMax(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    private static void bubbleSortMinToMax(int[] a) {
        int usp = a.length - 1;
        int temp;
        while (usp > 0) {
            for (int i = 0; i < usp; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
            }
            usp--;
        }
    }
}
