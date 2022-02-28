package lab_03;

import java.util.Scanner;

public class lab_3_2_Max_Min_Value {
    static int min;
    static int max;

    public static void main(String[] args) {
        int[] intArr = new int[5];
        enterValueArray(intArr);
        findMinimumValue(intArr);
        findMaximumValue(intArr);
    }

    public static void enterValueArray(int[] intArr) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < intArr.length; i++) {
            System.out.print("a[" + i + "]= ");
            intArr[i] = scan.nextInt();
        }
    }

    public static void findMinimumValue(int[] intArr) {
        min = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] < min) {
                min = intArr[i];
            }
        }
        System.out.println("Minimum = " + min);
    }

    public static void findMaximumValue(int[] intArr) {
        max = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            }
        }
        System.out.println("Maximum = " + max);
    }
}
