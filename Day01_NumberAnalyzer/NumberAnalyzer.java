import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;
        int digitCount = 0;
        int digitSum = 0;

        while (num > 0) {
            int digit = num % 10;

            reverse = reverse * 10 + digit;
            digitSum += digit;
            digitCount++;

            num /= 10;
        }

        System.out.println("\n------ Result ------");
        System.out.println("Reverse Number : " + reverse);
        System.out.println("Digit Count    : " + digitCount);
        System.out.println("Digit Sum      : " + digitSum);

        if (original == reverse) {
            System.out.println("Palindrome     : Yes");
        } else {
            System.out.println("Palindrome     : No");
        }

        if (original % 2 == 0) {
            System.out.println("Even/Odd       : Even");
        } else {
            System.out.println("Even/Odd       : Odd");
        }

        sc.close();
    }
}