package Lab_02;

import java.util.Scanner;

public class Lab_2_2_Odd_Or_Even_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number = ");
        int number = scan.nextInt();
        checkOddOrEvenNumber(number);
    }

    public static void checkOddOrEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("This is even number");
        } else {
            System.out.println("This is odd number");
        }
    }
}
