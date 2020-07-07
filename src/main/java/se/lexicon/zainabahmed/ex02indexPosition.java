package se.lexicon.zainabahmed;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Integer;
//import static java.lang.System.*;  // on demand static imports of System, so System.out is just out...

/*
EXERCISE 02 RETURN INDEX OF ELEMENT IN ARRAY
2.Create a program and create a method with name ‘indexOf’
which will find and return the index of an element in the array.
If the element doesn’t exist your method should return -1 as value.
Expected output:Index position of number 5 is: 2
*/

public class ex02indexPosition {
    public static Scanner scanner  = new Scanner(System.in);

    public static void main (String[] args)
    {
    System.out.println("Program to find and return the index of an array. ");

    //CREATE AND INITIALIZE AN INT ARRAY
    int [] myIntArray02 = new int[] {16, 1978, 2003, 2010, 2016, 25, 33, 45, 62, 369, 888};
    Arrays.sort(myIntArray02);  // sort the array
                        //takeInput(); //testing code
                        //System.out.println(takeInput());
    indexOf(myIntArray02, takeInput());  //call method to find index, which calls method to take user input

    //PRINTING OUT THE ARRAY
        System.out.println("The integers in the (sorted) array are: ");
        for (int number : myIntArray02) // testing code. Print by iterating through the array using enhanced for loop
        {
            System.out.print(number + " ");
        }
        System.out.println();  //Empty line at the end.
    }
    //METHOD TO CREATE AN INTEGER ARRAY
/*    public static int createIntArray()
        {
        } */

    //METHOD TO TAKE USER INPUT OF INTEGER SEARCH TERM
    public static int takeInput()
        {
    //scanner.nextLine(); // clearing any \n errors that causes it to exit without taking input
    System.out.println("Enter the number to search for: ");
    int userSearchNumber = Integer.valueOf(scanner.nextLine());
    return userSearchNumber;
        }

    //METHOD TO FIND AND RETURN INDEX (using binary search)
    public static void indexOf(int searchArray[], int searchTerm)
        {
    int indexRequired = Arrays.binarySearch(searchArray, searchTerm);
    if (indexRequired == -1)   // if search term not found, binarySearch returns insertion point index -1
    {
        System.out.println(" Number not found.");
    }
    else
    {
        System.out.println("Index position of " + searchTerm + " is: " + indexRequired );  // output to user when found
    }
    //return indexRequired;
        }


}
