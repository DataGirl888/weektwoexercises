package se.lexicon.zainabahmed;

/*
EXERCISE 01. CREATE AND PRINT INT ARRAY
1.Write a program which will
store elements in an array of type ‘int’
and print it out. Expected output:11 23 39 etc.
 */

public class ex01intArray
{
    public static void main(String[] args) {
//CREATE AND INITIALIZE INT ARRAY
        int[] myIntArray = new int[] {11, 23, 39, 44, 56, 79, 84, 18, 10, 12, 2003, 2010, 1979};

        // PRINT ARRAY USING FOR LOOP
        System.out.println("The  elements of this integer array are: ");
        for (int i = 0; i<myIntArray.length; i++)
        {
            System.out.print(myIntArray[i] + " ");  // print each element followed by a space
        }
        System.out.println();   // end with a new line

        //System.out.println(myIntArray);
    }
}
