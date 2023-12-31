/*
2)Write a program to accept age and gender from the user and check the ROI according to condition

above 60
M: 7%
F: 7.5%

below 60
M,F: 5%
*/

import java.util.Scanner;

public class CheckCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = sc.nextInt();

        System.out.println("Enter your gender (M/F) :");
        char gender = sc.next().charAt(0);

        double index;

        if (age > 60) {
            if (gender == 'M') {
                index = 7.0;
            } else if (gender == 'F') {
                index = 7.5;
            } else {
                System.out.println("Invalid gender");
                return;
            }
        } else {
            if (gender == 'M' || gender == 'F') {
                index = 5.0;
            } else {
                System.out.println("Invalid gender");
                return;
            }
        }

        System.out.println("The rate of interest (ROI) for you is : " + index + "%");
    }
}