package learn_collection.map1;

import java.util.*;

public class LearnHashMap {
    public static void main(String[] args) {

        Map<String, String> studentInfo = new HashMap<>();
        studentInfo.put("Id", "5001");
        studentInfo.put("Name", "jalal");
        studentInfo.put("Roll", "101");
        studentInfo.put("Department", "CSE");
        studentInfo.put("University", "ADUST");

        System.out.println(" Here is the HashMap data showing:  ");

        for (Map.Entry<String, String> entry : studentInfo.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        System.out.println("\n Below Keeps the sequence of keys and values the same.");

        // Creating a LinkedHashMap to store the data
        LinkedHashMap<String , String> linkedStudentInfo = new LinkedHashMap<>();

        linkedStudentInfo.put("Id", "5001");
        linkedStudentInfo.put("Name", "jalal");
        linkedStudentInfo.put("Roll", "101");
        linkedStudentInfo.put("Department", "CSE");
        linkedStudentInfo.put("University", "ADUST");

        // Getting the entries from the LinkedHashMap
        System.out.println(" Here is the LinkedHashMap data showing: \n ");

        for (Map.Entry<String, String> showEntry : linkedStudentInfo.entrySet()) {
            System.out.println(showEntry.getKey()+" : "+showEntry.getValue());
        }


    }
}
