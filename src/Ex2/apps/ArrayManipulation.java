package Ex2.apps;

import Ex2.utils.ArrayUtils;
import Ex1.InputUtility;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] grades = new int[10];

        System.out.println("Enter 10 grades:");

        for (int i = 0; i < grades.length; i++) {
            grades[i] = InputUtility.getValidInteger("Grade " + (i + 1) + ": ");
        }
    }
}



