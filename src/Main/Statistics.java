package Main;

import Main.DataGenerator;
import Main.Ex2.utils.ArrayUtils;
import Main.Ex2.utils.NumberUtils;

public class Statistics {
    public static void main(String[] args)
    {
        int[] array = {10, 20, 10, 20, 60, 10, 5, 60, 5, 60};
        int[] randArray = DataGenerator.getRandomArray(10);

        System.out.println("Displaying hardcoded arrays: ");
        ArrayUtils.displayArray(array);
        System.out.println("\nDisplaying generated array: ");
        ArrayUtils.displayArray(randArray);

        System.out.println("\nLargest number in random array: " + ArrayUtils.findMax(randArray));

        System.out.println("Find the position in which number 5 first appears in an array: " + NumberUtils.getPos(array, 5));

        System.out.println("Find the position in which number 5 last appears in an array: " + NumberUtils.getLastPos(array, 5));

        System.out.println("\nIs hardcoded array identical to generated: " + NumberUtils.isIdentical(array, randArray));

        System.out.println("Is hardcoded array equal to generated: " + NumberUtils.isEqual(array, randArray));

        System.out.println("Is hardcoded array subset of generated: " + NumberUtils.isSubset(array, randArray));
    }
}
