/*
 * 1)Write a program to accept choice from the user and display the output
 * 1.Arithmetic operator
 * 2.Logical Operator
 * 3.Relational Operator
 * 4.Bitwise Operator
 * 5.Conditional Operator
 * 6.Assignment Operator
 */

import java.util.*;

public class SwitchCaseOperator {

    public static void main(String[] args) {
        int choice, num1, num2, choice2;
        boolean result;
        Scanner sc = new Scanner(System.in);
        System.out.println("!!!!! MENU !!!!!");
        System.out.println(
                "1) Arithmatic Operator\n2) Logical Operator\n3) Relational Operator\n4) Bitwise Operator\n5) Conditional Operator\n5) Assignment Operator\nEnter your choice=");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                // Performing arithmetic operation *,-,*,/,%

                System.out.println("Enter two number=");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                // Accepting input

                System.out.println("Arithmatic Operator ");
                System.out.println(" ADDITION ");
                System.out.print("Addition=" + (num1 + num2));

                System.out.println("\nSUBSTRACTION");
                System.out.print("Substraction=" + (num2 - num1));

                System.out.println("\n MULTIPLICATION");
                System.out.print("Multiplication=" + (num2 * num1));

                System.out.println("\nDIVISIION");
                System.out.print("Division=" + (num2 / num1));

                System.out.println("\nMODE");
                System.out.print("Mode=" + (num2 % num1));
                break;

            case 2:
                // Performing logical operation &&,||,!

                System.out.println("Enter two number=");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                // Accepting input

                System.out.println("num1=" + num1 + "\nnum2=" + num2);
                result = (num1 > num2) && (num1 < num2);

                System.out.println("Result of (num1>num2)&&(num1<num2)=" + result);
                result = (num1 < num2) && (num1 <= num2);

                System.out.println("Result of (num1<num2)&&(num1<=num2)=" + result);
                result = (num1 > num2) || (num1 <= num2);

                System.out.println("Result of (num1>num2)||(num1<=num2)=" + result);

                result = (num1 != num2);
                System.out.println("Result of (num1 != num2)=" + result);
                break;

            case 3:
                // Performing relational operation <,>,<=,>=,==,!=

                System.out.println("Enter two number=");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                // Accepting input

                System.out.println("\n\nRelational Operator ");

                System.out.println("num1=" + num1 + "\nnum2=" + num2);

                System.out.println("Result of (num1>num2)=" + (num1 > num2));

                System.out.println("Result of (num1>=num2)=" + (num1 >= num2));

                System.out.println("Result of (num1<num2)=" + (num1 < num2));

                System.out.println("Result of (num1==num2)=" + (num1 == num2));

                System.out.println("Result of (num1!=num2)=" + (num1 != num2));
                break;

            case 4:
                // performing Bitwise operator &,|,^
                int output;
                System.out.println("Enter two number=");
                num1 = sc.nextInt();
                num2 = sc.nextInt();

                output = num1 & num2;
                System.out.println("Output of num1&num2=" + output);

                output = num1 | num2;
                System.out.println("Output of num1|num2=" + output);

                output = num1 ^ num2;
                System.out.println("Output of num1^num2=" + output);
                break;

            case 5:
                // performing conditional operator

                System.out.println("\n\nConditional Opeartor ");
                System.out.println("Types of conditional Operator\n");

                // List of conditional operator if,if else,if ifelse else,switch
                System.out.println("1) if\n"
                        + "2) if else\n"
                        + "3) if ifelse else\n"
                        + "4) switch\n"
                        + "Enter your choice=");
                choice2 = sc.nextInt();
                switch (choice2) {
                    case 1:
                        System.out.println("Yor are in 'if' condition\n");
                        break;

                    case 2:
                        System.out.println("Yor are in 'if else' condition\n");
                        break;

                    case 3:
                        System.out.println("Yor are in 'if elseif else' condition\n");
                        break;

                    case 4:
                        System.out.println("Yor are in 'switch' condition\n");
                        break;
                }

                break;

            case 6:
                // Performing assignment operation +=,-=,*=,/=,%=

                System.out.println("Enter two number=");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                // Accepting input

                System.out.println("\n\n Assignment Opeartor ");
                num1 += 20;
                System.out.print("\n'num1' is add with 20 and again assign to 'num1' the value=" + num1);
                num2 *= 2;
                System.out.print("\n'num2' is multiply with 2 and again assign to 'num2' the value=" + num2);
                num2 /= 2;
                System.out.print("\n'num2' is Divided with 2 and again assign to 'num2'the value=" + num2);
                num2 %= 2;
                System.out.print("\n'num2' is Mode with 2 and again assign to 'num2'the value=" + num2);
                break;

            default:
                System.out.println("Enter valid choice only");
        }
    }
}