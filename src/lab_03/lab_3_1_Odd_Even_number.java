package lab_03;

import java.util.Scanner;

public class lab_3_1_Odd_Even_number {
    static int oddNumber = 0;
    static int evenNumber = 0;

    public static void main(String[] args) {
        int[] intArr = new int[5];
        enterValueArray(intArr);
        countOddOrEvenNumber(intArr);
    }
    public static void enterValueArray(int[] intArr){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < intArr.length; i++) {
            System.out.print("a[" + i + "]= ");
            intArr[i] = scan.nextInt();
        }
    }
    public static void countOddOrEvenNumber(int[] intArr){
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }
        System.out.println("Even numbers: " + evenNumber);
        System.out.println("Odd numbers: " + oddNumber);
    }
}
