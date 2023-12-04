import java.util.Scanner;

class DigitSum_Prime_Fiboncci {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int num;
            System.out.println("1) Sum of Digit \n2) Prime Number \n3) Fibonacci Series \n4) Exit");
            System.out.println("Enter your choice=");
            int choice = sc.nextInt();

            DigitSum_Prime_Fiboncci dpf = new DigitSum_Prime_Fiboncci();
            switch (choice) {
                case 1:
                    System.out.println("Enter Number=");
                    num = sc.nextInt();
                    dpf.SumOfDigit(num);
                    break;
                case 2:
                    System.out.println("Enter Number=");
                    num = sc.nextInt();
                    dpf.Prime(num);
                    break;
                case 3:
                    System.out.println("Enter Number=");
                    num = sc.nextInt();
                    dpf.Fibonacci(num);
                    break;
                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter valid case only");
                    break;
            }
        }
    }

    void SumOfDigit(int num) {
        int sum = 0, lastDigit;
        while (num > 0) {
            lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        System.out.println("Sum of Digit=" + sum);
    }

    void Prime(int num) {
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");
    }

    void Fibonacci(int num) {
        int first = 0, second = 1, next, i;
        System.out.print(first + " " + second + " ");
        for (i = 2; i < num; i++) {
            next = first + second;
            first = second;
            second = next;
            System.out.print(next + " ");
        }
        System.out.println();
    }
}
