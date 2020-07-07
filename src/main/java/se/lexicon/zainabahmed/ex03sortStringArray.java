package se.lexicon.zainabahmed;
import java.util.Arrays;  // QUESTION do we need to import in every different java class, or once is enough?

/* EXERCISE 03: SORT STRING ARRAY
3.Write a program which will sort string array.
Expected output:String array: [Paris, London, New York, Stockholm]
Sort string array: [London, New York, Paris, Stockholm
 */


import java.util.Arrays;

public class ex03sortStringArray {
public static void main(String[] args)
    {
        System.out.println("Sorting the given String array of city names: ");
    // CREATE AND POPULATE A STRING ARRAY
        String[] citiesArray = {"London", "Kinshasa", "New York", "Paris", "Stockholm" };
        Arrays.sort(citiesArray, String.CASE_INSENSITIVE_ORDER); // using the comparator just in case

    //USING AN ENHANCED FOR LOOP TO ITERATE THROUGH AND PRINT THE STRING ARRAY IN THE REQUIRED FORMAT
    //EXPECTED OUTPUT String array: [Paris, London, New York, Stockholm]

        System.out.print("String array: [");
        for (String city : citiesArray)
        {
            System.out.print(city + " ");
        }
        System.out.print("]");
    }
}
