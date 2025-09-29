package Ex2.apps;

import java.util.Scanner;
import Ex2.utils.ArrayUtils;
import Ex1.InputUtility;

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

        String[] text = new String[10];

        System.out.println("Enter 10 text:");

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Text " + (i + 1) + ":");
            text[i] = input.nextLine();
        }

        String last = ArrayUtils.findMax(text);
        System.out.println("Last element: " + last);

        String first = ArrayUtils.findMin(text);
        System.out.println("First element: " + first);
    }
}



