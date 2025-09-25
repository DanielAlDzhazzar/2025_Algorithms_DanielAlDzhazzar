package Ex2.utils;

public class ArrayUtils
{
    /**
     * Displays all elements in an integer array with their position.
     *
     *
     * @param array int array whose elements are to be displayed
     **/
    public static void displayArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Element at index " + i + ": " + array[i]);
        }
    }

    /**
     * Displays all elements in a string array with their position.
     *
     *
     * @param array int array whose elements are to be displayed
     **/

    public static void displayArray(String[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Element at index " + i + ": " + array[i]);
        }
    }

    public static void main(String[] args)
    {
        int[] arrayI = {5, 10, 15, 20, 25};
        String[] arrayS = {"Some", "thing"};

        System.out.println("Displaying integer array:");
        displayArray(arrayI);

        System.out.println("\nDisplaying string array:");
        displayArray(arrayS);
    }
}
