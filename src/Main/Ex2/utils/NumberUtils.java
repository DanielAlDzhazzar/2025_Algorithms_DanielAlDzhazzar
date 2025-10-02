package Main.Ex2.utils;

import java.util.Arrays;

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

    public static void main(String[] args)
    {
        int num = 5;
        int[] arrayI = {5, 5, 5, 10, 10, 15, 15, 15, 15, 20, 20, 25};
        int[] arrayII = {5, 5, 5, 10, 10, 15, 15, 15, 15, 20, 20, 25};

        System.out.println("First position of number 10: " + getPos(arrayI, num));

        System.out.println("Last position of number 10: " + getLastPos(arrayI, num));

        System.out.println("Is Array A equal to Array B? " + isIdentical(arrayI, arrayII));
    }
}
