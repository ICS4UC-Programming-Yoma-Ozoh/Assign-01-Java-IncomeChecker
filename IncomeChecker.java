import java.util.Scanner;

/**
 * This program calculates if user income
 *class to average canadian income*.
 * @author  Yoma Ozoh
 * @version 1.0
 * @since   2026-10-05
 */
public final class IncomeChecker {

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private IncomeChecker() {
    }

    /**
     * Checks if the income is above or below average.
     *
     * @param userIncome the user's income
     * @return a message indicating if the income is above or below average
     */
    public static String checkIncome(final double userIncome) {
        // average canadian income
        final double averageIncome = 68000.0;
        // check if income is greater than average
        if (userIncome > averageIncome) {
            return "Your income is above the average Canadian income.";
        // check if income is less than average
        } else if (userIncome < averageIncome) {
            return "Your income is below the average Canadian income.";
        // check if income is equal to average
        } else {
            return "Your income is equal to the average Canadian income.";
        }
    }

    /**
     * Main entry point for user interaction and output.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // try catch for input errors
        try {
            // ask user for their income
            System.out.print("Please enter your annual income: ");
            final double userIncome = Double.parseDouble(scanner.nextLine());
            // check if user input is valid
            if (userIncome >= 0) {
                final String result = checkIncome(userIncome);
                System.out.println(result);
            } else {
                System.out.println("Invalid input."
                + "Please enter a positive integer.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
