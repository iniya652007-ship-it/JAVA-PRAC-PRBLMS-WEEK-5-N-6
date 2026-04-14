import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Invalid Number.");
            return;
        }

        // Special case for 0
        if (number == 0) {
            System.out.println("Sum of Digits: 0");
            return;
        }

        // Count digits
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Store digits in array
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Find sum
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += digits[i];
        }

        // Output
        System.out.println("Sum of Digits: " + sum);

        input.close();
    }
}