package learn_collection.iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LearnIterator {
    public static void main(String[] args) {
        List<String> bookList = new ArrayList<>();
        bookList.add("Java");
        bookList.add("Springboot");
        bookList.add("Oracle");
        bookList.add("Mongodb");
        bookList.add("Python");
        bookList.add("Flask");

        // Retrieve all elements from list
        // Using hasNext() and next()
        System.out.println("Display All Book List");

        Iterator<String> itBooks = bookList.iterator();
        while (itBooks.hasNext()) {
            System.out.println(itBooks.next());
        }

        System.out.println("-------------End of showing book list--------------\n\n");

        System.out.println("-------------Now delete a book from the book list--------------\n");

        // User input for remove book
        Scanner input = new Scanner(System.in);
        System.out.print("Type to remove books from the list :");
        String removeBook = input.next() ;

        // Remove element
        Iterator<String> itBook = bookList.iterator();
        String book = "";
        while (itBook.hasNext()) {
            book = itBook.next();
            if (book.equals(removeBook)) {
                itBook.remove();
            }
        }

        System.out.println(bookList);
    }

}