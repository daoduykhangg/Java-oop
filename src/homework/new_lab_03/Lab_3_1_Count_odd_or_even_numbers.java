package homework.new_lab_03;

import java.util.Scanner;

public class Lab_3_1_Count_odd_or_even_numbers {
    public static void main(String[] args) {
        int[] intArr = new int[5];
        addValueToArray(intArr);
        printArray(intArr);
        findOddAndEvenNumber(intArr);
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

    private static void findOddAndEvenNumber(int[] intArr){
        int oddNumber = 0;
        int evenNumber = 0;
        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i] % 2 == 0){
                evenNumber++;
            }else {
                oddNumber++;
            }
        }
        System.out.println("oddNumber = " + oddNumber);
        System.out.println("evenNumber = " + evenNumber);
    }
}
