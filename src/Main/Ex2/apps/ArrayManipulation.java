package Main.Ex2.apps;

import java.util.Arrays;
import java.util.Scanner;
import Main.Ex2.utils.ArrayUtils;
import Main.Ex1.InputUtility;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] grades = new int[10];

        System.out.println("Enter 10 grades:");

        for (int i = 0; i < grades.length; i++) {
            grades[i] = InputUtility.getValidInteger("Grade " + (i + 1) + ": ");
        }

        System.out.println();
        ArrayUtils.displayArray(grades);

        double average = ArrayUtils.calcAverage(grades);
        System.out.println("\nGPA: " + average);

        int highest = ArrayUtils.findMax(grades);
        System.out.println("\nHighest: " + highest);

        int count = ArrayUtils.count(grades, 70);
        System.out.println("\nSubjects scored 70: " + count);

        int mostFrequent = ArrayUtils.getMostFrequent(grades);
        System.out.println("\nMost frequent grade: " + mostFrequent);

        int higherThanGpa = ArrayUtils.countGreaterThanAverage(grades);
        System.out.println("\nAmount of grades higher than GPA: " + higherThanGpa);

        String[] text = new String[10];

        System.out.println("\nEnter 10 text:");

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Text " + (i + 1) + ":");
            text[i] = input.nextLine();
        }

        String last = ArrayUtils.findMax(text);
        System.out.println("Last element: " + last);

        String first = ArrayUtils.findMin(text);
        System.out.println("First element: " + first);

        System.out.println("How big would you want an array to be ");
        int length = InputUtility.getValidInteger("Size: ");
        int[] array = new int[length];

        System.out.println("Enter " + length + " values: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = InputUtility.getValidInteger("Value " + (i + 1) + ": ");
        }

        System.out.println("Would you like to add more numbers (10)?\n1.Yes\n2.No");
        int c = InputUtility.getValidInteger("Choice: ");

        if(c == 1){
            array = ArrayUtils.grow(array);

            System.out.println("Enter " + length + " values: ");

            for (int i = length; i < array.length; i++) {
                array[i] = InputUtility.getValidInteger("Value " + (i + 1) + ": ");
            }
        }

        ArrayUtils.displayArray(array);
    }
}



