import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0;

        System.out.println("Enter 11 heights:");

        for (int i = 0; i < 11; i++) {
            while (true) {
                System.out.print("Height " + (i + 1) + ": ");

                if (sc.hasNextDouble()) {
                    heights[i] = sc.nextDouble();
                    sum += heights[i];
                    break; // valid input → exit loop
                } else {
                    System.out.println("Invalid input! Please enter a number.");
                    sc.next(); // clear wrong input
                }
            }
        }

        double mean = sum / 11;

        System.out.println("Mean Height = " + mean);

        sc.close();
    }
}