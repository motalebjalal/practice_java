package learn_collection.learn_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LernLinkedHashSet {
    public static void main(String[] args) {

       // The order of the linked hash set is user specific and cannot contain duplicate elements.

        Set<String> books = new LinkedHashSet<>();
        books.add("JAVA");
        books.add("Springboot");
        books.add("Database");
        books.add("Mongodb");
        books.add("Mongodb");
        books.add("MySQL");

        System.out.println(books);
    }
}
