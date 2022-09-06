package homework.new_lab_02;

import java.util.Scanner;

public class Lab_2_3_Calculate_BMI_New {
    static final float MIN_NORMAL_WEIGHT = 18.5f;
    static final float MAX_NORMAL_WEIGHT = 24.9f;
    static final float MIN_OVER_WEIGHT = 25.0f;
    static final float OBESITY = 30.0f;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=========Caculate BMI==========");
        System.out.print("Please enter your weight: ");
        float weight = scan.nextFloat();
        System.out.print("Please enter your height: ");
        float height = scan.nextFloat();

        calculateBMI(height, weight);
    }

    private static void calculateBMI(float height, float weight) {
        float bmi = weight / (height * height);
        float goodWeight;
        System.out.println("Your BMI = " + bmi);
        if (bmi <= MIN_NORMAL_WEIGHT) {
            System.out.println("You're underweight!");
            goodWeight = caculateGoodWeight(MIN_NORMAL_WEIGHT, height);
            System.out.println("You must gain " + (goodWeight - weight) + "kg");
        } else if (bmi <= MIN_OVER_WEIGHT) {
            System.out.println("You're normal weight!");
        } else if (bmi <= OBESITY) {
            System.out.println("You're overweight!");
            goodWeight = caculateGoodWeight(MAX_NORMAL_WEIGHT, height);
            System.out.println("You must lose " + (weight - goodWeight) + "kg");
        } else {
            System.out.println("You're obesity!");
            goodWeight = caculateGoodWeight(MAX_NORMAL_WEIGHT, height);
            System.out.println("You must lose " + (weight - goodWeight) + "kg");
        }
    }

    public static float caculateGoodWeight(float goodbBmi, float height) {
        return (goodbBmi * (height * height));
    }
}

