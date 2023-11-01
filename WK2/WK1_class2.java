public class WK1_class2 
{
    public static void main(String[] args) 
    {
        int[] numbers = {23, 5, 88, 123, 94, 3, 2, 7};
        Display(numbers);
        //BubbleSort(numbers);
        //BubbleSort2(numbers);
        //BubbleSort3(numbers);
        //Display(numbers);
        SelectionSort(numbers);
        Display(numbers);
    }  

    //the best is O(n^2)
    public static void BubbleSort(int[] arr)//arr the array to be sorted
    {
        for(int j=0; j<arr.length-1; j++)//The end is really n-2 
        {
            for(int i=0; i<arr.length-1; i++) //"n" = "arr.length"
            {
                if(arr[i] > arr[i+1]) //check if two adjacent values need to be swapped
                {
                    int temp = arr[i];
                    arr[1] = arr[i+1];
                    arr[i+1] = temp;
                }

            }
        }
    }
    //the best is O(n^2)
    public static void BubbleSort2(int[] arr)//arr the array to be sorted
    {
        for(int j=0; j<arr.length-1-j; j++)//The end is really n-2 
        {
            for(int i=0; i<arr.length-1; j++) //"n" = "arr.length"
            {
                if(arr[i] > arr[i+1]) //check if two adjacent values need to be swapped
                {
                    int temp = arr[i];
                    arr[1] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    //the best is O(n), big Omega. The worst is O(n^2)
    public static void BubbleSort3(int[] arr)//arr the array to be sorted
    {
        for(int j=0; j<arr.length-1; j++)//The end is really n-2 
        {
            boolean didSwap = false;
            for(int i=0; i<arr.length-1-j; i++) //"n" = "arr.length"
            {
                if(arr[i] > arr[i+1]) //check if two adjacent values need to be swapped
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    didSwap = true; //we swapped values!
                }
            }
            //check if there were any swaps this "round or traversal"
            if(!didSwap) //if no swaps then the array must be sorted. we break out
                break; 
        }
    }


    public static void Display(int[] arr)
    {
        for(int num : arr) //traverses the array
        {
            System.out.print(num + ", "); //display each value from array
        }
        System.out.println(); //move the cursor to the next line
    }


    //running time O(n^2)
    public static void SelectionSort(int[] arr)
    {
        for(int j = 0; j<arr.length-1; j++)
        {
            //search for smallest value to position 0 till end of array
            int min_pos = j; // establish first postion

            for(int i = j + 1; i<arr.length; i++)
            {
                if(arr[i] < arr[min_pos])//did we find something smaller? You can change this to > to reverse it to largest to smallest
                {
                    min_pos = i; //save it's position
                }
            }
            //swap the elements at positions 0 and min_position
            int tmp = arr[j];
            arr[j] = arr[min_pos];
            arr[min_pos] = tmp;
        }
    }

    public static void MergeSort(int[] arr) //running time is O(n log n)
    {
        MergeSortHelper(arr, 0, arr.length-1);

    }

    public static void MergeSortHelper(int[] arr, int startIdx, int endIdx) //running time is O(n log n)
    {
        //if the slice has at least two elements
        if(startIdx<endIdx)
        {
            int midIdx = (startIdx + endIdx) / 2;
            MergeSortHelper(arr, startIdx, midIdx);//sort the first half of this slice
            MergeSortHelper(arr, midIdx+1, endIdx);//sort the second half of this slice
            Merge(arr, startIdx, midIdx, endIdx);//merge the two halves back into one slice

        }

    }

    public static void Merge(int[] arr, int startIdx, int midIdx, int endIdx)
    {
        int[] tmp = new int[arr.length];
        int i = startIdx; 
        int j = midIdx + 1;
        int k = startIdx;

        while(i<=midIdx && j<endIdx)
        {
            if(arr[i]<arr[j])
            {
                tmp[k] = arr[i];
                i++;
                k++;
            }
            else
            {
                tmp[k] = arr[j];
                j++;
                k++;
            }
        }

        //copy the leftover
        while(i<=midIdx)
        {
            tmp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=endIdx)
        {
            tmp[k] = arr[j];
            j++;
            k++;
        }

        //push back values from tmp into array
        for(k = startIdx; k<=endIdx; k++)
        {
            arr[k] = tmp[k];
        }

    }

}

    