package homework.new_lab_03;

import java.util.Scanner;

public class Lab_3_4_Merge_2_Sorted {
    public static void main(String[] args) {
        int[] a = {1, 12, 16, 28, 34, 66, 74};
        int[] b = {1, 13, 16, 27, 99};
        printArray(a);
        printArray(b);
        int[] mergeArr = sortMinToMax(a, b);
        printArray(mergeArr);
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

    private static int[] sortMinToMax(int[] a, int[] b) {
        int k = 0;
        int i = 0;
        int j = 0;

        int[] mergeArr = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                mergeArr[k++] = a[i++];
            } else if (a[i] > b[j]) {
                mergeArr[k++] = b[j++];
            }
        }
        while (i < a.length) {
            mergeArr[k++] = a[i++];
        }

        while (j < b.length) {
            mergeArr[k++] = b[j++];
        }
        return mergeArr;
    }
}

