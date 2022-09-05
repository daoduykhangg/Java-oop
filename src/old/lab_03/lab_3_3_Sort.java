package old.lab_03;

import java.util.Scanner;

public class lab_3_3_Sort {
    public static void main(String[] args) {
        int[] intArr = new int[5];
        enterValueArray(intArr);
        System.out.println("Input:");
        printArray(intArr);
        intArr = sortIncrease(intArr);
        System.out.println("Expected output: ");
        printArray(intArr);
    }

    public static void enterValueArray(int[] intArr) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < intArr.length; i++) {
            System.out.print("a[" + i + "]= ");
            intArr[i] = scan.nextInt();
        }
    }

    public static void printArray(int[] intArr) {
        for (int element : intArr) {
            System.out.print(element + "\t");
        }
        System.out.println("\n");
    }

    public static int[] sortIncrease(int[] intArr) {
        int temp = 0;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
        return intArr;
    }

}
