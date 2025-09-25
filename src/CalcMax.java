import java.util.Scanner;

public class CalcMax {
    private static Scanner input = new Scanner(System.in);

    /**
     * 1.Continuously prompts the user until a valid integer is entered.
     *
     * 2.If user input is not a number he is prompted to input a number again, it wont stop until the number is presented
     *
     * @param prompt the text displayed to the user as input prompt
     * @return the entered and validated integer
    **/

    public static int getValidInteger(String prompt) {
        int storedValue;
        while (true)
        {
            System.out.print(prompt);
            if (input.hasNextInt())
            {
                storedValue = input.nextInt();
                input.nextLine();
                return storedValue;
            }

            else
            {
                System.out.println("\nInvalid input.");
                input.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        int value = getValidInteger("Please enter an integer: ");
        System.out.println("You checked integer is: " + value);
    }
}
