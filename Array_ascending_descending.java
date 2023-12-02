import java.util.Scanner;

public class Array_ascending_descending {
    static int cal, size;
    static int[] num;

    public static void main(String[] args) {

        accept();
        GRT();
        smaller();
        ascending();
        descending();

    }

    public static void accept() {
        // local var
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        size = sc.nextInt();
        num = new int[size];

        // Array

        System.out.println("Enter " + size + " numbers");
        // Accepting the array numbers
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
    }

    public static void GRT() {

        cal = num[0];
        System.out.println("The numbers are");
        // Display the value of the array
        for (int i = 0; i < size; i++) {
            System.out.println("num=" + num[i]);
            if (num[i] > cal) {
                cal = num[i];
            }

        }
        System.out.println("The graeter no is =" + cal);
    }

    public static void smaller() {

        cal = num[0];
        // Display the value of the array
        for (int i = 0; i < size; i++) {
            if (num[i] < cal) {
                cal = num[i];
            }

        }
        System.out.println("The Smaller no is =" + cal);
    }

    public static void ascending() {
        System.out.println("Array Element is Ascending Order");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            System.out.print(num[i] + "\t");
        }
        System.out.println();
    }

    public static void descending() {
        System.out.println("Array Element is Descending Order");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            System.out.print(num[i] + "\t");
        }
        System.out.println();
    }

}