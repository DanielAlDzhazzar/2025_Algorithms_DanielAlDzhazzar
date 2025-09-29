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

    /**
     * Calculates the average of an integer array.
     *
     * @param array whose average is to calculate
     * @return average
     **/

    public static double calcAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    /**
     * Method which compare each number in array to determine and return the highest one
     *
     * @param array whose highest to calculate
     * @return highest
     */

    public static int findMax(int[] array){
        int high = 1;

        for(int i = 0; i < array.length; i++){
            if(high < array[i]){
                high = array[i];
            }
        }
        return high;
    }

    public static void main(String[] args)
    {
        int[] arrayI = {5, 10, 15, 20, 25};
        String[] arrayS = {"Some", "thing"};

        System.out.println("Displaying integer array:");
        displayArray(arrayI);

        System.out.println("\nDisplaying string array:");
        displayArray(arrayS);

        System.out.println("\nDisplaying average: " + calcAverage(arrayI));

        System.out.println("\nHighest number in array: " + findMax(arrayI));

    }
}
