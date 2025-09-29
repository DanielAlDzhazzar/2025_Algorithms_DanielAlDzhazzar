package Ex2.utils;

import java.util.Arrays;

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

    public static int findMax(int[] array)
    {
        int high = 1;

        for(int i = 0; i < array.length; i++)
        {
            if(high < array[i])
            {
                high = array[i];
            }
        }
        return high;
    }

    /**
     * method which sort an array and returns last element of it
     *
     * @param array whose strings to sort
     * @return last element
     */

    public static String findMax(String[] array)
    {
        Arrays.sort(array);

        return array[array.length - 1];
    }

    /**
     * Method which compare each number in array to determine and return the lowest one
     *
     * @param array whose lowest to calculate
     * @return lowest
     */

    public static int findMin(int[] array)
    {
        int low = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++)
        {
            if(low > array[i])
            {
                low = array[i];
            }
        }
        return low;
    }

    /**
     * method which sort an array and returns first element of it
     * Note: I guess there is a mistake in method name, as logically it would be named findMin
     *
     * @param array whose strings to sort
     * @return first element
     */

    public static String findMin(String[] array)
    {
        Arrays.sort(array);

        return array[0];
    }

    /**
     * method to count frequency of provided number
     *
     * @param array number in which we need to count provided value
     * @param value provided value to count
     * @return counting of provided number
     */

    public static int count(int[] array, int value)
    {
        int count = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == value)
            {
                count++;
            }
        }
        return count;
    }

    /**
     * Method to find the most frequent number in an array
     *
     * @param array array whose numbers to be counted for frequency
     * @return most frequent number
     */

    public static int getMostFrequent(int[] array)
    {
        int count;
        int highestCount = 0;
        int mostFrequent = 0;

        for(int i = 0; i < array.length; i++)
        {
            count = 0;
            for (int j = 0; j < array.length; j++)
            {
                if(array[i] == array[j])
                {
                    count++;
                }
            }

            if(highestCount < count)
            {
                highestCount = count;
                mostFrequent = array[i];
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args)
    {
        int value = 5;
        int[] arrayI = {5, 5, 5, 10, 10, 15, 15, 15, 15, 20, 20, 25};
        String[] arrayS = {"zeta", "Some", "thing"};

        System.out.println("Displaying integer array:");
        displayArray(arrayI);

        System.out.println("\nDisplaying string array:");
        displayArray(arrayS);

        System.out.println("\nDisplaying average: " + calcAverage(arrayI));

        System.out.println("\nHighest number in array: " + findMax(arrayI));

        System.out.println("\nLast element in alphabetical array: " + findMax(arrayS));

        System.out.println("\nFirst element in alphabetical array: " + findMin(arrayS));

        System.out.println("\nLowest number in array: " + findMin(arrayI));

        System.out.println("\nAmount of 5 in array: " + count(arrayI, value));

        System.out.println("\nNumber with highest frequency: " + getMostFrequent(arrayI));
    }
}
