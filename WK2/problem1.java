// Jacob Estrich - Week 2 Problem 1
// The following code sums the digit in a number
// What is its big O time?

// Create a public class for the problem1.java file.
public class problem1  
{
    // Created the main method for the class.
    public static void main(String[] args) 
    {
        // I set a random number to the variable n to get a better sense of seeing the code work and what output I should expect.
        int n = 123; 
        // This line will output the return of sum from the sumDigits method.
        System.out.println(sumDigits(n)); 
    }

    // For the actual sumDigits method, copied and pasted from the homework. This is calling the integer n variable we defined in the main method.
    public static int sumDigits(int n) 
    {
        // Initially set an integer sum variable to the integer 0.
        int sum = 0;
        // While the integer variable "n" is greater than 0, start/continue the while loop.
        while (n > 0) 
        {
            // If "n" > 0, add (n % 10) to sum. 
            sum += n % 10; 
            // If "n" > 0, n is now equal to (n/10).
            n /= 10; 
        }
        // Once n is not greater than 0, the while loop will be bipased and the method will return the total of sum. Which will be displayed by the "sysout" line in the main method. 
        return sum; 
    }
}
// The big-oh of this code is O(log n). As the code runs, it will continue to run and divide n by 10 until n is not greater than 0. I believe that this would be log10 example.
