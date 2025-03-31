import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Taking input from the user
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            // Handling division by zero
            System.out.println("Cannot divide by zero!");

        } catch (Exception e) {
            // Handling other exceptions
            System.out.println("An error occurred: " + e.getMessage());

        } finally {
            // Closing the scanner
            scanner.close();
        }
    }
}