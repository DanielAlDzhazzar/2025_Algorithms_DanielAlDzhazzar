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

    public static int getValidInteger(String prompt)
    {
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

    /***
     * Returns the largest of three integers.
     *
     * @param a
     * @param b
     * @param c
     * @return
     ***/

    public static int findMax(int a, int b, int c)
    {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args)
    {
        int num1 = getValidInteger("Please enter the first integer: ");
        int num2 = getValidInteger("Please enter the second integer: ");
        int num3 = getValidInteger("Please enter the third integer: ");

        int highest = findMax(num1, num2, num3);
        System.out.println("The highest number out of 3 is: " + highest);
    }
}
