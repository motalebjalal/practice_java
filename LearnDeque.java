package learn_collection.learn_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class LearnDeque {
    public static void main(String[] args) {

        // Last In First Out
        Deque<Integer> numbers = new ArrayDeque<>();
        numbers.push(10);
        numbers.push(40);
        numbers.push(30);
        numbers.push(50);
        numbers.push(100);
        numbers.push(20);

        // The pop() method returns the first element and removes the element
        while (!numbers.isEmpty()) {
            System.out.println(numbers.pop());
        }


    }
}
