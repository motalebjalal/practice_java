package learn_collection.learn_queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        Queue<Integer> numbers = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer min, Integer max) {
                return max.compareTo(min);
            }
        });


        numbers.offer(10);
        numbers.offer(30);
        numbers.offer(100);
        numbers.offer(12);
        numbers.offer(40);
        numbers.offer(80);

       /* numbers.add(10);
        numbers.add(30);
        numbers.add(100);
        numbers.add(12);
        numbers.add(40);
        numbers.add(80);*/

        System.out.println(numbers+"\n_______________________");

        while (!numbers.isEmpty()){
            System.out.println(numbers.poll());
        }

    }
}
