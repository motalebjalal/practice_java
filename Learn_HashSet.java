package learn_collection.learn_set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Learn_HashSet {
    public static void main(String[] args) {

        Set<String> foods = new HashSet<>();
        foods.add("Milk");
        foods.add("Honey");
        foods.add("Egg");
        foods.add("Banana");
        foods.add("Pizza");

        //The order of the hash set is incorrect.

        System.out.println("The order of the hash set is incorrect.");
        for(String allFoods : foods){
            System.out.println(allFoods);
        }
        System.out.println("\n\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Find Your Food : ");
        String findFood = input.nextLine();


        if (foods.contains(findFood)){
            System.out.println(findFood + " is present in the set.");
        }else {
            System.out.println(findFood+" is not present in the set");
        }

    }
}
