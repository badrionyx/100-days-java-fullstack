import java.util.Scanner;

public class PrimeArmstrongChecker {

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isArmstrong(int num) {

        int original = num;
        int temp = num;
        int digits = String.valueOf(num).length();

        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }

    public static String armstrongCalculation(int num) {

        int temp = num;
        int digits = String.valueOf(num).length();

        String calculation = "";
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;

            sum += (int) Math.pow(digit, digits);

            calculation = digit + "^" + digits +
                    (calculation.isEmpty() ? "" : " + " + calculation);

            temp /= 10;
        }

        return calculation + " = " + sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\n----- Result -----");

        if (isPrime(num)) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }

        if (isArmstrong(num)) {
            System.out.println(num + " is Armstrong");
            System.out.println("Calculation: " + armstrongCalculation(num));
        } else {
            System.out.println(num + " is not Armstrong");
            System.out.println("Calculation: " + armstrongCalculation(num));
        }

        sc.close();
    }
}