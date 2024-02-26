package learn_collection.learn_list;
import java.util.ArrayList;
import java.util.List;

public class ListOfCountries {

    private static void addCountry(String[] received) {
        List<String> countryList = new ArrayList<>();
        
         // add array elements in list
        for (String country : received){
           countryList.add(country);
        }

         // add element in list
        countryList.set(1,"Iran");

        //Remove element from list
        countryList.remove("Pakistan");

        // Remove element from list by index
        countryList.remove(2);

        // Check element from list
        boolean check = countryList.contains("Afghanistan");
        System.out.println(check);

        // Use index to display list elements
        System.out.println(countryList.get(1));

        // traverse list
        for (String list : countryList){
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        String[] countries = {"Saudi Arabia", "Bangladesh","Afghanistan ","Pakistan"};
        addCountry(countries);
    }
}
