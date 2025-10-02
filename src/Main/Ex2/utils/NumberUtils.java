package Main.Ex2.utils;

import Main.Validation;
import java.util.Arrays;
import java.util.Collection;

public class NumberUtils {

    /**
     * to find first position of provided number in array
     *
     * @param array numerical array to search in
     * @param num number to be found
     * @return either position of provided number or a -1 if position is not found
     */

    public static int getPos(int[] array, int num)
    {
        int pos = -1;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == num){
                pos = i;
                break;
            }
        }

        if (pos != -1)
        {
            return pos;
        }

        else
        {
            System.out.println("\nNumber not found");
            return -1;
        }
    }

    /**
     * to get last position of provided number
     *
     * @param array numerical array to search in
     * @param num number to be found
     * @return either position of provided number or a -1 if position is not found
     */

    public static int getLastPos(int[] array, int num)
    {
        int pos = -1;

        for(int i = array.length - 1; i >= 0; i--)
        {
            if(array[i] == num){
                pos = i;
                break;
            }
        }

        if (pos != -1)
        {
            return pos;
        }

        else
        {
            System.out.println("\nNumber not found");
            return -1;
        }
    }

    /**
     * to compare 2 arrays and if they are identical
     *
     * @param arrayA first array to compare
     * @param arrayB second array to compare
     * @return if arrays are identical
     */

    public static boolean isIdentical(int[] arrayA, int[] arrayB)
    {
        return Arrays.equals(arrayA, arrayB);
    }

    /**
     * to compare 2 arrays with numbers in different positions
     *
     * @param arrayA first array to compare
     * @param arrayB second array to compare
     * @return if arrays are equal
     */

    public static boolean isEqual(int[] arrayA, int[] arrayB)
    {
        if (arrayA != null && arrayB != null)
        {
            Arrays.sort(arrayA);
            Arrays.sort(arrayB);
            return Arrays.equals(arrayA, arrayB);
        }

        else if (arrayA == null && arrayB == null)
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    /**
     * to check if 1 array is subset of other
     *
     * @param arrayA substitute array
     * @param arrayB array to compare to
     * @return if array a is substitute of array b
     */

    public static boolean isSubset(int[] arrayA, int[] arrayB)
    {
        if (arrayA.length >= arrayB.length || arrayA.length > 0 || arrayB.length > 0)
        {
            return false;
        }

        for(int i = 0; i < arrayA.length; i++)
        {
            boolean match = false;
            for(int j = 0; j < arrayB.length; j++)
            {
                if(arrayA[i] == arrayB[j])
                {
                    match = true;
                    break;
                }
            }
            if(!match)
            {
                return false;
            }
        }
        return true;
    }

    public static int getMax(int[] array)
    {
        if(array.length == 0){
            return -1;
        }

        int max = array[0];

        for(int i = 0; i < array.length; i++)
        {
            if (max < array[i])
            {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int num = 5;
        int[] arrayI = {5, 5, 5, 10, 10, 15, 15, 15, 15, 20, 20, 25};
        int[] arrayII = {5, 5, 10, 10, 15, 15, 15, 15, 20, 20, 25, 5};
        int[] arrayIII = {10, 10};

        Validation.validateArray(arrayI);
        Validation.validateArray(arrayII);

        System.out.println("First position of number 10: " + getPos(arrayI, num));

        System.out.println("Last position of number 10: " + getLastPos(arrayI, num));

        System.out.println("Is Array A identical to Array B? " + isIdentical(arrayI, arrayII));

        System.out.println("Is Array A equal to Array B? " + isEqual(arrayI, arrayII));

        System.out.println("Is Array A is subset to Array B? " + isSubset(arrayIII, arrayI));

        System.out.println("Highest number in array: " + getMax(arrayIII));
    }
}
