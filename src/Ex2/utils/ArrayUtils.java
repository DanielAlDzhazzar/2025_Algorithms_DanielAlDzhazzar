package Ex2.utils;

public class ArrayUtils
{
    /**
     * Displays all elements in an array with their position.
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

    public static void main(String[] args)
    {
        int[] array = {5, 10, 15, 20, 25};

        System.out.println("Displaying array:");
        displayArray(array);
    }
}
