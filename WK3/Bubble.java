// Jacob Estrich - Week 3 Problem 1:
// Modify the bubble sort algorithm seen in class so it works with an array of strings.
// The array will also have the values sorted in reverse.
// Also add a local variable count (use long count) of the number of comparisons that were performed.
// Display this before exiting this method. Call it static void BubbleReverseSort(string[] arr)


public class Bubble 
{
    public static void main(String[] args) 
    {
        //int[] numbers = {23, 5, 3, 88, 123, 94, 3, 2, 7};
        // Display(numbers);
        // BubbleSort2(numbers);
        // Display(numbers);

        String[] wordStrings = {"allen", "c", "z", "o", "allen", "g", "b", "m", "aalphabet"};
        Display(wordStrings);
        BubbleReverseSort(wordStrings);
        Display(wordStrings);

    }

    public static void BubbleReverseSort(String[] arr)//arr the array to be sorted - O(n^2)
    {
       for(int j=0; j<arr.length-1; j++) //"n" = "arr.length"
       {
            boolean didSwap =false;
            for(int i=0; i<arr.length-1; i++)
            {
                //Still trying to understand the .compareTo method.
                //Understand that it returns an int value. 0 if the string is equal to the other string
                // less than 0 if the string is lexicorgraphically less than the other string
                // greater than zero if the string is lexi... greater thant the other string.
                //Statement is saying if index of i, when compared to index of i + 1 is greater than zero
                //Do the swap. So if i is after i + 1 alphabetically, do the swap, and so on...
                if(arr[i].compareTo(arr[i+1]) > 0) //This is sorting the strings alphabetically, changing to "<" would sort reverse alphabetically
                {
                    String tmp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                    didSwap = true; //we swapped values!!!
                }
                // if(arr[i] != arr[i+1]) //This is reversing the method for reverse alphabetically
                // {
                //     String tmp = arr[i];
                //     arr[i]=arr[i+1];
                //     arr[i+1]=tmp;
                //     didSwap = true;
                // }
            }
            
            //check if there were any swaps in this "round"/traversal
            if(!didSwap)//if no swaps then the array must be sorted - we're done
                break;
       }
    }


    public static void Display(String[] arr)
    {
        for(String num : arr) //traverses the array
        {
            System.out.print(num +", "); //display each value
        }
        System.out.println(); //move the cursor to the next line
    }
}
