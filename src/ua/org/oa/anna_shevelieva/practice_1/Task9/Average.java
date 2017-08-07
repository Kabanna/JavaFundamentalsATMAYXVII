/**
 * 
 */
/**
 * @author annas
 *Task: Two variables of type int, have positive values 
 *int a is the beginning of the range, 
 *int b - the end of the range, a> b. 
 *Calculate the average value of numbers in a given range.
 */
package ua.org.oa.anna_shevelieva.practice_1.Task9;
import java.util.Scanner; 

public class Average 
{ 
   public static void main(String[] args) 
   { 
	   	int i;
		int a; // Start of range
		int b; // End of range
		int sum = 0;
		double average = 0;
		double loopCount = 0;
				
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Start number: "); // keep print line open
		a = in.nextInt();
		
		System.out.print("Enter End number: ");
		b = in.nextInt();
		
		loopCount = a - b;

        //enter value
        for (i = a; i > b; i-- )
        {
        	sum = sum + i;
        }
        average = sum/loopCount;
        
        System.out.format("Average is:  %.3f Sum is: %d\n", average, sum);
   }
}