public class SequentialSearch {
    public static void main(String[] args) {
        int[] numbers = {23, 5, 88, 14, 94, 7, 22};
        Print(numbers);
    }

    //This is defining the Print Method in the above class ^.
    //running time: O(n)
    public static void Print(int[] array) {
        for(int position=0; position<array.length ; position++){
            System.out.print(array[position]+", ");
        }
    }
    //Running time: O(n) Worst case we go through whole array. the "length" is n.
    public static int LinearSearch(int[] arr, int value){
        //Traverse the array
        for(int position=0; position<arr.length; position++){
            //check is the value of the array matches the value you are looking for at each position
            if(arr[position] == value){
                //we found the value. Now return position
                return position;
            }
        }
        //You only get to this line if the array transversal did not find the value
        //This means value is not in the arr
        return -1;
    }

    public static int LinearSearch2(int[] arr, int value){
        int ret = -1;
        //Traverse the array
        for(int position=0; position<arr.length; position++){
            //check is the value of the array matches the value you are looking for at each position
            if(arr[position] == value){
                //we found the value. Now return position
                ret = position;
                break;
            }
        }
        //You only get to this line if the array transversal did not find the value
        //This means value is not in the arr
        return ret;
    }
    //This is running time = O(log n)
    //return type = int, the postiion in the arr of the searched target value
    public static int BinarySearch(int[] arr, int target){
        int start = 0; //initially the slice is the entire array
        int end = arr.length-1;

        //as long as there is at least one element in the slice
       while(start<=end){
         int middle = (start+end)/2; //find the middle point of slice
        //check if value of array in middle is the given value
        if(arr[middle] == target){
            //found it. return the position
            return middle;
        }
        else if(arr[middle] < target){
            start = middle + 1;
        }
        else{
            end = middle - 1;
        }
       }
       //when the slice is empty (value not found) return -1
       return -1;

    }

    //return type = int, the postiion in the arr of the searched target value
    public static int BinarySearch2(int[] arr, int target){
        int ret = -1;

        int start = 0; //initially the slice is the entire array
        int end = arr.length-1;

        //as long as there is at least one element in the slice
       while(start<=end){
         int middle = (start+end)/2; //find the middle point of slice
        //check if value of array in middle is the given value
        if(arr[middle] == target){
            //found it. return the position
            ret = middle;
            break; //terminates loop
        }
        else if(arr[middle] < target){
            start = middle + 1;
        }
        else{
            end = middle - 1;
        }
       }
       //when the slice is empty (value not found) return -1
       return ret; //only one return statement

    }
}
