package homework.new_lab_02;

import java.util.Scanner;

public class Lab_2_2_Odd_Or_Even_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("==========Find Even Number==========");
        System.out.print("Please enter your number: ");
        int yourNumber = scan.nextInt();
        findEvenNumber(yourNumber);
    }

    private static void findEvenNumber(int yourNumber) {
        if ((yourNumber % 2) == 0) {
            System.out.println(yourNumber + " is an even number");
        } else {
            System.out.println(yourNumber + " is an odd number");
        }
    }

}
