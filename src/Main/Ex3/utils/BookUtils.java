package Main.Ex3.utils;

import Main.Ex3.entities.Book;

public class BookUtils {
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
}
