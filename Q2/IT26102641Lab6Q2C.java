import java.util.Scanner;

public class IT26102641Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Please enter 10 numbers:");

        int x = 0;
        while (x < 10) {
            System.out.print("Enter number " + (x + 1) + ": ");
            numbers[x] = scanner.nextInt();
            sum = sum + numbers[x];
            x++;
        }

        System.out.println("\nThe numbers you entered are:");
        
        int y = 0;
        while (y < 10) {
            System.out.print(numbers[y] + " ");
            y++;
        }

        double average = (double) sum / 10;

        System.out.println("\n\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}