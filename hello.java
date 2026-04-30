import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        boolean valid1 = false;
        while (!valid1) {
            try {
                System.out.print("Enter first integer: ");
                num1 = Integer.parseInt(scanner.nextLine().trim());
                valid1 = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Input is not a valid integer. Please try again.");
            }
        }
        int num2 = 0;
        boolean valid2 = false;
        while (!valid2) {
            try {
                System.out.print("Enter second integer: ");
                num2 = Integer.parseInt(scanner.nextLine().trim());
                valid2 = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Input is not a valid integer. Please try again.");
            }
        }
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}