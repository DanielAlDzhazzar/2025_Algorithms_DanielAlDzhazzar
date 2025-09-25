import java.util.Scanner;

public class CalcMax {
    private static Scanner input = new Scanner(System.in);

    /**
     * 1.Continuously prompts the user until a valid integer is entered.
     *
     * 2.If user input is not a number he is prompted to input a number again, it won't stop until the number is presented
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

    /**
     * Returns the largest of three integers.
     *
     * @param a
     * @param b
     * @param c
     * @return
     **/

    public static int findMax(int a, int b, int c)
    {
        int max = a;
        if (b > max)
        {
            max = b;
        }
        if (c > max)
        {
            max = c;
        }
        return max;
    }

    /***
     * Returns the largest integer in an array.
     * @param array
     * @return
     **/

    public static int findMax(int[] array)
    {
        int max = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 1.Continuously prompts the user until a valid integer in a range is entered.
     *
     * 2.If user input is not a number he is prompted to input a number again, it won't stop until the number is presented
     * @param prompt
     * @param lower
     * @param upper
     * @return
     */

    public static int getValidInteger(String prompt, int lower, int upper) {
        int storedValue;
        while (true)
        {
            System.out.print(prompt);
            if (input.hasNextInt())
            {
                storedValue = input.nextInt();
                input.nextLine();

                if (storedValue >= lower && storedValue <= upper)
                {
                    return storedValue;
                }

                else
                {
                    System.out.println("Value outside allowable range (" + lower + " to " + upper + ").");
                }
            }

            else
            {
                System.out.println("Invalid input. Please enter an integer.");
                input.nextLine();
            }
        }
    }

    public static void main(String[] args)
    {
        int num1 = getValidInteger("Please enter the first integer: ");
        int num2 = getValidInteger("Please enter the second integer: ");
        int num3 = getValidInteger("Please enter the third integer: ");

        int highest = findMax(num1, num2, num3);
        System.out.println("The highest number out of 3 is: " + highest);

        int arraySize = getValidInteger("\nEnter the size of the array: ");
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++)
        {
            array[i] = getValidInteger("Enter integer for element " + (i + 1) + ": ");
        }

        int arrayMax = findMax(array);
        System.out.println("The highest number in the array is: " + arrayMax);

        int a = getValidInteger("\nPlease enter lower limit: ");
        int b = getValidInteger("Please enter upper limit: ");

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        int value = CalcMax.getValidInteger("Please enter an integer between " + start + " and " + end + ": ", start, end);

        System.out.println("Your number is indeed a number in range from " + start + " to " + end + " - " + value);
    }
}
