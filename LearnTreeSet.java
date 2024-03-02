package learn_collection.learn_set;


import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {

        // TreeSet directly implements the SortedSet interface
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(20);
        numbers.add(600);
        numbers.add(25);
        numbers.add(100);
        numbers.add(30);
        numbers.add(500);

        numbers.remove(20);

        System.out.println("The order of the tree set is correct");
        System.out.println(numbers);


        Set<String> books = new TreeSet<>();
        books.add("JAVA");
        books.add("Python");
        books.add("JavaScript");
        books.add("TypeScript");
        books.add("AngularJS");

        books.remove("Python");

        System.out.println(books);
    }
}
