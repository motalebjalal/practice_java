package learn_collection.learn_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LearnQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }

       while (!queue.isEmpty()){
           Integer numbers = queue.poll();
           System.out.print(numbers+" ");
       }

        System.out.println("\n--------------------------------");

        String[] someBook = {"java", "python", "JavaScript", "Node JS"};

       // Add elements in queue from array
       Queue<String> books = new LinkedList<>();
        for (int i = 0; i < someBook.length; i++) {
            books.add(someBook[i]);
        }


        // Print all books in the queue
        System.out.println("Books in the queue:");
        for (String book : books) {
            System.out.println(book);
        }

        // Find book
        Scanner input = new Scanner(System.in);
        System.out.print("Find book: ");
        String findBook = input.next();

        if (books.contains(findBook)) {
            System.out.println(findBook + " is present");
        } else {
            System.out.println(findBook + " is not present");
        }
    }
}
