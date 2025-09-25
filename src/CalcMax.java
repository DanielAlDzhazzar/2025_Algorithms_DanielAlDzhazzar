public class CalcMax {

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

    public static void main(String[] args)
    {
        int num1 = InputUtility.getValidInteger("Please enter the first integer: ");
        int num2 = InputUtility.getValidInteger("Please enter the second integer: ");
        int num3 = InputUtility.getValidInteger("Please enter the third integer: ");

        int highest = findMax(num1, num2, num3);
        System.out.println("The highest number out of 3 is: " + highest);

        int arraySize = InputUtility.getValidInteger("\nEnter the size of the array: ");
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++)
        {
            array[i] = InputUtility.getValidInteger("Enter integer for element " + (i + 1) + ": ");
        }

        int arrayMax = findMax(array);
        System.out.println("The highest number in the array is: " + arrayMax);

        int a = InputUtility.getValidInteger("\nPlease enter lower limit: ");
        int b = InputUtility.getValidInteger("Please enter upper limit: ");

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        int value = InputUtility.getValidInteger("Please enter an integer between " + start + " and " + end + ": ", start, end);

        System.out.println("Your number is indeed a number in range from " + start + " to " + end + " - " + value);
    }
}
