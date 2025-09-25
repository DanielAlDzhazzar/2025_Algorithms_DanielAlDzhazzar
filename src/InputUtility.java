import java.util.Scanner;

public class InputUtility {
    private static Scanner input = new Scanner(System.in);

    /**
     * Continuously prompts the user until a valid integer is entered.
     * @param prompt the text displayed to the user as input prompt
     * @return the entered and validated integer
     */
    public static int getValidInteger(String prompt) {
        int storedValue;
        while (true) {
            System.out.print(prompt);
            if (input.hasNextInt()) {
                storedValue = input.nextInt();
                input.nextLine();
                return storedValue;
            } else {
                System.out.println("\nInvalid input. Please enter an integer.");
                input.nextLine();
            }
        }
    }

    /**
     * Continuously prompts the user until a valid integer in a range is entered.
     * @param prompt text displayed to the user
     * @param lower lower bound (inclusive)
     * @param upper upper bound (inclusive)
     * @return the entered and validated integer in range
     */
    public static int getValidInteger(String prompt, int lower, int upper) {
        int storedValue;
        while (true) {
            System.out.print(prompt);
            if (input.hasNextInt()) {
                storedValue = input.nextInt();
                input.nextLine();
                if (storedValue >= lower && storedValue <= upper) {
                    return storedValue;
                } else {
                    System.out.println("Value outside allowable range (" + lower + " to " + upper + "). Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                input.nextLine();
            }
        }
    }
}