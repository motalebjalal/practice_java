package learn_collection.learn_stack;

import java.util.Stack;

public class StackOfBooks {
    public static void main(String[] args) {

        //Let's create a stack called bundle to hold the books
        Stack<String> bundle = new Stack<>();
        bundle.push("JAVA");
        bundle.push("Python");
        bundle.push("Springboot");
        bundle.push("Flask");
        bundle.push("Django");

        // Create new stack for retrieve and get clear result from stack
        Stack<String> collectBook = new Stack<>();

        // Push the book into the new stack named collectBook
        for (String book : bundle) {
            collectBook.push(book);
        }

        //Show each book in the stack
        while (!collectBook.isEmpty()) {
            String collectedBook = collectBook.peek();
            System.out.println(collectedBook);
            
            // Remove the top element from the named collecBook stack
            collectBook.pop();
        }
    }
}
