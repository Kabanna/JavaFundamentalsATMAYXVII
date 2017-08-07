/**
 * 
 */
/**
 * @author annas
Having three variables of type int a, b, c display "true" 
if the sum of the values of any two of these variables is equal 
to the value of the third.
 *
 */

package ua.org.oa.anna_shevelieva.practice_1.Task8;
import java.util.Scanner;

public class SumOfTwoIntegers {

public static void main (String[] arg) {
    Scanner input = new Scanner(System.in);
	int a = 0, b = 0, c = 0;
	
	System.out.println("Enter a: ");
	a = input.nextInt();
	System.out.println("Enter b: ");
	b = input.nextInt();
	System.out.println("Enter c: ");
	c = input.nextInt();
	
		if ( (a == (b + c)) | (b == (a + c)) | (c == (a + b)) )

		System.out.println("True");
		
		else System.out.println("False");

            System.out.println();
}}