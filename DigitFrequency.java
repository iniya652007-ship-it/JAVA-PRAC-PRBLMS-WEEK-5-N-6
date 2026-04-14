import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Invalid Number");
            return;
        }

        // Special case
        if (number == 0) {
            System.out.println("Digit 0 occurs 1 time");
            return;
        }

        // Count digits
        int temp = number;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Store digits
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Frequency array (0–9)
        int[] freq = new int[10];

        // Count frequency
        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        // Display frequency
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        input.close();
    }
}