package Lab_02;

import java.util.Scanner;

public class Lab_2_1_Calculate_BMI {
    static final float MIN_NORMAL_WEIGHT = 18.5f;
    static final float MIN_OVER_WEIGHT = 25.0f;
    static final float OBESITY = 30.0f;

    public static void main(String[] args) {
        System.out.println("===========Calculate BMI=============");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your height = ");
        float height = scan.nextFloat();
        System.out.print("Please enter your weight = ");
        float weight = scan.nextFloat();
        calculateBMI(height, weight);
    }

    public static void calculateBMI(float height, float weight) {
        Float bmiIndex = weight / (height * height);
        System.out.println("BMI = " + bmiIndex);
        if (bmiIndex < MIN_NORMAL_WEIGHT) {
            System.out.println("you are underweight !");
        } else if (bmiIndex < MIN_OVER_WEIGHT) {
            System.out.println("you are Normal weight !");
        } else if (bmiIndex < OBESITY) {
            System.out.println("you are Overweight !");
        } else {
            System.out.println("you are Obesity !");
        }
    }
}

