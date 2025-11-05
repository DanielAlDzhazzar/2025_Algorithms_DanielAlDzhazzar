package Main.Ex3.utils;

import Main.Ex3.entities.Book;

public class BookUtils {

    /**
     * convert provided array of books into a string
     *
     * @param array array of books provided
     * @return String of books in correct format
     */

    public static String toString(Book[] array) {
        String storage = "";
        if (array != null) {
            if (array.length > 0) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == null) {
                        storage += i + ") null\n";
                    } else {
                        storage += i + ") " + array[i].format() + "\n";
                    }
                }
                if (!storage.isEmpty()) {
                    return storage.trim();
                }
            }
            return "No books found";
        }
        throw new IllegalArgumentException("Incorrect (or no) exception thrown");
    }

    /**
     * To remove a book from array
     *
     * @param array An array of Books – the data to be amended
     * @param pos A single int – the position to overwrite
     * @return a Book (the value overwritten)
     */

    public static Book emptyIndex(Book[] array, int pos) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (pos < 0 || pos >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Book removed = array[pos];
        array[pos] = null;
        return removed;
    }


}
