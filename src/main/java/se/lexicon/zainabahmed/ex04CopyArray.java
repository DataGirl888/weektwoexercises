package se.lexicon.zainabahmed;
import java.util.Arrays;

/*
EXERCISE 04: COPY ELEMENTS OF ONE ARRAY TO ANOTHER  //QUESTION: was it supposed to be an overwrite or an append?
4.Write a program which will copy the elements of one array
into another array.
Expected output:Elements from first array: 1 15 20
Elements from second array: 1 15 20
 */
public class ex04CopyArray {
    public static void main(String[] args)
    {
//DEFINE AND INITIALIZE TWO INTEGER ARRAYS
int [] myFirstArray = new int[] {13, 24, 56};
int [] mySecondArray = {1, 15, 20, 437};

//PRINT ELEMENTS OF THE FIRST ARRAY
     System.out.print("Elements from the first array: ");
     for (int element : myFirstArray )
     {
         System.out.print(element + " ");
     }
     System.out.println(); // insert blank line

//PRINT ELEMENTS OF THE SECOND ARRAY
     System.out.print("Elements from the second array: ");
     for (int element2 : mySecondArray)
     {
        System.out.print(element2 + " ");
     }
     System.out.println(); // insert blank line

     mergeArrays(myFirstArray,mySecondArray);  // call the method to combine the two arrays


    }

    //METHOD TO COPY ELEMENTS
public static int[] mergeArrays(int[] firstArray, int[] addedArray)
    {
    //create new array with the size of the combined length of the two arrays to be
    int[] resultMergedArrays = Arrays.copyOf(firstArray, (firstArray.length + addedArray.length));
    for (int i = firstArray.length, j=0; i < resultMergedArrays.length; i++, j++)
        {
        resultMergedArrays[i] = addedArray[j];
        }
//PRINT ELEMENTS OF THE COMBINED ARRAY
        System.out.print("Elements from the merged array: ");
        for (int mergedElements : resultMergedArrays)
        {
            System.out.print(mergedElements + " ");
        }
        return resultMergedArrays;
    }
}
