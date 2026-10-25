import java.util.Scanner;

public class IT26102641Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sumOfSquares = 0;
        int count = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num == -99) {
                break;
            }

            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }

            // Valid positive number
            sumOfSquares += (num * num); // X^2
            count++; // N
        }

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("\nNo valid numbers were entered.");
        }

        scanner.close();
    }
}