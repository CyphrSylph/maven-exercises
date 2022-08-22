package util;
import java.util.Scanner;

// INPUT VALIDATION CLASS
public class Input {

    // Set up a new Scanner as a private field
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        // Prompt user to continue
        System.out.println("Continue? [y/n]");
        // Store user input value
        String confirm = scanner.next();
        // Simplified if statement that returns boolean value
        return confirm.equalsIgnoreCase("y")
                || confirm.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        // Prompt user to enter a number between 1 and 10
        System.out.print("Enter a number between " + min + " and " + max + ":");
        // Store user input value using scanner
        int userInt = scanner.nextInt();
        // Validate user input value based on range
        if (userInt > min && userInt < max) {
            return userInt;
        } else {
            // Prompt user to enter number again if incorrect
            userInt = getInt(min, max);
        }
        // Return the user input value
        return userInt;
    }

    public int getInt() {
        // Try-catch statement
        try {
            // Inline variable calling getString method using parseInt
            return Integer.parseInt(getString());
            // Throw format exception if input cannot be parsed as int
        } catch (NumberFormatException e) {
            // Error message
            System.out.println("Bruh...");
            System.out.println("(ㆆ_ㆆ)");
            System.out.println("That's not a number");
        }
        // Set temporary return value
        return getInt();
    }

    public double getDouble(double min, double max) {
        // Prompt user to enter a number between 1 and 10
        System.out.print("Enter a number between " + min + " and " + max + ":");
        // Store user input value
        double userDouble = scanner.nextDouble();
        // Validate user input value
        if (userDouble > min && userDouble < max) {
            // Prompt user with confirmation if correct
            System.out.print("Correct!");
        } else {
            // Prompt user to enter number again if incorrect
            userDouble = getDouble(min, max);
        }
        // Return the user input value
        return userDouble;
    }

    public double getDouble() {
        // Try-catch statement
        try {
            // Inline variable calling getString method using parseInt
            return Double.parseDouble(getString());
            // Throw format exception if input cannot be parsed as int
        } catch (NumberFormatException e) {
            // Error message
            System.out.println("Bruh...");
            System.out.println("(≖_≖ )");
            System.out.println("That's not a number");
        }
        // Set temporary return value
        return getDouble();
    }
}
