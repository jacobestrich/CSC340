// Jacob Estrich - Week 2 Problem 2
// Find an algorithm for the following problem:
// If you had 100 floors and 2 eggs, what is the most efficient way to determine what floor is the maximum height you can drop an egg and not crack it?
// If possible write the Java code to display this.
// Worst case is n^2

import java.util.Scanner;

public class problem2 
{
    public static void main(String[] args) 
    {
        int floors[] = createArray();
        DidBreak(floors);
    }

    public static int[] createArray()
    {
        // This is creating my array of floors 1 - 100
        // Creates an array of "floors" with a length of 100
        int[] floor = new int[100];

        // index "i" starts at array position 0
        // As long as "i" is less than 100, "i" will increase by 1 and increment to position 99
        for (int i = 0; i < 100; i++)
        {
            // Array floors starting at "i"(which is 0) will take in the value of "i" plus 1.
            floor[i] = i + 1;
        }
        return floor;
    }


    public static int DidBreak(int[] floors)
    {
        Scanner stdin = new Scanner(System.in);
        boolean eggBreaks = true;
        
        int start = 0;
        int end = floors.length;
        

        while(!eggBreaks)
        {
            int middle = (start + end) / 2;
            System.out.println("Did the egg break? Enter true or false");
            boolean firstSlice = stdin.nextBoolean();
            if(firstSlice != eggBreaks)
            {
                start = middle +1;
                middle = (start + end) / 2;
            }       
            else
            {
                break;
            }
            stdin.close();
            

        }
        return end;

    }

}

// I believe you would need to implement two types of algorithms for this problem.
// Due to the floors being in a sorted order, 1 through 100, you can start with a binary searching algorithm.
// This binary algorithm would splice the floor array to find the middle, which would be floor 50.
// The first egg would be dropped at floor 50. If the egg breaks, you would then have to start at floor position 0, which is floor 1.
// You would then do a linear or sequential searching algorithm to determine what floor the second egg would break in.
// If the first egg does not break at floor 50, you would then repeate the binary algorithm  to find the middle between floors 50 through 100 which is 75.
// This process would continue until the first egg breaks. Where the first egg breaks, you will have to switch to a sequential algorithm to iterate the remaining floors to find the break floor.



