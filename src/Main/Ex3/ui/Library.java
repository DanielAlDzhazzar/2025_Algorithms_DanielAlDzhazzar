package Main.Ex3.ui;

import java.util.Random;
import java.util.Scanner;
import java.util.Comparator;
import Main.Ex3.entities.Book;
import Main.Ex3.utils.BookUtils;
import Main.Ex3.utils.BookGenerator;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        Book[] library = BookGenerator.getRandomArray(10);
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int pos = rand.nextInt(library.length);
        int i = 1;

        System.out.print("Randomized library:\n");
        System.out.println(BookUtils.toString(library));
        Book del = library[pos];
        BookUtils.delete(library, del);
        System.out.println("\n" + del + " was deleted from position: " + pos);
        Arrays.sort(library, Comparator.nullsLast(Comparator.naturalOrder()));
        System.out.print("\nSorted library:\n");
        System.out.println(BookUtils.toString(library));
        BookUtils.sortedInsert(library, del);

        System.out.println();
        System.out.println(BookUtils.toString(library));

        System.out.println("\nWhat book do you want to delete?(Position): ");
        int position = input.nextInt();

        System.out.println("Would you like to: \n1.Delete first instance\n2.Delete every instance");
        int op = input.nextInt();

        switch (op) {
            case 1:
                BookUtils.delete(library, library[position]);
                System.out.print("\nDeleted first instance of " + library[position] + ", Array:\n");
                System.out.println(BookUtils.toString(library));
                break;
            case 2:
                BookUtils.deleteAll(library, library[position]);
                System.out.print("\nDeleted all instances of " + library[position] + ", Array:\n");
                System.out.println(BookUtils.toString(library));
                break;
            default:
                System.out.println("\nWrong input");
        }

        pos = rand.nextInt(library.length);
        del = library[pos];

        if (del != null) {
            Book replacement = BookGenerator.generateBook();
            System.out.println("\n" + del + " was replaced " + BookUtils.replace(library, del, replacement) + " times");
            System.out.print("\nUpdated library:\n" + BookUtils.toString(library));
        }
    }
}
